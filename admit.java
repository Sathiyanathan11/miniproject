package mini;

import java.util.Scanner;

import my.booking;

import java.io.IOException;
import java.sql.*;

public class admit {
	public static void main(String[] args) throws SQLException, IOException {
		String p = "y";
		String s = "y";
		String usern, passw;
		outer: while (p.equals("y")) {

			Scanner sc1 = new Scanner(System.in);
			System.out.println("........weclome to AKKA university............");
			System.out.println("Please Enter The Login Details:");

			System.out.println("Enter Admin name: ");
			usern = sc1.nextLine();
			System.out.println("Enter Admin password: ");
			passw = sc1.nextLine();

			if (usern.equals("sathiya") && passw.equals("sathiya@143")) {
				System.out.println("login succefully");

				while (s.equals("y")) {

					System.out.println("enter your engineering cutoff mark");
					Scanner scq = new Scanner(System.in);
					int cutoff = scq.nextInt();

					if (150 <= cutoff && cutoff <= 200) {
						System.out.println("press 1101 to choose MECHANICAL");
						System.out.println("press 2101 to choose ECS");
						System.out.println("press 3101 to choose EEE");
						System.out.println("press 4101 to choose IT");
						System.out.println("press 5101 to choose CSE");
					}
					if (100 <= cutoff && cutoff < 150) {
						System.out.println("press 1101 to choose MECHANICAL");
						System.out.println("press 2101 to choose ECS");
						System.out.println("press 3101 to choose EEE");
						System.out.println("press 101 to choose EXIT");
					}
					if (80 <= cutoff && cutoff < 100) {
						System.out.println("press 1101 to choose MECHANICAL");
						System.out.println("press 101 to choose EXIT");
					}
					Scanner sc = new Scanner(System.in);
					int i = sc.nextInt();

					administion bb = new administion();

					switch (i) {
					case 1101:
						bb.Mechanical();
						break;
					case 2101:
						bb.ECE();
						break;
					case 3101:

						bb.eee();

						break;
					case 4101:
						bb.IT();
						break;
						
					case 5101:
						bb.cse();
						break;

					case 101:
						System.exit(0);
					default:
						System.out.println("Wrong Choice");

						break;
					}
					System.out.println("Do you want to continue then press y/n");
					s = sc.next();
					if (s.equals("n")) {

						System.out.println("******Session closed*******");

						break outer;
					}
				}
			} else {
				System.out.println("choose the course");
				System.out.println("MECHANICAL as 1");
				System.out.println("ECE as 2");
				System.out.println("EEE as 3");
				System.out.println("CSE as 4");
				System.out.println("IT as 5");
				Scanner sc = new Scanner(System.in);
				int e = sc.nextInt();
				            
				
				switch (e) {
				case 1:
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sathiya","root","root");
					Statement stmt=con.createStatement();
					ResultSet rs = stmt.executeQuery("select*from mechanical");
					while(rs.next()){
					System.out.println(rs.getString(1));
					}
					con.close();
		            
					break;
			
				case 2:
					Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/sathiya","root","root");
					Statement stmt1=con1.createStatement();
					ResultSet rs1 = stmt1.executeQuery("select*from ece");
					while(rs1.next()){
					System.out.println(rs1.getString(1));
					}
					con1.close();
		            
					break;
				case 3:
					Connection con11=DriverManager.getConnection("jdbc:mysql://localhost:3306/sathiya","root","root");
					Statement stmt11=con11.createStatement();
					ResultSet rs11 = stmt11.executeQuery("select*from eee");
					while(rs11.next()){
					System.out.println(rs11.getString(1));
					}
					con11.close();
		            
					break;
				case 4:
					Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/sathiya","root","root");
					Statement stmt2=con2.createStatement();
					ResultSet rs2 = stmt2.executeQuery("select*from cse");
					while(rs2.next()){
					System.out.println(rs2.getString(1));
					}
					con2.close();
		            
					break;
				case 5:
					Connection con3=DriverManager.getConnection("jdbc:mysql://localhost:3306/sathiya","root","root");
					Statement stmt3=con3.createStatement();
					ResultSet rs3 = stmt3.executeQuery("select*from IT");
					while(rs3.next()){
					System.out.println(rs3.getString(1));
					}
					con3.close();
		            
					break;
				}
				p = sc1.next();
			
			}}
		
	}

}
