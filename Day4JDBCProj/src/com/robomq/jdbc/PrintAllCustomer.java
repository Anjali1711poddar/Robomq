package com.robomq.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class PrintAllCustomer {
	Connection con;
	PreparedStatement pre;
	Statement stat;
	ResultSet res;
	String Fname;
	String Lname;
	int Id;
	String Address;
	String EmailId;
	
	
	public PrintAllCustomer() {
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

	public void printCustomerDetails()
	{
		try
		{
			stat=con.createStatement();
			res=stat.executeQuery("select * from customer1");
			while(res.next())
			{
				System.out.println("Fname : "+res.getString("Fname"));
				System.out.println("Lname : "+res.getString("Lname"));
				System.out.println("Id : "+res.getInt("Id"));
				System.out.println("EmailId : "+res.getString("EmailId"));
				System.out.println("Address : "+res.getString("Address"));
				
				System.out.println("");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		PrintAllCustomer data = new PrintAllCustomer();
		data.printCustomerDetails();
	

	}

}
