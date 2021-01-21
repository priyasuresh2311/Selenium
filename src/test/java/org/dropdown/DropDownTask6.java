package org.dropdown;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTask6 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saru\\eclipse-workspace\\SampleSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		WebElement countryName = driver.findElement(By.xpath("//select[@name='country']"));
		countryName.click();
		Select s = new Select(countryName);
		List<WebElement> options = s.getOptions();
		for (WebElement x : options) {
				
			System.out.println(x.getText());
		}
	
	
	}
}