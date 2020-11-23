package testcases;

import java.sql.SQLException;

import utilities.DbManager;


public class DbTest {
	public static void main(String[] args) throws Exception, SQLException {
		DbManager.setDbConnection();
		DbManager.getTitleInDb("bruce");
	}
}
