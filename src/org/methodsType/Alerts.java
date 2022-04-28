package org.methodsType;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Scanner;;

public class Alerts {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthinaga\\eclipse-workspace\\Selenium WD Methods\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
       
//        al.accept();
//        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        Alert al = driver.switchTo().alert();
        al.dismiss();
        WebElement demo = driver.findElement(By.id("demo"));
        String textDemo = demo.getText();
        System.out.println(textDemo);
        
        
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
    
        String text = al.getText();
        System.out.println(text);
        Scanner sc = new Scanner(System.in);
        String prmtip = sc.next();
        al.sendKeys(prmtip);
        al.accept();
        WebElement demo1 =   driver.findElement(By.id("demo1"));
        String textDemo1 = demo1.getText();
        System.out.println(textDemo1);        		
        
        
        
	}
}
