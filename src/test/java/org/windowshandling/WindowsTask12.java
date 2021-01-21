package org.windowshandling;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsTask12 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saru\\eclipse-workspace\\SampleSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.findElement(By.xpath("//div[@id='heading303']")).click();
		
		driver.findElement(By.xpath("//a[text()=' DAY 10 TASK']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> l = new ArrayList<String>();
		l.addAll(windowHandles);
		driver.switchTo().window(l.get(1));
		
		WebElement element = driver.findElement(By.xpath("//pre[contains(text(), 'SELENIUM')]"));
		
		String text = element.getText();
		if (text.contains("QUESTION 14 URL : http://greenstech.in/selenium-course-content.html NOTE: Click Testng in Framework Test Paper print 4th  Question in practical")) 
		{
		System.out.println(text);
		}
		
		System.out.println(text);
		
		
}
}
