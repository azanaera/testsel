package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PolicyCenter {
	private WebDriver driver;
	
	public PolicyCenter( WebDriver _driver) {
		driver = _driver;
		driver.manage().window().maximize();
//		driver.get("http://10.90.140.53:8180/pc/PolicyCenter.do");
		driver.get("http://72.52.222.78:8180/pc/PolicyCenter.do");
	}
	
	public void login(String user, String pass) {
		driver.findElement(By.id("Login:LoginScreen:LoginDV:username-inputEl")).sendKeys(user);
		driver.findElement(By.id("Login:LoginScreen:LoginDV:password-inputEl")).sendKeys(pass);
		driver.findElement(By.id("Login:LoginScreen:LoginDV:submit-btnInnerEl")).click();
//		WebDriverWait wait = new WebDriverWait(driver, 40);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("QuickJump-inputEl")));
	}
	
	public Contact navigateToContact() {
		
		//actually this is the one Lu explained - the select Element
//		Select sel = (Select)driver.findElement(By.id("TabBar:ContactTab-btnWrap"));
//		sel.selectByIndex(0);
		
		WebElement elem = driver.findElement(By.id("TabBar:ContactTab-btnWrap"));
		elem.click(); // ill just use the basic element then run it
		// this is the error
		// ill just change it in ID
		return new Contact(driver);
	}

	public void navigateToPolicyTab() {
		driver.findElement(By.id("TabBar:PolicyTab-btnInnerEl")).click();
	}

	public void navigateToAccountTab() {
		driver.findElement(By.id("TabBar:AccountTab-btnInnerEl")).click();		
	}
	
	public void navigateToAdminTab() {
		driver.findElement(By.id("TabBar:AdminTab-btnInnerEl")).click();		
	}

}
