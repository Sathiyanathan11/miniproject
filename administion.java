package mini;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class administion {
	public Connection getconn() {
		Connection con = null;
		try {
			String url = "jdbc:mysql://localhost:3306/sathiya";
			String username = "root";
			String pass = "root";
			con = DriverManager.getConnection(url, username, pass);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	BufferedReader sc1 = new BufferedReader(new InputStreamReader(System.in));

	public void Mechanical() throws SQLException, IOException {
		System.out.println("welcome to akka University");
		System.out.println("***Please enter User details***");
		Connection con = getconn();
		String s1 = "insert into Mechanical(Name,Number,Mark,district,Aadhar_number,Father_name,Mother_name) values(?,?,?,?,?,?,?)";
		PreparedStatement stmt = con.prepareStatement(s1);
		
		System.out.println("Enter Student Name:");
        String name =sc1.readLine();
        System.out.println("enter father_name: ");
        String father_name = sc1.readLine();
        System.out.println("Enter User mother_name:");
        String mother_name =sc1.readLine();
        System.out.println("Enter address: ");
        String address = sc1.readLine();
        
        System.out.println("Enter Student number:");
       String num =sc1.readLine();
      
        System.out.println("Enter 12th mark:");
        String mark =sc1.readLine();
     
        
        System.out.println("Enter User Aadhar number:");
        String aadhar =sc1.readLine();
      
        
       
  stmt.setString(1,name);
  stmt.setString(2, num);
  stmt.setString(3,mark);
  stmt.setString(4,address);
  stmt.setString(5,aadhar);
  stmt.setString(6, father_name);
  stmt.setString(7, mother_name);

  
  int aa = stmt.executeUpdate();
  System.out.println("***private Akka Univeristy***");
  System.out.println("Name=" +name);
  System.out.println("****MECHANICAL ENGINEERING****");
  System.out.println("collage address : akka univeristy ,Akka collage Road, chennai,Tamilnadu");
 System.out.println("***Engineering likes to solve problem ***");
	
	}

	public void ECE() throws SQLException, IOException {
		System.out.println("welcome to akka University");
		System.out.println("***Please enter User details***");
		Connection con = getconn();
		String s1 = "insert into ece(Name,Number,Mark,district,Aadhar_number,Father_name,Mother_name) values(?,?,?,?,?,?,?)";
		PreparedStatement stmt = con.prepareStatement(s1);
		
		System.out.println("Enter Student Name:");
        String name =sc1.readLine();
        System.out.println("enter father_name: ");
        String father_name = sc1.readLine();
        System.out.println("Enter User mother_name:");
        String mother_name =sc1.readLine();
        System.out.println("Enter address: ");
        String address = sc1.readLine();
        
        System.out.println("Enter Student number:");
       String num =sc1.readLine();
      
        System.out.println("Enter 12th mark:");
        String mark =sc1.readLine();
     
        
        System.out.println("Enter User Aadhar number:");
        String aadhar =sc1.readLine();
      
        
       
  stmt.setString(1,name);
  stmt.setString(2, num);
  stmt.setString(3,mark);
  stmt.setString(4,address);
  stmt.setString(5,aadhar);
  stmt.setString(6, father_name);
  stmt.setString(7, mother_name);

  
  int aa = stmt.executeUpdate();
  System.out.println("***private Akka Univeristy***");
  System.out.println("Name=" +name);
  System.out.println("DEPARTMENT = Electronics and Communications ENGINEERING");
  System.out.println("collage address : akka univeristy ,Akka collage Road, chennai,Tamilnadu");
 System.out.println("***Engineering likes to solve problem ***");
	
	}
	public void eee() throws SQLException, IOException {
		System.out.println("welcome to akka University");
		System.out.println("***Please enter User details***");
		Connection con = getconn();
		String s1 = "insert into eee(Name,Number,Mark,district,Aadhar_number,Father_name,Mother_name) values(?,?,?,?,?,?,?)";
		PreparedStatement stmt = con.prepareStatement(s1);
		
		System.out.println("Enter Student Name:");
        String name =sc1.readLine();
        System.out.println("enter father_name: ");
        String father_name = sc1.readLine();
        System.out.println("Enter User mother_name:");
        String mother_name =sc1.readLine();
        System.out.println("Enter address: ");
        String address = sc1.readLine();
        
        System.out.println("Enter Student number:");
       String num =sc1.readLine();
      
        System.out.println("Enter 12th mark:");
        String mark =sc1.readLine();
     
        
        System.out.println("Enter User Aadhar number:");
        String aadhar =sc1.readLine();
      
        
       
  stmt.setString(1,name);
  stmt.setString(2, num);
  stmt.setString(3,mark);
  stmt.setString(4,address);
  stmt.setString(5,aadhar);
  stmt.setString(6, father_name);
  stmt.setString(7, mother_name);

  
  int aa = stmt.executeUpdate();
  System.out.println("***private Akka Univeristy***");
  System.out.println("Name=" +name);
  System.out.println("DEPARTMENT =Electrical and Electronic ENGINEERING");
  System.out.println("collage address : akka univeristy ,Akka collage Road, chennai,Tamilnadu");
 System.out.println("***Engineering likes to solve problem ***");
	
	}
	public void cse() throws SQLException, IOException {
		System.out.println("welcome to akka University");
		System.out.println("***Please enter User details***");
		Connection con = getconn();
		String s1 = "insert into cse(Name,Number,Mark,district,Aadhar_number,Father_name,Mother_name) values(?,?,?,?,?,?,?)";
		PreparedStatement stmt = con.prepareStatement(s1);
		
		System.out.println("Enter Student Name:");
        String name =sc1.readLine();
        System.out.println("enter father_name: ");
        String father_name = sc1.readLine();
        System.out.println("Enter User mother_name:");
        String mother_name =sc1.readLine();
        System.out.println("Enter address: ");
        String address = sc1.readLine();
        
        System.out.println("Enter Student number:");
       String num =sc1.readLine();
      
        System.out.println("Enter 12th mark:");
        String mark =sc1.readLine();
     
        
        System.out.println("Enter User Aadhar number:");
        String aadhar =sc1.readLine();
      
        
       
  stmt.setString(1,name);
  stmt.setString(2, num);
  stmt.setString(3,mark);
  stmt.setString(4,address);
  stmt.setString(5,aadhar);
  stmt.setString(6, father_name);
  stmt.setString(7, mother_name);

  
  int aa = stmt.executeUpdate();
  System.out.println("***private Akka Univeristy***");
  System.out.println("Name=" +name);
  System.out.println("DEPARTMENT = computer science ENGINEERING");
  System.out.println("collage address : akka univeristy ,Akka collage Road, chennai,Tamilnadu");
 System.out.println("***Engineering likes to solve problem ***");
	
	}
	public void IT() throws SQLException, IOException {
		System.out.println("welcome to akka University");
		System.out.println("***Please enter User details***");
		Connection con = getconn();
		String s1 = "insert into it(Name,Number,Mark,district,Aadhar_number,Father_name,Mother_name) values(?,?,?,?,?,?,?)";
		PreparedStatement stmt = con.prepareStatement(s1);
		
		System.out.println("Enter Student Name:");
        String name =sc1.readLine();
        System.out.println("enter father_name: ");
        String father_name = sc1.readLine();
        System.out.println("Enter User mother_name:");
        String mother_name =sc1.readLine();
        System.out.println("Enter address: ");
        String address = sc1.readLine();
        
        System.out.println("Enter Student number:");
       String num =sc1.readLine();
      
        System.out.println("Enter 12th mark:");
        String mark =sc1.readLine();
     
        
        System.out.println("Enter User Aadhar number:");
        String aadhar =sc1.readLine();
      
        
       
  stmt.setString(1,name);
  stmt.setString(2, num);
  stmt.setString(3,mark);
  stmt.setString(4,address);
  stmt.setString(5,aadhar);
  stmt.setString(6, father_name);
  stmt.setString(7, mother_name);

  
  int aa = stmt.executeUpdate();
  System.out.println("***private Akka Univeristy***");
  System.out.println("Name=" +name);
  System.out.println("DEPARTMENT = Information Techonlgy");
  System.out.println("collage address : akka univeristy ,Akka collage Road, chennai,Tamilnadu");
 System.out.println("***Engineering likes to solve problem ***");
	
	}

}