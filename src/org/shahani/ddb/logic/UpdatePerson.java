package org.shahani.ddb.logic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.shahani.ddb.db.DatabaseConnection;

public class UpdatePerson {

	private String first_name; 
	private String last_name;
	private int location;
	private String city;
	
	public String execute(){
		Connection connection = DatabaseConnection.getConnection();
		try{
			String updateQuery = "UPDATE PERSON SET city=?,location_id=? WHERE first_name=? AND last_name=?" ;
			PreparedStatement ps = connection.prepareStatement(updateQuery);
			ps.setString(1, getCity());
			ps.setInt(2, getLocation());
			ps.setString(3, getFirst_name());
			ps.setString(4, getLast_name());
			ps.executeUpdate();
			ps.close();
			connection.commit();
		}catch(SQLException e){
			e.printStackTrace();
			return "failure";
		}catch(Exception e){
			e.printStackTrace();
			return "failure";
		}
		return "success" ;
	}
	
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public int getLocation() {
		return location;
	}
	public void setLocation(int location) {
		this.location = location;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}


}
