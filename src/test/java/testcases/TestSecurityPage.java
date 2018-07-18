package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import gurupages.DemoGuru;
import gurupages.SecurityPage;

public class TestSecurityPage extends SampleTest{

//	WebDriver driver;
	DemoGuru demoGuru;
	SecurityPage securityPage;
	
//	@BeforeMethod
//	@BeforeTest
	public void setUp() throws Exception {
       super.setUp();
		
	}
	
//	@AfterMethod
//	@AfterTest
	public void tearDown() throws Exception {
		super.tearDown();
	}
//	@Test
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
