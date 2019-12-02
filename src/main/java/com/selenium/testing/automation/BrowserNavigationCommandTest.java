package com.selenium.testing.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigationCommandTest {

	static String appUrl="https://news.google.com/?hl=en-IN&gl=IN&ceid=IN:en";
	static String driverPath="E:\\browserdrivers\\chromedriver_win32\\chromedriver.exe";
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver;
		driver = new ChromeDriver();
		//driver.get(appUrl);
		//driver.navigate().to(appUrl);
		driver.navigate().to("https://news.google.com/?hl=en-IN&gl=IN&ceid=IN:en");
		driver.manage().window().fullscreen();
		driver.findElement(By.linkText("India")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();
		driver.quit();
		
	}

}
