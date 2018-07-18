package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.testng.*;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.*;

public class SampleTest {
	public WebDriver driver;
	PolicyCenter polCenter;
	
	@BeforeMethod
	public void setUp() throws Exception {
		Properties data = new Properties();
		System.out.println(System.getProperty("user.dir")+"\\browserdata.properties");
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\browserdata.properties");
		data.load(fis);
		
		switch(data.getProperty("browser")) {
			case "firefox":
				System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
				driver = new FirefoxDriver();
			break;
			case "chrome":
				System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
				driver = new ChromeDriver();
			break;	
			
		}
//		driver.get(data.getProperty("url"));
		
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
	}	
	@Parameters({"uid","pass"})
	@Test
	public void loginPC(String user, String pass) throws Exception {
		polCenter = new PolicyCenter(driver);
		polCenter.login(user,pass);
//		Person person = contact.navigateToPerson(); // heres the error
	}

}
