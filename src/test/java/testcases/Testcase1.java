package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.DbManager;

public class Testcase1 extends LoadLocations{

	
	@Test
	public void testCase1() throws Throwable{
		Testcase1 locators = new Testcase1();
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		driver.get("https://automationintesting.com/selenium/testpage/");
		driver.findElement(By.xpath(locators.loadLocation("idFirstName"))).sendKeys("Bruce");
		driver.findElement(By.xpath(locators.loadLocation("idLastName"))).sendKeys("Myklebust");
		Assert.assertEquals((driver.findElement(By.xpath(locators.loadLocation("surnameHeader"))).getText()), "TEST FORM");
		
	}
	
	
}
