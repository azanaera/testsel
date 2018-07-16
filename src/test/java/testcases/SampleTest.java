package testcases;

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
//	@Test
	@BeforeTest
	public void setUp() throws Exception {
		Properties data = new Properties();
		FileInputStream fis = new FileInputStream(new File("C:\\Users\\eazana.PICL-9FJPRF2\\eclipse-workspace\\TestSelenium\\src\\test\\java\\data\\browserdata.properties"));
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
	
	@AfterTest
	public void tearDown() throws Exception {
//		driver.quit();
	}
	@Test
	@Parameters({"user","pass"})
	public void verifyLoginPage(String user, String pass) throws Exception {
		polCenter = new PolicyCenter(driver);
		polCenter.login(user, pass);
		Contact contact = polCenter.navigateToContact(); // this works
		Person person = contact.navigateToPerson(); // heres the error
	}

}
