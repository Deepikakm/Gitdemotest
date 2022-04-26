package com.basetest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver;
	public WebDriverWait wait;
	private Properties prop=new Properties();
	private FileInputStream fis;
	
	@BeforeMethod
	public  void setup(String browser)
	{
		try
		{
			fis=new FileInputStream("./src/test/resources/Properties/Config.properties");
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			prop.load(fis);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		if (browser.equals("chrome")) {

			/*Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("profile.default_content_setting_values.notifications", 2);
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", prefs);
            WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(options);*/
			
			driver.get(prop.getProperty("testsiteurl"));
		
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(Duration.ofSeconds(Integer.parseInt(prop.getProperty("implicit.wait"))));
			wait = new WebDriverWait(driver, Duration.ofSeconds(Integer.parseInt(prop.getProperty("explicit.wait"))));
	    }
	
	

      }
	
	@AfterMethod
	public void tearDown() {

		driver.quit();
		
	}

}
