package gurupages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import classes.PageNavigate;

public class DemoGuru {

	private WebDriver driver;
	
	public DemoGuru(WebDriver _driver) {
		driver = _driver;
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com");
	}
	
	public AgilePage navigateToAgileProject() {
		PageNavigate.navigateByLinkText(driver, "Agile Project");
		return new AgilePage(driver);
	}
	
	public BankPage navigateToBankProject() {
		PageNavigate.navigateByLinkText(driver, "Bank Project");
		return new BankPage(driver);
	}

	public SecurityPage navigateToSecurityProject() {
		PageNavigate.navigateByLinkText(driver, "Security Project");
		return new SecurityPage(driver);
	}

	public AgilePage navigateToTelecomProject() {
		PageNavigate.navigateByLinkText(driver, "Telecom Project");
		return new AgilePage(driver);
	}

	public PayGatewayPage navigateToPaymentGatewayProject() {
		PageNavigate.navigateByLinkText(driver, "Payment Gateway Project");
		return new PayGatewayPage(driver);
	}
	
}
