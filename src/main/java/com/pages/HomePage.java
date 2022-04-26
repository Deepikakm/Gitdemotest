package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.base.BasePage;

public class HomePage extends BasePage {
	public static WebDriver driver;
	public HomePage(WebDriver driver) {
		super(driver);
		HomePage.driver=driver;
		
		
		// TODO Auto-generated constructor stub
	}

	
	
	
	// private By Womenlink=By.xpath("//span[normalize-space()='SHOP WOMEN']");
	private By Womenlink=By.xpath("\r\n"
			+ "\r\n"
			+ "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/section[1]/div[2]/div[1]/div[2]/div[1]/div[2]/a[1]/span[1]");
	//private By Womenlink=By.cssSelector("//a[title='SHOP WOMEN'] span[class='gl-cta__content']");
		
		public void clicklink() {
			driver.findElement(Womenlink).click();
			   
			   
		
		}
 
			
	
}
