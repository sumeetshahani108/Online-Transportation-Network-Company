package org.shahani.ddb.logic;

//import java.sql.*;

//import org.shahani.ddb.db.DatabaseConnection;

public class login {
	private String email;
	private String password;
	
	public String execute(){
		/*Connection connection = DatabaseConnection.getConnection();
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
		}*/
		if(email.equals("nikhil")&&password.equals("nikhil")){
			
		}
		return "success" ;
	}
	
	
}
