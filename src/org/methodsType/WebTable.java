package org.methodsType;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
public static void main(String[] arg)
{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthinaga\\eclipse-workspace\\Selenium WD Methods\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.navigate().to("https://www.techlistic.com/p/demo-selenium-practice.html");
driver.manage().window().maximize();
List<WebElement> table = driver.findElements(By.tagName("table"));
for(int i = 1;i<table.size();i++)
{
	WebElement tableData = table.get(i);
	List<WebElement> iBody = tableData.findElements(By.tagName("tbody"));
	for(int j = 0;j<iBody.size();j++)
	{
		WebElement row = iBody.get(j);
		List<WebElement> content = row.findElements(By.tagName("td"));
		for(int k = 0;k<content.size();k++)
		{
			WebElement text = content.get(k);
			String text2 = text.getText();
		    System.out.println(text2);	
	}
}
}
}
}
