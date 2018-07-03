package gurupages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import interfaces.IAccountElement;
import interfaces.ILog;

public class AgilePage implements ILog {
	private WebDriver driver;
	public String userid;
	public String pword;
	
	public AgilePage(WebDriver _driver) {
		this.driver = _driver;
	}
	
	public void validateEmptyFields() {
		driver.findElement(By.name("uid")).sendKeys("");
		driver.findElement(By.name("password")).sendKeys("");
	}

	@Override
	public void login(String user, String pass, boolean canLog) {
		// TODO Auto-generated method stub
		driver.findElement(By.name("uid")).sendKeys(user);
		driver.findElement(By.name("password")).sendKeys(pass);
		if(canLog) {
			driver.findElement(By.name("btnLogin")).click();
		}
	}
	@Override
	public void logout() {
		// TODO Auto-generated method stub
		driver.findElement(By.linkText("Log out")).click();		
	}
	
	public void navigateToStatement( ) {
		driver.findElement(By.linkText("Mini Statement")).click();
	}
	
	public void submitAccount(String acc) {
		Select dropdown = new Select(driver.findElement(By.name("accountno")));
		dropdown.selectByVisibleText(acc);
		driver.findElement(By.name("AccSubmit")).click();
	}


}
