package testcases;

import org.testng.annotations.*;

import pages.PolicyCenter;


public class AccountTabTest extends SampleTest {

	@Override
	@BeforeTest
	public void setUp() throws Exception {
       super.setUp();
	}
	
	@Override
	@AfterTest
	public void tearDown() throws Exception {
		super.tearDown();
	}
//	@Parameters({"user","pass"})
	@Test
	public void navToAccount(String user, String pass) throws Exception {
		super.polCenter = new PolicyCenter(super.driver);
		super.polCenter.login("su", "gw");
		super.polCenter.navigateToAccountTab();
	}
}
