package testcases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pages.BasePage;
import pages.DashboardPage;
import pages.HomePage;
import pages.LogInPage;
import pages.OrderBookPage;
import pages.SelectBookPage;
import pages.SelectWriterPage;
import pages.ShipingInformationPage;
import pages.WriterPage;
import utilities.BaseDriver;

public class FinalTest extends BaseDriver{
	
	BasePage basePage = new BasePage();
	HomePage homePage = new HomePage();
	HomePageTest homePageTest = new HomePageTest();
	LogInPage logInPage = new LogInPage();
	LogInPageTest logInPageTest = new LogInPageTest();
	DashboardPage dashboardPage = new DashboardPage();
	DashboardPageTest dashboardPageTest = new DashboardPageTest();
	WriterPage writerPage = new WriterPage();
	WriterPageTest writerPageTest = new WriterPageTest();
	SelectWriterPage selectWriterPage = new SelectWriterPage();
	SelectWriterTest selectWriterTest = new SelectWriterTest();
	SelectBookPage selectBookPage = new SelectBookPage();
	SelectBookTest selectBookTest = new SelectBookTest();
	OrderBookPage orderBookPage = new OrderBookPage();
	OrderBookTest orderBookTest = new OrderBookTest();
	ShipingInformationPage shipingInformationPage = new ShipingInformationPage();
	
	@Test(priority = 1)
	public void IntigrationTest1() throws InterruptedException {
		homePageTest.clicklogin();
		logInPageTest.inputlogindetails();
		dashboardPageTest.dashboardtest();
		writerPageTest.nextpageclick();
		selectWriterTest.choosewriter();
		selectBookTest.PopupWindowHandling();
		orderBookTest.clickorder();
	}
	@Test(priority = 2)
	public void intigrationtest2() throws InterruptedException {
		getDriver().get(homePage.url);
		homePage.button(homePage.myaccountbutton);
		logInPage.inputtext(logInPage.username, "shaktirahman960@gmail.com");
		logInPage.inputtext(logInPage.password, "163184444");
		logInPage.button(logInPage.Taplogin);
		basePage.button(dashboardPage.clickwriter);
		basePage.button(writerPage.nextpage);
		Thread.sleep(3000);
		basePage.button(selectWriterPage.writerpath);
		Thread.sleep(3000);
		basePage.button(selectBookPage.tapbook);
		Thread.sleep(3000);
		basePage.button(orderBookPage.cliclorderpath);
		Thread.sleep(5000);
		 // Get handles of all windows currently open
        Set<String> windowHandles = getDriver().getWindowHandles();

        // Switch to the popup window
        for (String windowHandle : windowHandles) {
            getDriver().switchTo().window(windowHandle);
        }

        // Now you can interact with elements on the popup window
        WebElement popupButton = getDriver().findElement(By.xpath("//a[@class='button checkout-link']"));
        popupButton.click();

        // Once done with the popup window, you may need to switch back to the main window
        // Switch to the main window
        getDriver().switchTo().defaultContent();
        Thread.sleep(3000);
        
		
		basePage.inputtext(shipingInformationPage.adsresspath, "Sahebpara,Bhangura,Pabna");
		Thread.sleep(3000);
		
		basePage.button(shipingInformationPage.checkbox);
		Thread.sleep(3000);
		
		basePage.button(shipingInformationPage.Paymentpath);
		Thread.sleep(3000);
		
		basePage.button(shipingInformationPage.logoutpath);
		Thread.sleep(3000);
		
		basePage.button(shipingInformationPage.clicklogout);
		Thread.sleep(5000);
		
		
        
        
	}
	
	

}
