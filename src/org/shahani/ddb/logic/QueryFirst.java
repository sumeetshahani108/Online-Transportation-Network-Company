package org.shahani.ddb.logic;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import org.apache.struts2.ServletActionContext;
import org.shahani.ddb.db.DatabaseConnection;

public class QueryFirst {
	
	private String mode_of_payment ;

	public void execute() throws IOException{
		Connection connection = DatabaseConnection.getConnection(); 
		PrintWriter out = ServletActionContext.getResponse().getWriter();
		out.print("<html><body><table border=1 align='center'><tr><td>ID</td><td>Start Location</td><td>End Location</td></tr>");
		try{
			String mode = getMode_of_payment() ;
			String selectQuery = "SELECT j.id, j.start_location, j.end_location FROM journey j INNER JOIN payment_mode p ON j.payment_mode_id = p.id WHERE p.mode_of_payment = '" + mode + "'" ;
			PreparedStatement pstmt = connection.prepareStatement(selectQuery);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()){
				int id = rs.getInt("id");
				String start_location = rs.getString("start_location");
				String end_location = rs.getString("end_location");
				 out.print("<tr><td>");
				 out.print(id);
				 out.print("</td><td>");
				 out.print(start_location);
				 out.print("</td><td>");
				 out.print(end_location);
				 out.print("</td></tr>");
			}
			
			out.print("</table></body></html>");
			rs.close();
			pstmt.close();
			connection.commit();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	public String getMode_of_payment() {
		return mode_of_payment;
	}

	public void setMode_of_payment(String mode_of_payment) {
		this.mode_of_payment = mode_of_payment;
	}
}
