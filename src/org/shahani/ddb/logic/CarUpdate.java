package org.shahani.ddb.logic;

import java.sql.*;

import org.shahani.ddb.db.DatabaseConnection;

public class CarUpdate {
	private String car_category;
	private int id;
	
	public String execute(){
		Connection connection = DatabaseConnection.getConnection();
		try{
			String updateQuery = "UPDATE CAR SET car_category=? WHERE id=?" ;
			PreparedStatement ps = connection.prepareStatement(updateQuery);
			ps.setString(1,getCar_category());
			ps.setInt(2,getId());
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
	
	public String getCar_category() {
		return car_category;
	}
	public void setCar_category(String car_category) {
		this.car_category = car_category;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
