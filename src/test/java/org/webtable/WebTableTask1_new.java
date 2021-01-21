package org.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTask1_new {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saru\\eclipse-workspace\\SampleSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
//		List<WebElement> table = driver.findElements(By.xpath("//table[@id='customers']"));
//		
//		for (int i = 0; i < table.size(); i++) {
//			
//			WebElement x = table.get(i);
//			
//			System.out.println(x.getText());
//			
//			
//		}
		
		WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
		System.out.println(table.getText());
		
}
}