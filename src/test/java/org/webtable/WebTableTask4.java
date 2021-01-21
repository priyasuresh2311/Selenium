package org.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTask4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saru\\eclipse-workspace\\SampleSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//to get the last row last element
		WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		WebElement row = rows.get(rows.size()-1);
		
		List<WebElement> datas = row.findElements(By.tagName("td"));
		WebElement data = datas.get(datas.size()-1);
		System.out.println(data.getText());
		
	}}