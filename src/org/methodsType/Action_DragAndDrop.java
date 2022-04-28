package org.methodsType;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_DragAndDrop {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthinaga\\eclipse-workspace\\Selenium WD Methods\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Actions acc = new Actions(driver);
		WebElement source1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement dest1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		acc.dragAndDrop(source1, dest1).perform();
		Thread.sleep(3000);
		
		WebElement source2 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement dest2 = driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		acc.dragAndDrop(source2, dest2).perform();
		Thread.sleep(3000);
		WebElement source3 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement dest3 = driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
		acc.dragAndDrop(source3, dest3).perform();
		Thread.sleep(3000);
		WebElement source4 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement dest4 = driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
		acc.dragAndDrop(source4, dest4).perform();
		
		TakesScreenshot tk = (TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File desc = new File("C:\\Users\\karthinaga\\eclipse-workspace\\Selenium WD Methods\\Library\\DragAndDrop");
		FileUtils.copyFile(src,desc);
		
		
	}

}
