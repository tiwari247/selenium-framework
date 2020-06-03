package com.framework.selenium.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SecondDemo {

	WebDriver driver;
	@BeforeClass
	public void setup() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chand\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@Test
	public void first()throws InterruptedException {
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
	}
	
	@Test
	public void second()throws InterruptedException {
		driver.get("https://www.google.com");
		
		Thread.sleep(3000);
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
}
