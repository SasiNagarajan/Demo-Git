package org.methodsType;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Scanner;

public class FlipKart {

	public static void main(String[] args) throws Throwable {
		Scanner sc = new Scanner(System.in);
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthinaga\\eclipse-workspace\\Selenium WD Methods\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.navigate().to("https://flipkart.com/");
	driver.manage().window().maximize();
//	driver.navigate().refresh();
	Thread.sleep(10000);
	WebElement us_n = driver.findElement(By.xpath("//input[@autocomplete='off']"));
	us_n.sendKeys("7845851910");
	WebElement otpWay = driver.findElement(By.xpath("//button[text()='Request OTP']"));
	otpWay.click();      
String otp = sc.next();
WebElement otpinput = driver.findElement(By.xpath("//input[@maxlength='1']"));
otpinput.sendKeys(otp);
WebElement verify = driver.findElement(By.xpath("//button[contains(text(),'Verify']"));
verify.click();
	}
}
