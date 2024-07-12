package day2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException 
	{
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		
		 
		 String title = driver.getTitle();
		 System.out.println(title);
		 
		 System.out.println(driver.getCurrentUrl());
		 
		 //System.out.println(driver.getPageSource());

		 System.out.println(driver.getWindowHandle());
		 
		 Thread.sleep(5000);
		 
		 driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		 Set<String> windowIds= driver.getWindowHandles();
		            System.out.println(windowIds);
		           
	}

}
