package org.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotTask1 {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Priyasuresh\\\\eclipse-workspace\\\\Selenium5\\\\driver\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.greenstechnologys.com/");
	driver.manage().window().maximize();
	//typecasting
	TakesScreenshot ts =  (TakesScreenshot) driver;
	//take screenshot and stored in temp location
	File src = ts.getScreenshotAs(OutputType.FILE);
	//create a new file location
	File dest = new File("D:\\ScreenShots\\screen.jpg");
	
	FileUtils.copyFile(src, dest);
	
	
	
	
}
}
