package org.methodsType;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicMethods_1 {
public static void main(String[] arg)
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthinaga\\eclipse-workspace\\Selenium WD Methods\\Driver\\chromedriver.exe");
	WebDriver site = new ChromeDriver();
	site.navigate().to("https://facebook.com/");
	site.manage().window().minimize();
	site.manage().window().maximize();
	String url = site.getCurrentUrl();
	String Title = site.getTitle();
	WebElement forget = site.findElement(By.xpath("//a[contains(text(),'Forgotten')]"));
	forget.click();
	site.navigate().back();
	System.out.println(url);
	System.out.println(Title);
	String input = "sasikumar197.dx@gmail.com";
	WebElement username = site.findElement(By.id("email"));
	username.sendKeys(input);
String us_n = 	username.getAttribute("value");
if(input.equals(us_n))
{
	System.out.println("pass");
}
else
{
	System.out.println();
}
	WebElement password = site.findElement(By.id("pass"));
	password.sendKeys("Sasi172096");

		WebElement login = site.findElement(By.xpath("//button[text()='Log In']"));
		login.click();
		
		WebElement element = site.findElement(By.xpath("//h2[contains(text(),'Facebook')]"));
		String t1 = element.getText();
	    System.out.println(t1);
	   
}
}
