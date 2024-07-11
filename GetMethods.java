package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) 
	{
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 String title = driver.getTitle();
		 System.out.println(title);
		 
		 System.out.println(driver.getCurrentUrl());
		 
		 System.out.println(driver.getPageSource());
	}

}
