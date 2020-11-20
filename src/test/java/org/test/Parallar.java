package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Parallar {
	public static WebDriver driver;
	@Parameters({"Browsername"})
	@BeforeClass
	private void beforeclass(String s) {
		if (s.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Users\\Dell\\sudha\\eclipse-workspace\\TestNg1\\Driver\\chromedriver.exe");
		    driver=new ChromeDriver();
		}else if (s.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Users\\Dell\\sudha\\eclipse-workspace\\TestNg1\\Driver\\geckodriver.exe");
			driver=new FirefoxDriver();
		}else if (s.equals("IE")) {
		    System.setProperty("webdriver.ie.driver", "D:\\Users\\Dell\\sudha\\eclipse-workspace\\TestNg1\\Driver\\IEDriverServer.exe");			
		    driver=new InternetExplorerDriver();
		}

	}

}
