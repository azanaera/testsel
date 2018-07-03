package testcases;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.Contact;
import pages.Person;
import pages.PolicyCenter;

public class SampleTest {
	WebDriver driver;
	PolicyCenter polCenter;
	@Before
	public void setUp() throws Exception {
//		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
//		driver = new FirefoxDriver();
		driver = new ChromeDriver();
        driver.manage().window().maximize();
		
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
	@Test
	public void verifyLoginPage() throws Exception {
		polCenter = new PolicyCenter(driver);
		polCenter.login("su", "gw");
//		polCenter.navigateToContact();
		//Person person = contact.navigateToPerson();
	}

}
