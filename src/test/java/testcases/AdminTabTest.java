package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import gurupages.DemoGuru;
import pages.PolicyCenter;


public class AdminTabTest extends SampleTest {
	
	@BeforeMethod
	public void setUp() throws Exception {
       super.setUp();
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		super.tearDown();
	}
	@Parameters({"uid","pass"})
	@Test
	public void navToAdmin(String user, String pass) throws Exception {
		super.polCenter = new PolicyCenter(super.driver);
		super.polCenter.login(user, pass);
		super.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		super.polCenter.navigateToAdminTab();
	}
}
