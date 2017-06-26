package org.shahani.ddb.logic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.shahani.ddb.db.DatabaseConnection;

public class UpdateLocation {

	private int latitude;
	private int longitude;
	private int id;
	
	public String execute(){
		Connection connection = DatabaseConnection.getConnection();
		try{
			String updateQuery = "UPDATE DRIVER SET latitude=?,longitude=? WHERE id=?" ;
			PreparedStatement ps = connection.prepareStatement(updateQuery);
			ps.setInt(1, getLatitude());
			ps.setInt(2, getLongitude());
			ps.setInt(3, getId());
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
