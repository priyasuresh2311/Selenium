package org.screenshot;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScreenShotTask2 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyasuresh\\eclipse-workspace\\Selenium5\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement down = driver.findElement(By.xpath("//span[text()='Recent Articles']"));
		js.executeScript("arguments[0].scrollIntoView(false)", down);
		
		
		
		
		
		
}
}