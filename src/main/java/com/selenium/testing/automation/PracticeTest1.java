package com.selenium.testing.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTest1 {

	static String appUrl = "http://shop.demoqa.com";
	static String driverPath = "E:\\browserdrivers\\chromedriver_win32\\chromedriver.exe";

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();

		driver.get(appUrl);
		String title = driver.getTitle();
		int len=title.length();
		System.out.println(title);
		System.out.println(len);
		String actualUrl = driver.getCurrentUrl();
		if(actualUrl.equals(appUrl)) {
			System.out.println("correct url opened");
		}
		else {
			System.out.println("incorrect url opened");
			System.out.println("Actual Url is "+actualUrl);
			System.out.println("Expected Url is "+appUrl);
		}
		String source = driver.getPageSource();
		System.out.println(source);
		int psLen=source.length();
		System.out.println(psLen);
		driver.close();
		driver.quit();
	}

}
