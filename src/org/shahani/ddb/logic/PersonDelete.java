package org.shahani.ddb.logic;

import java.sql.*;

import org.shahani.ddb.db.DatabaseConnection;

public class PersonDelete {
	
	private int id ;
	private String email ;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String execute(){
		Connection connection = DatabaseConnection.getConnection();
		try{
			String deleteQuery = "DELETE FROM person WHERE id=?" ;
			String confirmEmail = "SELECT email from person WHERE id=? " ;
			
			String email = "";
			
			PreparedStatement ps = connection.prepareStatement(confirmEmail);
			ps.setInt(1, getId());
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				email = rs.getString("email");
				rs.close();
			}
			
			if(email.equalsIgnoreCase(getEmail())){
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
}
