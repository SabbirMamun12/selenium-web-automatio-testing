package pages;

import org.openqa.selenium.By;

public class LogInPage extends BasePage {
	
	public String loginurl = "https://www.wafilife.com/my-account";
	public By username = By.xpath("//input[@name='username']");
	public By password = By.xpath("//input[@id='password']");
	public By Taplogin = By.xpath("//input[@value='লগইন']");
	

}
