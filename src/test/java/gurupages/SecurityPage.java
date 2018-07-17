package gurupages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import interfaces.ILog;

public class SecurityPage implements ILog {
	private WebDriver driver;
	public String userid;
	public String pword;
	
	public SecurityPage(WebDriver _driver) {
		this.driver = _driver;
	}
	public void navigateToBalanceInquiry() {
		driver.findElement(By.linkText("Balance Enquiry")).click();
	}

	public void navigateToMiniStatement() {
		driver.findElement(By.linkText("Mini Statement")).click();
	}
	
	public void navigateToContactUs() {
		driver.findElement(By.linkText("Contact Us")).click();
	}
	
	public void submitAccount(String selectedText) {
		Select dropdown = new Select(driver.findElement(By.name("accountno")));
		dropdown.selectByVisibleText(selectedText);
		driver.findElement(By.name("AccSubmit"));
	}

	public void ContactUsFillUp(String name, String email, int mobile, String message, String directoryFile) {

		driver.findElement(By.name("name")).sendKeys(name);
		driver.findElement(By.name("emailid")).sendKeys(email);
		driver.findElement(By.name("telephoneno")).sendKeys(Integer.toString(mobile));
		driver.findElement(By.name("addr")).sendKeys(message);
		driver.findElement(By.name("fileToUpload")).sendKeys(directoryFile);
		driver.findElement(By.name("sub")).click();
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
	
	
	
}
