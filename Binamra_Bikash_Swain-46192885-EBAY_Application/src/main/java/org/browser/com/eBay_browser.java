package org.browser.com;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class eBay_browser {
	public static WebDriver driver;
	public static Actions act;
	public static  WebDriverWait wait;
		public static WebDriver setDriver()
		{
			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();     
		    return driver;	

		}

private static WebDriver setChromeDriver() {
	try {
		String driverPath = System.getProperty("user.dir") + "\\Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
	}catch(Exception e)
	{
		System.out.println("Chrome");
		System.out.println(e);
	}
	return driver;
		}

private static WebDriver setFirefoxDriver() {
			try {
				String driverPath=System.getProperty("user.dir") + "\\Driver\\geckodriver.exe";
				System.setProperty("webdriver.gecko.driver", driverPath);
				driver=new FirefoxDriver();
			}
			catch(Exception e)
			{
				System.out.println("FireFox");
				System.out.println(e);
			}
			return driver;
		}

public static String fileProperties(String urltype)
{
	String returnData=null;
	String searchurl=urltype;
	try {
		String driverlocation=System.getProperty("user.dir")+"\\Properties\\Configuration.properties";
		File file=new File(driverlocation);
		FileInputStream fileinput=new FileInputStream(file);
		Properties prop=new Properties();
		prop.load(fileinput);
		returnData=prop.getProperty(searchurl);
		System.out.println(returnData);
		
	}
	catch(Exception e)
	{
		System.out.println("Browser not found");
	}
	return returnData;
}
//Method to get title of the browser window
	public static String getTitle() throws Exception {
		String actualTitle = driver.getTitle();
		return actualTitle;			
	}
//Url Setup Method
	public static void getUrl(String siteurl) throws Exception {
		try {
		
		driver.get(siteurl);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		}catch(Exception e)
		{
		System.out.println("URL Method");
		System.out.println(e);
		}
	}
	public static void closeBrowser() {
		try {
			driver.quit();
		}catch(Exception e)
		{
			System.out.println("closing");
		}
	}
	
}

