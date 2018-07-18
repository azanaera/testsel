package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.*;

import pages.PolicyCenter;


public class AccountTabTest extends SampleTest {

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
	public void navToAccount(String user, String pass) throws Exception {
		super.polCenter = new PolicyCenter(super.driver);
		super.polCenter.login("su", "gw");
		super.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		super.polCenter.navigateToAccountTab();
	}
}
