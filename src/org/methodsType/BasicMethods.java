package org.methodsType;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class BasicMethods {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.opera.driver", "C:\\Users\\karthinaga\\eclipse-workspace\\Selenium WD Methods\\Driver\\operadriver.exe");
		WebDriver driver = new OperaDriver();
        driver.navigate().to("https://flipkart.com/");
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(5000);
        driver.navigate().forward();
        Thread.sleep(5000);
      String url = driver.getCurrentUrl();
      String Title =  driver.getTitle();
      String pagecode = driver.getPageSource();
      String[] split = pagecode.split(";");
      for(String s:split)
      {
    	   System.out.println(s);
      }
   
      System.out.println(url);
      System.out.println(Title);
        driver.close();
        driver.quit();
	}
}
