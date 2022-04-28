package org.methodsType;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthinaga\\eclipse-workspace\\Selenium WD Methods\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		
		List<WebElement> frameSize = driver.findElements(By.tagName("iframe"));
		System.out.println(frameSize.size());
		
		driver.switchTo().frame("frame1");
		WebElement element = driver.findElement(By.xpath("//*[text()='Topic :']/following-sibling::input"));
		element.sendKeys("hi this is Sasikumar");
		driver.switchTo().frame("frame3");
		WebElement element2 = driver.findElement(By.xpath("//input[contains(@id,'a')]"));
		element2.click();
		driver.switchTo().defaultContent();
		WebElement textpr = driver.findElement(By.xpath("//span[contains(text(),'Not a Friendly Topic')]"));
		String text = textpr.getText();
		System.out.println(text);
		WebElement textpr1 = driver.findElement(By.xpath("//h1[contains(@class,'breadcrumb-item')]"));
		String text1 = textpr1.getText();
		System.out.println(text1);
		driver.switchTo().frame("frame2");
		WebElement singleDropDown = driver.findElement(By.xpath("//select[contains(@class,'col-lg-3')]"));
		Select s = new Select(singleDropDown);
		s.selectByIndex(2);		
		}

}
