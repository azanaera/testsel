package testcases;

import org.testng.annotations.*;

import gurupages.DemoGuru;


public class PolicyTabTest extends SampleTest {
	
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
	public void navToPolicy(String user, String pass) throws Exception {
		super.loginPC(user, pass);
		super.polCenter.navigateToPolicyTab();
	}
}
