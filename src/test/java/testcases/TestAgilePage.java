package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.*;
import org.testng.annotations.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import gurupages.AgilePage;
import gurupages.DemoGuru;


public class TestAgilePage extends SampleTest {
//	WebDriver driver;
	DemoGuru demoGuru;
	AgilePage agilePage;
	
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
	public void verifyAgileAccountAndLogout() throws Exception {
		demoGuru = new DemoGuru(driver);
		agilePage = demoGuru.navigateToAgileProject();
		
		//agilePage.login("","",false);
		
		agilePage.login("1303", "Guru99",true);
		agilePage.navigateToStatement();
		agilePage.submitAccount("3308");
		agilePage.logout();
	}
}
