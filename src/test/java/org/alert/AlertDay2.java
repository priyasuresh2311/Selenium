package org.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDay2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyasuresh\\eclipse-workspace\\Selenium5\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
	driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
	
	Alert alert = driver.switchTo().alert();
	alert.getText();
	alert.accept();
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement element = driver.findElement(By.xpath("//p[text()='You pressed Ok']"));
	Object object = js.executeScript("arguments[0].setAttribute('Style', 'background:yellow')", element);
	String s = (String) object;
	System.out.println(s);
	
	
}
}
