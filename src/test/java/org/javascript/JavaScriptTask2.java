package org.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptTask2 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saru\\eclipse-workspace\\SampleSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/");
		WebElement scrollDown = driver.findElement(By.xpath("//div[text()='Share this page']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", scrollDown);
		
		WebElement scrollUp = driver.findElement(By.xpath("//span[text()='Latest Tutorials']"));
		js.executeScript("arguments[0].scrollIntoView()", scrollUp);
		
	
	
	
	
	
	}
}