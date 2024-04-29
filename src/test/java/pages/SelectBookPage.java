package pages;

import org.openqa.selenium.By;

public class SelectBookPage extends BasePage {
	
	public String selectbookurl = "https://www.wafilife.com/cat/books/author/md-mujibur-rahman";
	public By checkbox = By.xpath("//div[@id='product_cat_str:ব্যবসায় শিক্ষা ভর্তি প্রস্তুতি']");
	public By sortdropdown = By.xpath("//select[@class='select_field']");
	public By tapbook = By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/li[1]/div[1]/div[1]/a[1]");
	public By popup = By.xpath("//body/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/button[2]");
	public By taporder = By.xpath("//body/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/button[2]");
}
