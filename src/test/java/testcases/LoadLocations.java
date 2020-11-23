package testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import javax.imageio.stream.FileImageInputStream;

public class LoadLocations {

	public static void main(String[] args) throws Throwable {
		LoadLocations l = new LoadLocations();
		//l.loadLocation();
	}

	public String loadLocation(String location) throws Throwable {
		Properties prop = new Properties();
		FileInputStream fls = new FileInputStream("C:\\Users\\Samsung\\DemoSelenium\\SeleniumMvnBruce\\src\\test\\java\\Config\\page.properties");
		prop.load(fls);
		return prop.getProperty(location);
	}

}
