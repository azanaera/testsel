package classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageNavigate {

	public static void navigateById(WebDriver _driver, String id) {
		_driver.findElement(By.id(id)).click();
	}
	
	public static void navigateByName(WebDriver _driver, String name) {
		_driver.findElement(By.name(name)).click();
	}
	
	public static void navigateByLinkText(WebDriver _driver, String linkText) {

		_driver.findElement(By.linkText(linkText)).click();
	}
}
