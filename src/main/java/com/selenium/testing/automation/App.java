package com.selenium.testing.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class App {

	static String chromePath="E:\\browserdrivers\\chromedriver_win32\\chromedriver.exe";
	static String iePath="E:\\browserdrivers\\IEDriverServer_x64_3.2.0\\IEDriverServer.exe";
    public static void main(String[] args) {
    	//System.setProperty("webdriver.chrome.driver", chromePath);
    	//WebDriver driver = new ChromeDriver();
    	System.setProperty("webdriver.ie.driver", iePath);
    	WebDriver driver = new InternetExplorerDriver();
    	
    	driver.get("http://toolsqa.com/automation-practice-form/");
        driver.close();
       
    }

}
