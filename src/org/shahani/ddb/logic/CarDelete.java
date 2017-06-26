package org.shahani.ddb.logic;

import java.sql.*;

import org.shahani.ddb.db.DatabaseConnection;

public class CarDelete {
	private int id;
	private String car_category;
	
	public String execute(){
		Connection connection = DatabaseConnection.getConnection();
		try{
			String deleteQuery = "DELETE FROM car WHERE id=?" ;
			String confirmCarCategory = "SELECT car_category from person WHERE id=? " ;
			
			String car_category = "";
			
			PreparedStatement ps = connection.prepareStatement(confirmCarCategory);
			ps.setInt(1, getId());
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				car_category = rs.getString("car_category");
				rs.close();
			}
			
			if(car_category.equalsIgnoreCase(getCar_category())){
				PreparedStatement psa = connection.prepareStatement(deleteQuery);
				psa.setInt(1, getId());
				psa.executeQuery();
			}
			connection.commit();
		}catch(SQLException e){
			e.printStackTrace();
			return "failure";
		}
		return "success";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCar_category() {
		return car_category;
	}
	public void setCar_category(String car_category) {
		this.car_category = car_category;
	}
	
}
