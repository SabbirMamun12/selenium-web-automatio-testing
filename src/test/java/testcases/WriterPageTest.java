package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.BasePage;
import pages.WriterPage;
import utilities.BaseDriver;

public class WriterPageTest extends BaseDriver{
	
	WriterPage writerpage = new WriterPage();
	BasePage basePage =new BasePage();
	
	@Test(priority = 1)
	public void scrolwriterpagetest() throws InterruptedException {
		
		getDriver().get(writerpage.writerurl);
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		WebElement Element = getDriver().findElement(By.xpath("//ul[@class='page-numbers']/li[2]"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		
	}
	@Test(priority = 2)
	
	public void nextpageclick() throws InterruptedException {
		getDriver().get(writerpage.writerurl);
		basePage.button(writerpage.nextpage);
		writerpage.takeScreenShot("NextPage");
		Thread.sleep(5000);
	}

}
