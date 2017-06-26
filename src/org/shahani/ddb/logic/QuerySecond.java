package org.shahani.ddb.logic;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import org.apache.struts2.ServletActionContext;
import org.shahani.ddb.db.DatabaseConnection;
public class QuerySecond {
	public void execute() throws IOException{
		Connection connection = DatabaseConnection.getConnection(); 
		PrintWriter out = ServletActionContext.getResponse().getWriter();
		out.print("<html><body><table border=1 align='center'><tr><td>ID</td><td>Start Location</td><td>End Location12345</td><td>Payment Mode Id</td><td>Person Id</td><td>Driver Id</td></tr>");
		try{
			//connection.prepareStatement("CREATE DATABASE LINK lo3 CONNECT TO nikhil IDENTIFIED BY vatwani USING 'XE'").executeQuery();
			String selectQuery = "select * from journey@lo3 UNION select * from journey@lo2" ;
			PreparedStatement pstmt = connection.prepareStatement(selectQuery);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()){
				int id = rs.getInt("id");
				String start_location = rs.getString("start_location");
				String end_location = rs.getString("end_location");
				int payment_mode_id  = rs.getInt("payment_mode_id");
				int person_id = rs.getInt("person_id");
				int driver_id = rs.getInt("driver_id");
				
				 out.print("<tr><td>");
				 out.print(id);
				 out.print("</td><td>");
				 out.print(start_location);
				 out.print("</td><td>");
				 out.print(end_location);
				 out.print("</td><td>");
				 out.print(payment_mode_id);
				 out.print("</td><td>");
				 out.print(person_id);
				 out.print("</td><td>");
				 out.print(driver_id);
				 out.print("</td></tr>");
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
