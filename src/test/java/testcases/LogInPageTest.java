package testcases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LogInPage;
import utilities.BaseDriver;

public class LogInPageTest extends BaseDriver {
	
	LogInPage loginpage = new LogInPage();
	HomePageTest homePageTest = new HomePageTest();
	
	@Test(priority = 1)
	public void loginpagetitle() {
		getDriver().get(loginpage.loginurl);
		assertEquals(getDriver().getTitle(), "আমার অ্যাকাউন্ট");
	}
	
	@Test(priority = 2)
	public void enabletextfield() {
		homePageTest.clicklogin();
		boolean userfield = getDriver().findElement(By.xpath("//input[@name='username']")).isEnabled();
		Assert.assertEquals(userfield,true);
	}
	@Test(priority = 3)
	public void enabletextfield2() {
		homePageTest.clicklogin();
		boolean passwordfield = getDriver().findElement(By.xpath("//input[@id='password']")).isEnabled();
		Assert.assertEquals(passwordfield,true);
	}
	@Test(priority = 4)
	public void enablebutton() {
		homePageTest.clicklogin();
		boolean buttonfield = getDriver().findElement(By.xpath("//input[@value='লগইন']")).isEnabled();
		Assert.assertEquals(buttonfield,true);
	}
	
	@Test(priority = 5)
	public void inputlogindetails() throws InterruptedException {
		homePageTest.clicklogin();
		loginpage.inputtext(loginpage.username, "shaktirahman960@gmail.com");
		loginpage.inputtext(loginpage.password, "163184444");
		loginpage.button(loginpage.Taplogin);
		loginpage.takeScreenShot("LoginDetails");
		Thread.sleep(5000);
		
		
		
	}
	
	

}
