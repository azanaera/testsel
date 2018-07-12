package testcases;

import org.junit.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import gurupages.AgilePage;
import gurupages.DemoGuru;
import gurupages.SecurityPage;

public class TestAgilePage extends SampleTest {
	WebDriver driver;
	DemoGuru demoGuru;
	AgilePage agilePage;
	
	@Before
	public void setUp() throws Exception {
       super.setUp();
	}
	
	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}
	@Test
	public void verifyAgileAccountAndLogout() throws Exception {
		demoGuru = new DemoGuru(driver);
		agilePage = demoGuru.navigateToAgileProject();
		
		agilePage.login("","",false);
		
		agilePage.login("1303", "Guru99",true);
		agilePage.navigateToStatement();
		agilePage.submitAccount("3308");
		agilePage.logout();
	}
}
