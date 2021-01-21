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

public class WindowsTask1 {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saru\\eclipse-workspace\\SampleSelenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.com/");
	
	WebElement txt = driver.findElement(By.id("twotabsearchtextbox"));
	txt.sendKeys("iphone x");
	
	driver.findElement(By.id("nav-search-submit-button")).click();
	
	Actions a = new Actions(driver);
	WebElement toClick = driver.findElement(By.xpath("//span[text()='Apple iPhone X, 64GB, Space Gray - Fully Unlocked (Renewed Premium)']"));
	
	a.contextClick(toClick).perform();
	 Robot r = new Robot();
	 r.keyPress(KeyEvent.VK_DOWN);
	 r.keyRelease(KeyEvent.VK_DOWN);

	 r.keyPress(KeyEvent.VK_ENTER);
	 r.keyRelease(KeyEvent.VK_ENTER);
	 
	 String parentWindow = driver.getWindowHandle();
	 Set<String> allWindows = driver.getWindowHandles();
	 
	 for (String string : allWindows) {
		 if (!parentWindow.equals(allWindows)) {
			 driver.switchTo().window(string);
		}
	}
	 Thread.sleep(3000);
	 WebElement price = driver.findElement(By.xpath("//span[@id='priceblock_ourprice']"));
	 System.out.println(price.getText());
}
}
