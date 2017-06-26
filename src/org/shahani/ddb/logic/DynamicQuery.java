package org.shahani.ddb.logic;

import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.catalina.User;
import org.shahani.ddb.db.*;
import java.util.*;
public class DynamicQuery {
	
	ArrayList<Journey> list=new ArrayList<Journey>();  
	  
	public ArrayList<Journey> getList() {  
	    return list;  
	}  
	public void setList(ArrayList<Journey> list) {  
	    this.list = list;  
	}  
	public  String dQuery;
	public  String execute() throws IOException{
		Connection connection = DatabaseConnection.getConnection();
		try{
		String updateQuery = getdQuery();
			PreparedStatement ps = connection.prepareStatement(updateQuery);
			System.out.println(getdQuery());
			
			ResultSet rs=ps.executeQuery();  
			  
			  while(rs.next()){  
				  Journey journey=new Journey();  
				  journey.setId(rs.getInt(1));  
				  journey.setName(rs.getString(2));  
				  System.out.println("---"+rs.getString(2));
				  journey.setAddress(rs.getString(3));
				  journey.setBid(rs.getInt(4));  
				  journey.setPhone_no(rs.getLong(5));  
			   list.add(journey);  
			  }  
			rs.close();
			ps.close();
		//	ps.executeUpdate();
		//	ps.close();
			connection.commit();
		}catch(SQLException e){
			e.printStackTrace();
			return "success";
		}catch(Exception e){
			e.printStackTrace();
			return "success";
		}
		return "success" ;
	}
	public String getdQuery() {
		return dQuery;
	}
	public void setdQuery(String dQuery) {
		this.dQuery = dQuery;
	}
	
	
}
