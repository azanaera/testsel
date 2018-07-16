package gurupages;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import classes.Customer;
import interfaces.ILog;

public class BankPage implements ILog{
	private WebDriver driver;
	public String userid;
	public String pword;
	Customer customer;
	
	public BankPage(WebDriver _driver) {
		this.driver = _driver;
	}

	@Override
	public void login(String user, String pass, boolean canLog) {
		// TODO Auto-generated method stub
		driver.findElement(By.name("uid")).sendKeys(user);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.name("btnLogin")).click();
	}
	
	@Override
	public void logout() {
		// TODO Auto-generated method stub
		
	}
	
	public void navigateToSection(String linkText) {
		driver.findElement(By.linkText(linkText)).click();
	}
	
	public void createCustomer(Customer _customer) {
		driver.findElement(By.name("name")).sendKeys(_customer.name);
		driver.findElement(By.name("rad1")).sendKeys(_customer.gender);
		Calendar cal = Calendar.getInstance();
		cal.set(1994, 6, 22);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('dob').removeAttribute('readonly',0);"); // Enables the from date box
		((JavascriptExecutor) driver).executeScript("$('#dob').prop('value', '08/31/1995');");

		WebElement dateWidget = driver.findElement(By.name("dob"));
		dateWidget.clear();
		dateWidget.sendKeys("16/22/1994");
		driver.findElement(By.name("dob")).sendKeys(_customer.bday);
		driver.findElement(By.name("addr")).sendKeys(_customer.addr);
		driver.findElement(By.name("city")).sendKeys(_customer.city);
		driver.findElement(By.name("state")).sendKeys(_customer.state);
		driver.findElement(By.name("pinno")).sendKeys(_customer.pin);
		driver.findElement(By.name("telephoneno")).sendKeys(_customer.telephoneno);
		driver.findElement(By.name("emailid")).sendKeys(_customer.email);
		driver.findElement(By.name("sub")).click();
	}
}