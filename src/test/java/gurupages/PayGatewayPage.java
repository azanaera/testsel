package gurupages;

import org.openqa.selenium.WebDriver;

public class PayGatewayPage {
	private WebDriver driver;
	public String userid;
	public String pword;
	
	public PayGatewayPage(WebDriver _driver) {
		this.driver = _driver;
	}
}
