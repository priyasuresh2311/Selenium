package org.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTask3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saru\\eclipse-workspace\\SampleSelenium\\driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	Thread.sleep(3000);
	
	
	WebElement year = driver.findElement(By.id("year"));
	Select s = new Select(year);
	List<WebElement> options = s.getOptions();
	for (int i = 0; i < options.size(); i++) {
	WebElement allOption = options.get(i);
	
		String attribute = allOption.getAttribute("value");
		System.out.println(attribute);
	}
	
	}
	
	
}

