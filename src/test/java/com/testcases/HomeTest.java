package com.testcases;

import javax.swing.Spring;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.basetest.BaseTest;
import com.pages.HomePage;

public class HomeTest extends BaseTest{

	public static void main(String[] args, String browser) {
		
BaseTest test=new BaseTest();
test.setup(browser);
HomePage home = new HomePage(driver);
home.clicklink(); 
System.out.println("testing git");
		
		
		/*BaseTest test=new BaseTest();
		test.setup("chrome");
		HomePage home = new HomePage(driver);
		home.clicklink();*/
	
	 
	  
	  
	  
		
		

	}

}
