package pages;

import org.openqa.selenium.By;

public class ShipingInformationPage extends BasePage {
	
	public By districtpath = By.xpath("//span[@id='select2-billing_state-container']");
	public By upazilapath = By.xpath("//select[@id='billing_area']");
	public By adsresspath = By.xpath("//textarea[@id='billing_address_1']");
	public By checkbox = By.xpath("//input[@id='ship-to-different-address-checkbox']");
	public By Paymentpath = By.xpath("//input[@id='payment_method_bkash']");
	public By logoutpath = By.xpath("//div[@class='login-links']/a[2]");
	public By clicklogout = By.xpath("//a[contains(text(),'লগআউট')]");

}
