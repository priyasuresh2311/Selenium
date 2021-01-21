package org.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptTask4 {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saru\\eclipse-workspace\\SampleSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement txtEmail = driver.findElement(By.id("email"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value', 'priya')", txtEmail);
		
		Object object = js.executeScript("return arguments[0].getAttribute('value')", txtEmail);
		 String s = (String) object;
		System.out.println(s);
		
		
		WebElement txtPass = driver.findElement(By.id("pass"));
		js.executeScript("arguments[0].setAttribute('value', 'suri@123')", txtPass);
		
		WebElement btnLogin = driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click()", btnLogin);
		
		Thread.sleep(3000);
		
		



}
}