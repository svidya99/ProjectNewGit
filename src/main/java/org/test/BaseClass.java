package org.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
public static WebDriver driver;
public static WebDriver chromeLaunch() {
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	return driver;
	}
	 public static void edgeLaunch()
	 {
		 WebDriverManager.edgedriver().setup();
		 driver=new EdgeDriver();
	 }
//launch url
	 public static void urlLaunch(String url)
	 {
		 driver.get(url);
		 driver.manage().window().maximize();
	 }
	 //impwait
	 public static void impWait(int sec)
	 {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	 }
//get title
	 public static String getTitle()
	 {
		 String title=driver.getTitle();
		 return title;
	 }
//getCurrent url
	 public static String getCurrentUrl()
	 {
		 String url= driver.getCurrentUrl();
		 return url;
	 }
	 //sendKeys
	 public static void sendKey(WebElement e, String data) {
		 e.sendKeys(data);
		

	}
}
