package org.methodsType;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandlings {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\User\\eclipse-workspace\\Selenium WD Methods\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().window().maximize();
driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2doB4z')]")).click();
driver.findElement(By.xpath("//input[contains(@class,'_3704LK')]")).sendKeys("Redmi Mobiles");
driver.findElement(By.xpath("//button[contains(@class,'L0Z3Pu')]")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("(//div[contains(@class,'col col-7-12')])[1]")).click();
driver.findElement(By.xpath("(//div[contains(@class,'col col-7-12')])[2]")).click();
driver.findElement(By.xpath("(//div[contains(@class,'col col-7-12')])[3]")).click();
driver.findElement(By.xpath("(//div[contains(@class,'col col-7-12')])[4]")).click();
//System.out.println(trial1.size());
//for(int i=0;i<trial1.size();i++)
//{
//	WebElement inPage = trial1.get(i);
//WebElement output = inPage.findElement(By.className("_4rR01T"));
//output.click();
//
String Parent = driver.getWindowHandle();
Set<String> Child = driver.getWindowHandles();
System.out.println(Parent);
System.out.println(Child);

for(String x : Child)
{
	if(!Parent.equals(x)) {
		driver.switchTo().window(x);
		String text = driver.findElement(By.xpath("//span[contains(@class,'B_NuCI')]")).getText();
		System.out.println(text);
		
	}
}
}
}






