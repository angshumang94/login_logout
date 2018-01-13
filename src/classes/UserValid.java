package classes;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserValid {

	public boolean validate(String username , String password) {
		// TODO Auto-generated method stub
		boolean valid = false;
		
		DButil db = new DButil();
		Connection conn = db.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			
			stmt=conn.createStatement();
			rs=stmt.executeQuery("select * from userdetails where username = '" +username +"' and password = '" +  password + "'");  
			
			
			if(rs.first())
				valid = true;
			
			conn.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return valid;

	}
	
	public boolean usernameAvail(String username){
		boolean valid = true;
		
		DButil db = new DButil();
		Connection conn = db.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			
			stmt=conn.createStatement();
			rs=stmt.executeQuery("select * from userdetails where username = '" +username +"'");  
			
			
			if(rs.first())
				valid = false;
			
			conn.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return valid;
	}

}
