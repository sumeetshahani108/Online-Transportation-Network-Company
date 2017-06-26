package org.shahani.ddb.logic;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import org.apache.struts2.ServletActionContext;
import org.shahani.ddb.db.DatabaseConnection;

public class QueryFourth {
	private String start_location ;
	
	public void execute() throws IOException{
		Connection connection = DatabaseConnection.getConnection(); 
		PrintWriter out = ServletActionContext.getResponse().getWriter();
		out.print("<html><body><table border=1 align='center'><tr><td>ID</td><td>Start Location</td><td>End Location</td></tr>");
		try{
			String start_location = getStart_location() ;
			String selectQuery = "SELECT DISTINCT d.id, d.first_name, d.last_name, d.email_id FROM driver d INNER JOIN journey j ON d.id = j.driver_id WHERE j.start_location = '" + start_location + "'" ;
			PreparedStatement pstmt = connection.prepareStatement(selectQuery);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()){
				int id = rs.getInt("id");
				String first_name = rs.getString("first_name");
				String last_name = rs.getString("last_name");
				String email = rs.getString("email_id");
				 out.print("<tr><td>");
				 out.print(id);
				 out.print("</td><td>");
				 out.print(first_name);
				 out.print("</td><td>");
				 out.print(last_name);
				 out.print("</td><td>");
				 out.print(email);
				 out.print("</td><td>");
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

	public String getStart_location() {
		return start_location;
	}

	public void setStart_location(String start_location) {
		this.start_location = start_location;
	}
}
