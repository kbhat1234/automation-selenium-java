package com.selenium.testing.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FirstTestCase {

public static void main(String[] args) throws InterruptedException {
DesiredCapabilities capabilities = DesiredCapabilities.firefox();
capabilities.setCapability("marionette", true);
@SuppressWarnings("deprecation")
WebDriver driver = new FirefoxDriver(capabilities);
driver.get("http://www.toolsqa.com");

Thread.sleep(5000);
driver.quit();
}
}
