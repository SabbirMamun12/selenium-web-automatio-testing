package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.BasePage;
import pages.OrderBookPage;
import utilities.BaseDriver;

public class OrderBookTest extends BaseDriver {
	
	OrderBookPage orderBookPage = new OrderBookPage();
	BasePage basePage = new BasePage();
	
	@Test(priority = 1)
	public void title() {
		getDriver().get(orderBookPage.orderbookurl);
		Assert.assertEquals(getDriver().getTitle(), orderBookPage.title);
	}
	
	@Test(priority = 2)
	public void enablebutton() {
		getDriver().get(orderBookPage.orderbookurl);
		boolean enablebutton = getDriver().findElement(By.xpath("//button[@class='single_add_to_cart_button button alt ']")).isEnabled();
		Assert.assertEquals(enablebutton, true);
	}
	
	@Test(priority = 3)
	public void clickorder() throws InterruptedException {
		getDriver().get(orderBookPage.orderbookurl);
		basePage.button(orderBookPage.cliclorderpath);
		orderBookPage.takeScreenShot("ClickOrder");
		Thread.sleep(5000);
	}
	
}
	

