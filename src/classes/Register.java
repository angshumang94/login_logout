package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Register {
	
	public boolean add(String username, String password){
		
		boolean valid = false;
		
		DButil db = new DButil();
		Connection conn = db.getConnection();
		PreparedStatement stmt = null;
		
		int rs;
		
		try {
			
			stmt=conn.prepareStatement("insert into userdetails(username,password) values (?, ?)");
			stmt.setString(1, username);
			stmt.setString(2, password);
			
			rs = stmt.executeUpdate();
		
			
			if(rs == 1)
				valid = true;
			
			conn.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return valid;
	}

}
