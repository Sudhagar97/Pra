package org.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practic {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\Dell\\sudha\\eclipse-workspace\\Practic\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement text=driver.findElement(By.xpath("//h2[contains(text(),'Facebook')]"));
		String s=text.getText();
		System.out.println(s);
		
		TakesScreenshot tk = (TakesScreenshot) driver; 
		
		File src = tk.getScreenshotAs(OutputType.FILE);
		
		File des = new File("D:\\Users\\Dell\\sudha\\eclipse-workspace\\Practic\\target");
		FileUtils.copyFile(src, des);
	}

}
