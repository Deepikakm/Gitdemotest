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
System.out.println("testing git1");
System.out.println("testing git2");
		
System.out.println("testing git3");
System.out.println("testing git4");
System.out.println("testing git5");
System.out.println("testing git6");
		/*BaseTest test=new BaseTest();
		test.setup("chrome");
		HomePage home = new HomePage(driver);
		home.clicklink();*/
	
	 
	  
	  
	  
		
		

	}

}
