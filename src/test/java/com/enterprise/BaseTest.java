package com.enterprise;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class BaseTest {
	
	WebDriver driver;
	
	
	@Test
	public void baseTestNav() {
		
	  Initialize test = new Initialize();
	  try {
		 driver = test.selectDriver();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  driver.get("https://amazon.com");
	  
		
	}

}
