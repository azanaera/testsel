package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.*;

import gurupages.DemoGuru;


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
		super.loginPC(user, pass);
		super.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		super.polCenter.navigateToAdminTab();
	}
}
