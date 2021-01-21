package org.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Task1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saru\\eclipse-workspace\\SampleSelenium\\driver\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
        
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
        
		Actions a = new Actions(driver);
		WebElement source1 = driver.findElement(By.xpath("//a[text()=' BANK ']"));
        WebElement dest1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	    
	    WebElement source2 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
        WebElement dest2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
        
        WebElement source4 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
        WebElement dest4 = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
        
        WebElement source3 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
        WebElement dest3 = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
        
        
        
        a.dragAndDrop(source1, dest1).perform();
	    a.dragAndDrop(source2, dest2).perform();
	    a.dragAndDrop(source4, dest4).perform();
	    a.dragAndDrop(source3, dest3).perform();
	    
	
	
	}}