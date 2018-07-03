package testcases;

import org.junit.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import gurupages.AgilePage;
import gurupages.DemoGuru;
import gurupages.SecurityPage;

public class TestAgilePage {
	WebDriver driver;
	DemoGuru demoGuru;
	AgilePage agilePage;
	
	@Before
	public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@After
	public void tearDown() throws Exception {
//		driver.quit();
	}
	@Test
	public void verifyAgileAccountAndLogout() throws Exception {
		demoGuru = new DemoGuru(driver);
		agilePage = demoGuru.navigateToAgileProject();
		agilePage.login("","",false);
		
//		agilePage.login("1303", "Guru99");
//		agilePage.navigateToStatement();
//		agilePage.submitAccount("3308");
//		agilePage.logout();
	}
}
