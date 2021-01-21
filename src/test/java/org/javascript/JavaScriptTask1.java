package org.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptTask1 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saru\\eclipse-workspace\\SampleSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement scrollDown = driver.findElement(By.xpath("//span[text()='Greens Technologies Porur']"));
		js.executeScript("arguments[0].scrollIntoView()", scrollDown);
		
		String text = scrollDown.getText();
		System.out.println(text);
		
}
}