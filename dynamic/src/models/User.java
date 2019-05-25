package models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class User {

	public String login(String userN, String passw) {
		
		Connection con=null;
		Statement statement=null;
		ResultSet resultset=null;
		
		String userNameDB="";
		String passwordDB="";
		
		try {
			con = DB.createConnection();
			statement=con.createStatement();
			resultset=statement.executeQuery("");
			while(resultset.next()) {
				userNameDB=resultset.getString("nameusers");
				passwordDB=resultset.getString("passusers");		
				
				
				if(userN.equals(userNameDB) && passw.equals(passwordDB)) {
					return"SUCCESS";
				}
				
			}
		}

		
		catch(SQLException e) {
			e.printStackTrace();
		}
		return "Invalid user";
		
	}
}

