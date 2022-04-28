package org.methodsType;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robots {
	public static void main(String[] arg) throws Throwable 
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\karthinaga\\eclipse-workspace\\Selenium WD Methods\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.navigate().to("https://facebook.com/");
    driver.manage().window().maximize();
    WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
//    WebElement us_n =     driver.findElement(By.xpath("//input[@autocomplete='off']"));
    username.sendKeys("Sasikumar");
    Actions acc = new Actions(driver);
    acc.doubleClick(username).perform();
    acc.contextClick(username).perform();
    
    Robot r = new Robot();
    for(int i = 1;i<3;i++)
    {
    r.keyPress(KeyEvent.VK_DOWN);
    r.keyRelease(KeyEvent.VK_DOWN);
    }
    r.keyPress(KeyEvent.VK_ENTER);		
    r.keyRelease(KeyEvent.VK_ENTER);
    r.keyPress(KeyEvent.VK_TAB);
    r.keyPress(KeyEvent.VK_CONTROL);
    r.keyPress(KeyEvent.VK_V);
    r.keyRelease(KeyEvent.VK_CONTROL);
    r.keyRelease(KeyEvent.VK_V);
	}
}
