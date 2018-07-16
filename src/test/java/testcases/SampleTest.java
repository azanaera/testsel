package testcases;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.*;
import pages.PolicyCenter;

public class SampleTest {
	public WebDriver driver;
	PolicyCenter polCenter;
//	@Test
	@Before
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
	
	@After
	public void tearDown() throws Exception {
//		driver.quit();
	}
	@Test
	public void verifyLoginPage() throws Exception {
		polCenter = new PolicyCenter(driver);
		polCenter.login("su", "gw");
		Contact contact = polCenter.navigateToContact(); // this works
		Person person = contact.navigateToPerson(); // heres the error
	}

}
