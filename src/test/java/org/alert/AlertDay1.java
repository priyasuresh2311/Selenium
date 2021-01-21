package org.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDay1 {
public static void main(String[] args)  {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyasuresh\\eclipse-workspace\\Selenium5\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	
	driver.findElement(By.xpath("//a[text()='Alert with OK ']")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
	
	Alert alert = driver.switchTo().alert();
	alert.accept();
}
}
