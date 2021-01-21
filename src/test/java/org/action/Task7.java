package org.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Task7 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saru\\eclipse-workspace\\SampleSelenium\\driver\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
        
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("http://greenstech.in/selenium-course-content.html");
		Actions a = new Actions(driver);
		WebElement course = driver.findElement(By.xpath("//div[text()='Courses ']"));
		a.moveToElement(course).perform();;
		WebElement oracle = driver.findElement(By.xpath("//span[text()='Oracle (48)']"));
		

		a.moveToElement(oracle).perform();
		
		WebElement oracleTraining = driver.findElement(By.xpath("//span[text()='SQL Certification Training']"));
		oracleTraining.click();


}
}
