package com.robomq.jdbc;


	
	import java.sql.CallableStatement;
	import java.sql.Connection;
    import java.sql.DriverManager;
   import java.util.Scanner;

     public class CustomerTable {
	

      public static void main(String[] args) {
           try
	        	{
				
	Class.forName("com.mysql.jdbc.Driver");
							
				
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root", "Anjali@17");
	System.out.println("Database Connected....");
				
				
CallableStatement stat=con.prepareCall("create table customer1(Fname varchar(50),Lname varchar(50),Id int(10),Emailid varchar(50),Address varchar(40))");
				
		boolean result=stat.execute();
			if(!result)
					System.out.println("Table Created....");
				else
					System.out.println("Table Not Created....");
					
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		
    
    	

System.out.println("enter ur choice for excute any operations \n 1. for insertion \n "
		+ "2.for updation  \n 3. for Deletion \n 4. printAll \n 5.exit from application");

Scanner scan = new Scanner(System.in);
int ch=scan.nextInt();


    switch(ch)
    {
    
     case 1:
    	System.out.println("Adding elements into table");
    	AddData data=new AddData();
		data.insert();
    	break;
    
     case 2:
    	System.out.println("Updation elements into table");
    	UpdateCustomer data4 = new UpdateCustomer();
   	     data4.UpdateCustomerDetails();
   	     
      break;
    	
    	
     case 3:
    	System.out.println("Deletion elements into table");
    	DeleteCustomer data2=new DeleteCustomer(); 
    	data2.deleteCustomerDetails();
    	break;
    
      case 4:
	  System.out.println("PrintAll elements into table");
	  PrintAllCustomer data3 = new PrintAllCustomer(); 
		 data3.printCustomerDetails();
	  break;
	
      case 5:
	   System.out.println("exit from Application");
	   break;
	
	
    }
}
}