package org.shahani.ddb.logic;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import org.apache.struts2.ServletActionContext;
import org.shahani.ddb.db.DatabaseConnection;

public class QueryFifth {
	private int latitude ;
	private int longitude ;
	
	public void execute() throws IOException{
		Connection connection = DatabaseConnection.getConnection(); 
		PrintWriter out = ServletActionContext.getResponse().getWriter();
		out.print("<html><body><table border=1 align='center'><tr><td>ID</td><td>First Name</td><td>Last Name</td><td>Email ID</td><td>Contact No</td></tr>");
		try{
			int  lat = getLatitude() ;
			int longi = getLongitude() ;
			String selectQuery = "SELECT d.id, d.first_name, d.last_name, d.email_id, d.contact_number FROM driver d INNER JOIN location l ON d.location_id = l.id WHERE l.latitude = "  + lat + "AND l.longitude = " + longi ;
			PreparedStatement pstmt = connection.prepareStatement(selectQuery);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()){
				int id = rs.getInt("id");
				String first_name = rs.getString("first_name");
				String last_name = rs.getString("last_name");
				String email = rs.getString("email_id");
				String contact = rs.getString("contact_number");
				 out.print("<tr><td>");
				 out.print(id);
				 out.print("</td><td>");
				 out.print(first_name);
				 out.print("</td><td>");
				 out.print(last_name);
				 out.print("</td><td>");
				 out.print(email);
				 out.print("</td><td>");
				 out.print(contact);
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

	public int getLatitude() {
		return latitude;
	}

	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}

	public int getLongitude() {
		return longitude;
	}

	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}
}
