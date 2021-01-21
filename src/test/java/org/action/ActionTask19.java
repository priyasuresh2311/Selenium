package org.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionTask19 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saru\\eclipse-workspace\\SampleSelenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.flipkart.com");
	
	WebElement electronic = driver.findElement(By.xpath("//span[text()='Electronics']"));
	Actions a = new Actions(driver);
	a.moveToElement(electronic).perform();
	
	
	
}
}
