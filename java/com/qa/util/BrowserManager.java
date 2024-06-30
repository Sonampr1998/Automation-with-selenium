package com.qa.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.PO.PO_Search;

public class BrowserManager {
	static WebDriver driver=null ;
public static WebDriver getDriver(String type, String url) {
	
	if(type.equalsIgnoreCase("chrome")) {
	driver = new ChromeDriver();
	}else if(type.equalsIgnoreCase("firefox")){
		driver = new FirefoxDriver();
	}else {
		Assert.assertTrue(false,"No browser type sent");
	}
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get(url);
	Reporter.log("navigate to browser:"+ type +" url: "+url,true);
	return driver;
	}
}
