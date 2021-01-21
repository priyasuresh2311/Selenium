package org.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDay5 {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyasuresh\\eclipse-workspace\\Selenium5\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
	
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Alert alert = driver.switchTo().alert();
	String text = alert.getText();
	System.out.println(text);
	alert.accept();
}
}