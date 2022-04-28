package org.methodsType;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	public static void main(String[] arg)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karthinaga\\eclipse-workspace\\Selenium WD Methods\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://amazon.in");
		WebElement element = driver.findElement(By.xpath("//span[@class='nav-line-2']"));
		Actions acc = new Actions(driver);
		acc.moveToElement(element).perform();
		WebElement helloSignIn = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		acc.moveToElement(helloSignIn).perform();
		
	}

}
