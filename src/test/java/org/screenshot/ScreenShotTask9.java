package org.screenshot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotTask9 {
public static void main(String[] args) throws IOException, AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyasuresh\\eclipse-workspace\\Selenium5\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
	Robot r = new Robot();
	WebElement element = driver.findElement(By.xpath("//input[@type='text']"));
	element.sendKeys("iphone 11");
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	Thread.sleep(2000);
	
	TakesScreenshot ts = (TakesScreenshot) driver;
	File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
	File saveFileAs = new File("D:\\ScreenShots\\flipkartscreenshot.jpg");
	FileUtils.copyFile(screenshotAs, saveFileAs);
}
}
