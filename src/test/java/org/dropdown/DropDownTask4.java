package org.dropdown;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTask4 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saru\\eclipse-workspace\\SampleSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(3000);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		month.click();
		Select s = new Select(month);
		List<WebElement> options = s.getOptions();
		for (int j = 0; j < options.size(); j++) {
			WebElement allMonths = options.get(j);
			
			String text = allMonths.getText();
			if (text.startsWith("J")) {
				System.out.println(text);
			}
			
			
			
		}
		
		
		
		
		
		
		
}
}