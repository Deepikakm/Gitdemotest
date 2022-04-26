package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.basetest.BaseTest;
import com.pages.HomePage;

public class HomeTest extends BaseTest{

	public static void main(String[] args) {
		
BaseTest test=new BaseTest();
test.setup(browser);
HomePage home = new HomePage(driver);
home.clicklink(); 
		
		
		/*BaseTest test=new BaseTest();
		test.setup("chrome");
		HomePage home = new HomePage(driver);
		home.clicklink();*/
	
	 
	  
	  
	  
		
		

	}

}
