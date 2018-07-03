package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Contact {
	private WebDriver driver;
	
	public Contact(WebDriver _driver) {
		this.driver = _driver;
	}

	public Person navigateToPerson() {
		driver.findElement(By.id("TabBar:ContactTab:NewContact-textEl")).sendKeys(String.format("%s+%s+%s+%s",Keys.DOWN,Keys.RIGHT,Keys.DOWN,Keys.ENTER));
		return new Person(driver);
	}
	
	public Company navigateToCompany() {
		driver.findElement(By.id("TabBar:ContactTab-btnWrap")).click();
		return new Company(driver);
	}

}
