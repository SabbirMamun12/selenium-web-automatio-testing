package testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.BasePage;
import pages.SelectWriterPage;
import utilities.BaseDriver;

public class SelectWriterTest extends BaseDriver{
	
	SelectWriterPage selectWriterPage = new SelectWriterPage();
	BasePage basePage = new BasePage();
	
	@Test(priority = 1)
	public void enablebutton() {
		getDriver().get(selectWriterPage.choosewriterurl);
		boolean chossewriterenable = getDriver().findElement(By.xpath("//ul[@class=\"archive-product-subcategories\"]/li[33]")).isEnabled();
		Assert.assertEquals(chossewriterenable,true);
	}
	@Test(priority = 2)
	public void choosewriter() {
		getDriver().get(selectWriterPage.choosewriterurl);
		basePage.button(selectWriterPage.writerpath);
		selectWriterPage.takeScreenShot("ChooseWriter");
	}

}
