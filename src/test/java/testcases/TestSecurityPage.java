package testcases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import gurupages.AgilePage;
import gurupages.DemoGuru;
import gurupages.SecurityPage;

public class TestSecurityPage {

	WebDriver driver;
	DemoGuru demoGuru;
	SecurityPage securityPage;
	
	@Before
	public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@After
	public void tearDown() throws Exception {
//		driver.	quit();
	}
	@Test
	public void verifyLoginPage() throws Exception {
		demoGuru = new DemoGuru(driver);
		securityPage = demoGuru.navigateToSecurityProject();
		securityPage.login("1303", "Guru99", true);
//		securityPage.navigateToStatement();
//		securityPage.submitAccount("3308");
//		securityPage.logoutAgile();
		
		securityPage.navigateToContactUs();
		securityPage.ContactUsFillUp("Era Azana", "era.azana@gmail.com", 12345, "Sample Message", "C:\\Users\\eazana.PICL-9FJPRF2\\Pictures\\qwe.jpg");
	}
}