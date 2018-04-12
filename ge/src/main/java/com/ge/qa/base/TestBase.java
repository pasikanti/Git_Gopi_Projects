package com.ge.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.log4testng.Logger;

public class TestBase {
	
	private static final Logger log = Logger.getLogger(TestBase.class);
	
	static WebDriver driver;
	static Properties prop;
	
	public TestBase() {
	
	try {
		log.info("hi message started");
		prop = new Properties();
		FileInputStream ip = new FileInputStream("G:\\New folder\\ge\\src\\main\\java\\com"
				+ "\\ge\\qa\\util\\config.properties");
		prop.load(ip);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}catch (IOException e) {
		e.printStackTrace();
	}

}
	
	
	
	
	
	
}
