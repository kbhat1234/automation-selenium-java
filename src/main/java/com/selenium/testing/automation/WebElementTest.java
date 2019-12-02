package com.selenium.testing.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementTest {

	static String appUrl = "http://www.google.com";
	static String driverPath = "E:\\browserdrivers\\chromedriver_win32\\chromedriver.exe";

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.get(appUrl);
		WebElement name = driver.findElement(By.name("q"));
		name.sendKeys("Bangalore");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		name.clear();
		driver.close();
		driver.quit();
	}

}