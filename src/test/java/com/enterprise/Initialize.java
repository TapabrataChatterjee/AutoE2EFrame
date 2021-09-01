package com.enterprise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.*;

public class Initialize {
	
	WebDriver driver;
	
	public WebDriver selectDriver() throws FileNotFoundException {
	
	Properties properties = new Properties();
	FileInputStream fis = new FileInputStream("/Users/Anindita/eclipse-workspace/AutoE2EFrame/src/test/java/com/enterprise/Data.properties");
	try {
		properties.load(fis);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String browserName = properties.getProperty("browser");
	
	switch(browserName) {
	
	case "chrome":
	{
		System.setProperty("webdriver.chrome.driver", "/Users/Anindita/Downloads/chromedriver_mac");
		
		driver = new ChromeDriver();
		break;
		
	}
	case "firefox":
	{
		break;
		
	}
	case "safari":
	{
	   // driver = new SafariDriver();
		break;
	}
	
	
	
	}
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	return driver;
	
	
	

}
}
