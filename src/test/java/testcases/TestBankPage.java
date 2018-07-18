package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;

import org.testng.*;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import classes.Customer;
import gurupages.BankPage;
import gurupages.DemoGuru;

public class TestBankPage extends SampleTest{


//	WebDriver driver;
	DemoGuru demoGuru;
	BankPage bankPage;
//	
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
//	@Tesst
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
