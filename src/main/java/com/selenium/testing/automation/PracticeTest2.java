package com.selenium.testing.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTest2 {
	static String appUrl = "https://www.toolsqa.com/automation-practice-switch-windows/";
	static String driverPath = "E:\\browserdrivers\\chromedriver_win32\\chromedriver.exe";

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.get(appUrl);
		driver.manage().window().maximize();
		driver.close();
		driver.quit();
	}

}
