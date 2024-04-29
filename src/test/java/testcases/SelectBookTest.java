package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.BasePage;
import pages.SelectBookPage;
import utilities.BaseDriver;

public class SelectBookTest extends BaseDriver{
	
	SelectBookPage selectbookpage = new SelectBookPage();
	BasePage basePage = new BasePage();
	
	@Test(priority = 1)
	public void title() {
		getDriver().get(selectbookpage.selectbookurl);
		Assert.assertEquals(getDriver().getTitle(), "Md. Mujibur Rahman Books | List of books by author Md. Mujibur Rahman | Wafilife");
	}
	
	@Test(priority = 2)
	public void enablechecknox() {
		getDriver().get(selectbookpage.selectbookurl);
		boolean checkbox = getDriver().findElement(By.xpath("//div[@id='product_cat_str:ব্যবসায় শিক্ষা ভর্তি প্রস্তুতি']")).isEnabled();
		Assert.assertEquals(checkbox, true);
	}
	
	@Test(priority = 3)
	public void enabledropdown() {
		getDriver().get(selectbookpage.selectbookurl);
		boolean dropdown = getDriver().findElement(By.xpath("//select[@class='select_field']")).isEnabled();
		Assert.assertEquals(dropdown, true);
	}
	
	@Test(priority = 4)
	public void tapcheckboxanddropdown() throws InterruptedException {
		getDriver().get(selectbookpage.selectbookurl);
		basePage.button(selectbookpage.checkbox);
		Select select =new Select(basePage.getpath(selectbookpage.sortdropdown));
		select.selectByValue("discount_desc");
		Thread.sleep(5000);
	}
	
	
	
	@Test(priority = 5)
	public void PopupWindowHandling() throws InterruptedException {
        getDriver().get(selectbookpage.selectbookurl);
        basePage.button(selectbookpage.tapbook);
        selectbookpage.takeScreenShot("PopUp");
        Thread.sleep(5000);
        
        
    }
}


