package org.shahani.ddb.logic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.shahani.ddb.db.DatabaseConnection;

public class DeleteDriver {
	private int id ;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String execute(){
		Connection connection = DatabaseConnection.getConnection();
		try{
			String deleteQuery = "DELETE FROM driver WHERE id=?" ;
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
}
