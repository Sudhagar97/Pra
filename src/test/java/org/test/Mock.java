package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Mock {
	public static WebDriver driver;
	@BeforeClass
	private void beforeclass() {
		System.setProperty("webdriver.chrome.driver","D:\\Users\\Dell\\sudha\\eclipse-workspace\\TestNg1\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/HotelAppBuild2/");

	}
	
	@Test(dataProvider="data")
	private void test(String s1, String s2) {
		WebElement fillname = driver.findElement(By.id("username"));
		fillname.sendKeys(s1);
		
		WebElement fillpass = driver.findElement(By.id("password"));
		fillpass.sendKeys(s2);

	}
	
	
	
@DataProvider(name="data")
public static Object[][] getdata(){
	return new Object[][] {
		{"sudhagar", "12345"},
		{"surya", "7899786"}};
	
}
}
