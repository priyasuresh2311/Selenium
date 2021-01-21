package org.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptTask3 {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saru\\eclipse-workspace\\SampleSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement scrollDown = driver.findElement(By.xpath("//h2[contains(text(),'Framework Test Papers')]"));
		JavascriptExecutor js =(JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView()", scrollDown);
		
		
		
}
}