package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DButil {
	
	public Connection getConnection(){
		
		
		Connection con = null;

		
		try {
			
			
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/userinfo","root","angshu");
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Cannot establish connection");
		}
		
		
			return con;
	}
		

}
