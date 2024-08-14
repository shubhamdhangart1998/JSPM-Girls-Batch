package com.tnsif.daysixteen.jdbcoperationsdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCProject {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/niranjan","root","");
		Statement stmt=conn.createStatement();
		PreparedStatement psmt=null;
		ResultSet rs=null;
		int id=0;
		String name="";
		String subject="";
		String ch="";
		double duration=0.0;
		do {
			System.out.println("======================DATABASE OPERARTIONS=============================");
			System.out.println("1. Insert");
			System.out.println("2. Delete");
			System.out.println("3. Update");
			System.out.println("4. View all Record in the table");
			System.out.println("5. View Record by id");
			System.out.println("6. Order by Subject");
			System.out.println("7. Group by Name");
			System.out.println("8. Subject Like");
			System.out.println("________________*****---------------------*****_______________");
			System.out.println("Enter your choice");
			int choise=sc.nextInt();
			
			switch(choise) {
			case 1:{
				System.out.println("Enter the Student Id: ");
				id=sc.nextInt();
				System.out.println("Enter the Student name: ");
				name=sc.next();
				System.out.println("Enter the Subject: ");
				subject=sc.next();
				System.out.println("Enter the course duration: ");
				duration=sc.nextDouble();
				psmt=conn.prepareStatement("insert into student values(?,?,?,?)");
				psmt.setInt(1,id);
				psmt.setString(2, name);
				psmt.setString(3, subject);
				psmt.setDouble(4, duration);
				int row =psmt.executeUpdate();
				System.out.println(row+" row affected");
			}break;
			
			case 2:{
				System.out.println("Enter the Student Id");
				id=sc.nextInt();
				psmt=conn.prepareStatement("delete from student where stdid=?");
				psmt.setInt(1, id);
				int row=psmt.executeUpdate();
				System.out.println(row+" row affected");
			}break;
			
			case 3:{
				System.out.println("Enter the id: ");
				id=sc.nextInt();
				System.out.println("Enter the subject for upadate: ");
				subject=sc.next();
				psmt=conn.prepareStatement("update student set subject=? where stdid=?");
			
				psmt.setString(1, subject);
				psmt.setInt(2, id);
				
				int row = psmt.executeUpdate();
				System.out.println(row+" row affected");
			}break;
			
			case 4:{
				psmt=conn.prepareStatement("select * from student");
				rs=psmt.executeQuery();
				System.out.println("id\tname\tsubject\tduration");
				while(rs.next()) {
					System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+
				rs.getString(3)+"\t"+rs.getDouble(4));
				}
			}break;
			
			case 5:{
				System.out.println("Enter the id: ");
				id=sc.nextInt();
				psmt=conn.prepareStatement("select * from student where stdid=?");
				psmt.setInt(1, id);
				rs=psmt.executeQuery();
				System.out.println("id\tname\tsubject\tduration");
				while(rs.next()) {
					System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+
				rs.getString(3)+"\t"+rs.getDouble(4));
				}
			}break;
			
			case 6:{
				psmt=conn.prepareStatement("select * from student order by subject");
				rs=psmt.executeQuery();
				System.out.println("id\tname\tsubject\tduration");
				while(rs.next()) {
					System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+
				rs.getString(3)+"\t"+rs.getDouble(4));
				}
			}break;
			
			case 7:{
				psmt=conn.prepareStatement("select * from student group by name");
				rs=psmt.executeQuery();
				System.out.println("id\tname\tsubject\tduration");
				while(rs.next()) {
					System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+
				rs.getString(3)+"\t"+rs.getDouble(4));
				}
			}break;
			case 8:{
				System.out.println("Enter the name: ");
				String subject1=sc.next();
				 psmt = conn.prepareStatement("select * from student where subject like ?");
				psmt.setString(1, "%" + subject1 + "%");
				ResultSet rs1 = psmt.executeQuery();
				
				//psmt=conn.prepareStatement("select * from student where subject like '%java'");
			//	rs=psmt.executeQuery();
				System.out.println("id\tname\tsubject\n duration");
				while(rs1.next())
					System.out.println(rs1.getInt(1)+"\t"+rs1.getString(2)+"\t"+rs1.getString(3)+"\t"+rs1.getDouble(4));
	
			}
			break;
			default:
				throw new IllegalArgumentException("Unexpected valuel:"+choise);
		}
			System.out.println("Do you want to  continue..(Y/y)");
			ch=sc.next();
		}
		while(ch.equalsIgnoreCase("y"));
		System.out.println("thank you..!");
	 
	}

}
