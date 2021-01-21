package org.windowshandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsTask5 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		int count=0;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saru\\eclipse-workspace\\SampleSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" http://www.greenstechnologys.com/");
		WebElement clickCourses = driver.findElement(By.xpath("//a[text()='COURSES']"));
		
		Actions a = new Actions(driver);
		a.moveToElement(clickCourses).perform();
		
		driver.findElement(By.xpath("(//span[text()='Python'])[1]")).click();
		
		WebElement rightClick = driver.findElement(By.xpath("(//button[text()='Explore Curriculum'])[1]"));
		a.contextClick(rightClick).perform();
		
		
		Thread.sleep(15000);
		driver.findElement(By.xpath("//span[text()='×']")).click();
		Robot r = new Robot();
		for (int i = 0; i < 2; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
					}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		String parentWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		
		for (String string : allWindows) {
			if (count==1) {
				driver.switchTo().window(string);
			}
		}
		Thread.sleep(3000);
		
		
		
		
}
}