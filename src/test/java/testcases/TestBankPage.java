package testcases;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import classes.Customer;
import gurupages.BankPage;
import gurupages.DemoGuru;

public class TestBankPage {


	WebDriver driver;
	DemoGuru demoGuru;
	BankPage bankPage;
	
	@Before
	public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@After
	public void tearDown() throws Exception {
//		driver.	quit();
	}
	@Test
	public void verifyNewCustomer() throws Exception {
		demoGuru = new DemoGuru(driver);
		bankPage = demoGuru.navigateToBankProject();
		bankPage.login("mngr139362", "sequtYm",true);
		Customer cus1 = new Customer("Era","1","06-22-1994","e gonzales","silang","cavite","012345","4130803","era.azana@gmail.com");
		bankPage.navigateToSection("New Customer");
		bankPage.createCustomer(cus1);
//		securityPage.navigateToStatement();
		
//		securityPage.submitAccount("3308");
//		securityPage.logoutAgile();
	}
}
