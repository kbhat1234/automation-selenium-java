package com.selenium.testing.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementTest1 {

	static String appUrl = "http://demoqa.com/html-contact-form/";
	static String driverPath = "E:\\browserdrivers\\chromedriver_win32\\chromedriver.exe";

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();

		driver.get(appUrl);
		driver.manage().window().maximize();
		//WebElement ele = driver.findElement(By.id("lname"));
		//System.out.println(ele.getText());
		Thread.sleep(4000);
		driver.findElement(By.className("firstname")).sendKeys("Karthik");
		driver.findElement(By.id("lname")).sendKeys("Bhat");
		driver.findElement(By.name("country")).sendKeys("India");
		WebElement ele = driver.findElement(By.id("subject"));
		String text = ele.getText();
		System.out.println(text);
		System.out.println(ele.getAttribute("id"));
		
		driver.findElement(By.id("subject")).sendKeys("Hello world");
		Dimension size = driver.findElement(By.id("subject")).getSize();
		System.out.println("Height is " + size.height);
		System.out.println("Width is " + size.width);
		
		WebElement element = driver.findElement(By.id("subject"));
		Point point = element.getLocation();
		System.out.println("X s is " + point.x + " Y point is " + point.y);
		boolean display = element.isDisplayed();
		System.out.println(display);
		boolean enable = element.isEnabled();
		System.out.println(enable);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/form/input[4]")).submit();
		driver.close();
		driver.quit();
		// element.getCssValue(propertyName)

	}

}
