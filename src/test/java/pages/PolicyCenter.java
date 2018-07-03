package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PolicyCenter {
	private WebDriver driver;
	
	public PolicyCenter( WebDriver _driver) {
		this.driver = _driver;
		this.driver.manage().window().maximize();
		this.driver.get("http://72.52.222.78:8180/pc/PolicyCenter.do");
	}
	
	public void login(String user, String pass) {
		driver.findElement(By.id("Login:LoginScreen:LoginDV:username-inputEl")).sendKeys(user);
		driver.findElement(By.id("Login:LoginScreen:LoginDV:password-inputEl")).sendKeys(pass);
		driver.findElement(By.id("Login:LoginScreen:LoginDV:submit-btnInnerEl")).click();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("QuickJump-inputEl")));
	}
	
	public Contact navigateToContact() {
//		Select sel = (Select)driver.findElement(By.id("TabBar:ContactTab-btnWrap"));
//		sel.selectByIndex(0);
		return new Contact(driver);
	}

}
