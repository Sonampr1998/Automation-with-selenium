package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class TestBase {
static WebDriver driver;
static Properties prop;

public TestBase() {
	try {
		prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\prawe\\eclipse-workspace\\PageObjectModel\\src\\main\\java\\com\\qa\\config\\object.Properties");
		prop.load(ip);
	}
	catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	catch(IOException e) {
		e.printStackTrace();
	}
}

public static void initialization() {
	String browserName = prop.getProperty("browser");
	}
}