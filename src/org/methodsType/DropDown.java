package org.methodsType;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
public static void main(String[] arg) throws Throwable
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthinaga\\eclipse-workspace\\Selenium WD Methods\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://demoqa.com/select-menu");
	driver.manage().window().maximize();
    WebElement sinDrDo = driver.findElement(By.xpath("//select[contains(@id,'oldSelectMenu')]"));
    Select s = new Select(sinDrDo);
boolean multiple = s.isMultiple();
System.out.println(multiple);
s.selectByIndex(1);
Thread.sleep(3000);
//s.selectByValue("10");
//Thread.sleep(3000);
s.selectByVisibleText("Black");
List<WebElement> options = s.getOptions();

for(int i=0;i<options.size();i++)
{
	WebElement opt = options.get(i);
	String text = opt.getText();
	System.out.println(text);
}
	WebElement multipleDrDo = driver.findElement(By.xpath("//select[contains(@id,'cars')]"));
	Select s1 = new Select(multipleDrDo);
	boolean mutiple1 = s1.isMultiple();
	System.out.println(mutiple1);
	s1.selectByIndex(0);
	s1.selectByIndex(1);
	s1.selectByIndex(2);	
	s1.deselectByIndex(2);
	List<WebElement> options1 = s1.getOptions();
	for(int j = 0; j<options1.size();j++)
	{
		WebElement opt1 = options1.get(j);
		String text1 = opt1.getText();
		System.out.println("Select available opt: "+text1);
	}
	List<WebElement> options2 = s1.getAllSelectedOptions();
	for(int k = 0; k<options2.size();k++)
	{
		WebElement opt2 = options2.get(k);
		String text2 = opt2.getText();
		System.out.println("Select Selected opt: "+text2);
}
	WebElement element = s1.getFirstSelectedOption();
	String text3 = element.getText();
	System.out.println("Select First opt: "+text3);
}
}