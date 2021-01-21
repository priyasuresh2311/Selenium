package org.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotTask5 {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyasuresh\\eclipse-workspace\\Selenium5\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement scrollTillJobOpen = driver.findElement(By.xpath("//h2[contains(text(),'Job Openings')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", scrollTillJobOpen);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\ScreenShots\\scrollTillJobOpenings.jpeg");
		FileUtils.copyFile(src, dest);
		
		Thread.sleep(2000);
		WebElement scrollUp = driver.findElement(By.xpath("//h3[contains(text(),'Online Classroom')]"));
		js.executeAsyncScript("arguments[0].scrollIntoView()", scrollUp );
		
		
}
}