package gurupages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoGuru {

	private WebDriver driver;
	
	public DemoGuru(WebDriver _driver) {
		driver = _driver;
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com");
	}
	
	public AgilePage navigateToAgileProject() {
//		driver.findElement(By.xpath("//*[@id='navbar-brand-centered']/ul/li[4]/a")).click();
		driver.findElement(By.linkText("Agile Project")).click();
		return new AgilePage(driver);
	}
	
	public BankPage navigateToBankProject() {
//		driver.findElement(By.xpath("//*[@id='navbar-brand-centered']/ul/li[4]/a")).click();
		driver.findElement(By.linkText("Bank Project")).click();
		return new BankPage(driver);
	}

	public SecurityPage navigateToSecurityProject() {
//		driver.findElement(By.xpath("//*[@id='navbar-brand-centered']/ul/li[4]/a")).click();
		driver.findElement(By.linkText("Security Project")).click();
		return new SecurityPage(driver);
	}

	public AgilePage navigateToTelecomProject() {
//		driver.findElement(By.xpath("//*[@id='navbar-brand-centered']/ul/li[4]/a")).click();
		driver.findElement(By.linkText("Telecom Project")).click();
		return new AgilePage(driver);
	}

	public PayGatewayPage navigateToPaymentGatewayProject() {
//		driver.findElement(By.xpath("//*[@id='navbar-brand-centered']/ul/li[4]/a")).click();
		driver.findElement(By.linkText("Payment Gateway Project")).click();
		return new PayGatewayPage(driver);
	}
	
}
