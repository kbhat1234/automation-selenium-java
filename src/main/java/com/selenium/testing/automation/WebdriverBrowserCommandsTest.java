package com.selenium.testing.automation;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverBrowserCommandsTest {
	static String appUrl = "http://www.google.co.in";
	static String chromePath = "E:\\\\browserdrivers\\\\chromedriver_win32\\\\chromedriver.exe";

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", chromePath); // chrome browser driver path
		WebDriver driver = new ChromeDriver();// driver pointing to chrome browser
		//driver.get(appUrl);// load a new web page
		//driver.get("http://www.google.co.in");
		driver.navigate().to("https://news.google.com");//load a new web page
		//driver.navigate().to(appUrl);//load a new web page
		driver.manage().window().maximize(); // maximize the browser
		String title = driver.getTitle();
		String currUrl = driver.getCurrentUrl();
		//String source = driver.getPageSource();
		Set<String> winHandle = driver.getWindowHandles();
		System.out.println(winHandle);
		System.out.println("Page title is "+title);
		System.out.println("current url is "+currUrl);
		//System.out.println("page source is");
		//System.out.println(source);
		driver.close(); // close the opened browser
		driver.quit(); // close all opened browsers
		
	}

}