package org.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTask3_new {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saru\\eclipse-workspace\\SampleSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
	//to fetch all rows nd columns one by one
		for (int i = 0; i < rows.size(); i++) {
		
			
			WebElement row = rows.get(i);
//			System.out.println("\n"+row.getText());
			List<WebElement> dataCells = row.findElements(By.tagName("td"));
			
			for (int j = 0; j < dataCells.size(); j++) {
				WebElement data = dataCells.get(j);
				
				System.out.println(data.getText());
			}
			
			
		}
		
		
		
}
}