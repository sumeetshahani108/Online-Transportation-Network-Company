package org.shahani.ddb.logic;

import java.sql.*;

import org.shahani.ddb.db.DatabaseConnection;

public class LocationDelete {
	private int id;

	public String execute(){
		Connection connection = DatabaseConnection.getConnection();
		try{
			String deleteQuery = "DELETE FROM location WHERE id=?" ;
			
			PreparedStatement ps = connection.prepareStatement(deleteQuery);
			ps.setInt(1, getId());
			
			ps.executeQuery();
			ps.close();
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
	
}
