package testcases;

import org.testng.annotations.*;

import gurupages.DemoGuru;


public class AccountTabTest extends SampleTest {
	
	@BeforeTest
	public void setUp() throws Exception {
       super.setUp();
	}
	
	@AfterTest
	public void tearDown() throws Exception {
		super.tearDown();
	}
	@Parameters({"user","pass"})
	@Test
	public void navToAccount(String user, String pass) throws Exception {
		super.loginPC(user, pass);
		super.polCenter.navigateToAccountTab();
	}
}
