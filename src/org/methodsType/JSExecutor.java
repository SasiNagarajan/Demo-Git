package org.methodsType;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutor {

	public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthinaga\\eclipse-workspace\\Selenium WD Methods\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://facebook.com/");
	driver.manage().window().maximize();
	
	WebElement usna = driver.findElement(By.xpath("(//input[contains(@class,'inputtext _55r1 _6luy')][1])"));
//	usna.sendKeys("7845851910");
	
	WebElement pass = driver.findElement(By.xpath("//input[contains(@class,'inputtext _55r1 _6luy _9npi')]"));
//	pass.sendKeys("Sasi172096");
	
	WebElement click = driver.findElement(By.xpath("//button[contains(@name,'login')]"));
//click.click();
	WebElement down = driver.findElement(By.linkText("Careers"));
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].setAttribute('value','7845851910')", usna);
	js.executeScript("arguments[0].setAttribute('value','Sasi172096')", pass);
//	js.executeScript("arguments[0].click()", click);
	Object usnaga = js.executeScript("return arguments[0].getAttribute('value')", usna);
	Object passga = js.executeScript("return arguments[0].getAttribute('value')", pass);
	System.out.println(usnaga);
	System.out.println(passga);
	
	js.executeScript("arguments[0].scrollIntoView(true)", down);
	Thread.sleep(5000);
	js.executeScript("arguments[0].scrollIntoView(false)", usna);		
	}
}
