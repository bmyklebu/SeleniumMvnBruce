package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManager {

	private static Connection connect = null;

	public static void setDbConnection() throws ClassNotFoundException, Exception {

		try {
			// step 1
			Class.forName(TestConfig.mysqldriver);
			// step2
			 connect = DriverManager.getConnection(TestConfig.mysqlurl, TestConfig.mysqluserName,
					TestConfig.mysqlpassword);
			if (!connect.isClosed())
				System.out.println("Successfully connected to SQL server");
			
		} catch (Exception e) {
			System.out.println("connection not successfull");
		} finally {
			//System.out.println("here"+connect.isClosed());
			//if (!connect.isClosed())
				//connect.close();
		}
	}
	
	public static String  getTitleInDb (String name) throws Exception, Exception {
		setDbConnection();
		String sql = "SELECT * FROM brucetest WHERE name = '"+name+"' ";
		 
		Statement statement = connect.createStatement();
		ResultSet result = statement.executeQuery(sql);
		 
		
		 
		while (result.next()){
		    String resultName = result.getString(3);
		    
		    String output = "User #%d: %s - %s - %s - %s"; //what does this do?
		    String ggg =String.format(output, resultName);
		}
		String value = name;
		return name;
	}

	

	

}
