package org.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTask10 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saru\\eclipse-workspace\\SampleSelenium\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("priyasuresh221");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("supriya16");
		
		WebElement loginBtn = driver.findElement(By.id("login"));
		loginBtn.click();
		
		WebElement location = driver.findElement(By.id("location"));
		Select s = new Select(location);
		List<WebElement> options = s.getOptions();
		for (WebElement allOptions : options) {
			String text = allOptions.getText();
			System.out.println(text);
		}
		
		
		
}
}