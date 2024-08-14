package com.tnsif.daysixteen.jdbcoperationsdemo;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.Statement;

public class ResultSet {

	public static void main(String[] args) {

try {
			
			//step 1: load or register the driver
			
			
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver is load successfully");
			
			//step 2: create connection bet java nad sql
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jspmgirls","root","root");
			System.out.println("Connection created successfully");
			
			
			//step 3: create a statement object
			
			Statement stmt=con.createStatement();
			System.out.println("Statement create successfully");
			
			//step 4: result set object
			
			java.sql.ResultSet rs= stmt.executeQuery("select * from student");
			System.out.println("Stdid\t Name \t Subjects \t Duration ");
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getDouble(4));
			}
			
			
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	}

	

