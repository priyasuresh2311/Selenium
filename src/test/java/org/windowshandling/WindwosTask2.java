package org.windowshandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindwosTask2 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Saru\\eclipse-workspace\\SampleSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/ ");

		WebElement txt = driver.findElement(By.xpath("(//input[@name='keyword'])[1]"));
		txt.sendKeys("kids toy");

		driver.findElement(By.xpath("//span[text()='Search']")).click();
		// Robot r = new Robot();
		// r.keyPress(KeyEvent.VK_ENTER);
		// r.keyPress(KeyEvent.VK_ENTER);

		driver.findElement(By.xpath(
				"//p[text()='HAYWARD TOYS ® represents 37 Key Piano Keyboard Toy for Kids with Mic &USB Charging Cable Not for professional purpose)']"))
				.click();

		String parentWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();

		for (String string : allWindows) {
			if (!parentWindow.equals(allWindows)) {
				driver.switchTo().window(string);
			}
		}

		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='add to cart']")).click();
		Thread.sleep(3000);
		WebElement price = driver.findElement(By.xpath("(//span[text()='Rs. 749'])[2]"));
		System.out.println(price.getText());

	}
}