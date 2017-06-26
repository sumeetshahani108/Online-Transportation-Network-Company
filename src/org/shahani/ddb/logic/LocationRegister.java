package org.shahani.ddb.logic;

import java.sql.*;

import org.shahani.ddb.db.DatabaseConnection;

public class LocationRegister {
	private int latitude;
	private int longitude;
	
	public String execute(){
		Connection connection = DatabaseConnection.getConnection(); 
		try{
			String insertQuery = "INSERT INTO location(id,latitude,longitude) VALUES(location_seq.nextval,?,?)" ;
			String generatedColums[] = {"id"};
			
			PreparedStatement ps = connection.prepareStatement(insertQuery, generatedColums);
			ps.setInt(1, getLatitude());
			ps.setInt(2, getLongitude());
			ps.executeQuery();
			
			ResultSet tablekeys = ps.getGeneratedKeys();
			tablekeys.next();
			int autoGeneratedId = tablekeys.getInt(1);
			
			System.out.println(autoGeneratedId);
			
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