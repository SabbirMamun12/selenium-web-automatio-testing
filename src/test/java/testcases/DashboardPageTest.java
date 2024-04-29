package testcases;

import org.testng.annotations.Test;

import pages.BasePage;
import pages.DashboardPage;
import utilities.BaseDriver;

public class DashboardPageTest extends BaseDriver{
	DashboardPage dashboardPage =  new DashboardPage();
	BasePage basePage = new BasePage();
	
	@Test
	public void dashboardtest() {
		getDriver().get(dashboardPage.dashurl);
		basePage.button(dashboardPage.clickwriter);
		dashboardPage.takeScreenShot("Dashboard");
		
	}

}
