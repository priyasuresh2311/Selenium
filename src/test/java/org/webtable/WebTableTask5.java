package org.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTask5 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Saru\\eclipse-workspace\\SampleSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		// to fetch all rows nd columns one by one
		for (int i = 0; i < rows.size(); i++) {
			if (i % 2 == 0) {
				WebElement row = rows.get(i);
				List<WebElement> dataCells = row.findElements(By.tagName("td"));

				// System.out.println("\n"+row.getText());

				for (int j = 0; j < dataCells.size(); j++) {
					if (j%2==0) {
						WebElement data = dataCells.get(j);

						System.out.println(data.getText());
					}
					}
					
			}

		}
	}
}