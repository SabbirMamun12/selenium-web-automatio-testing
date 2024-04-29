package testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.BasePage;
import pages.HomePage;
import utilities.BaseDriver;

public class HomePageTest extends BaseDriver{
	
	HomePage homePage = new HomePage();
	
	@Test(priority = 1)
	public void homepagetitle() {
		getDriver().get(homePage.url);
		assertEquals(getDriver().getTitle(), homePage.title);
	}
	@Test(priority = 2)
	public void clicklogin() {
		getDriver().get(homePage.url);
		homePage.button(homePage.myaccountbutton);
		homePage.takeScreenShot("Clicklogin");
	}
	
	
	
	
	


}
