package com.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pages.HomePage;

public class BasePage {
	
	public static WebDriver driver;
	public BasePage(WebDriver driver)
	{
		BasePage.driver=driver;
	}
	
	
	public WebElement getElement(By locator) {
		
		WebElement element=null;
		try {
			
			element=driver.findElement(locator);
			return element;
					
		}
		catch(Exception e) {
			System.out.println("some error occured while creating the element " + locator.toString());
			e.printStackTrace();
			
			
		}
		return element;
		
	}
	
	

}
