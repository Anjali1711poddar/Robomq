package com.robomq.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class UpdateCustomer {

	
	Connection con;
	PreparedStatement pre;
	Statement stat;
	ResultSet res;
	String Fname;
	String Lname;
	int Id;
	String Address;
	String EmailId;
	
	public UpdateCustomer() {
	
		
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root", "Anjali@17");
			System.out.println("Database Connected....");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}

	
	public void UpdateCustomerDetails()
	{
		
		try
		{
			pre = con.prepareStatement("update customer1 set Fname=? where Id=?");
			pre.setString(1, "Anirudh");
			pre.setInt(2,73);
			int ra=pre.executeUpdate();
			if(ra>0)
				System.out.println("Name updated for Id");
			else
				System.out.println("Name is not updated..");
			pre.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	/*
	 * public static void main(String[] args) {
	 * 
	 * UpdateCustomer data=new UpdateCustomer();
	 * 
	 * data. UpdateCustomer1();
	 * 
	 * System.out.println("=======================================================")
	 * ;
	 * 
	 * }
	 */
	
}


