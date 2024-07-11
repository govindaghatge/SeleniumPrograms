package day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.network.Header;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) 
	{
		  WebDriver driver = new ChromeDriver();
		       driver.manage().window().maximize();
		  	   driver.get("https://demo-opencart.com/");
		  	   driver.findElement(By.name("search")).sendKeys("Mobile");
		  	   driver.findElement(By.tagName("button")).click();  	   
		  	   
	  	   boolean status=driver.findElement(By.id("logo")).isDisplayed();
		          System.out.println(status);
		  	   
		  	   driver.findElement(By.partialLinkText("Cam")).click();
		  	   
		  	   List<WebElement> headerlist = driver.findElements(By.className("list-inline-item"));
		  	                
		  	                   System.out.println(headerlist.size());
		  	   
		  	   List<WebElement> Imglist = driver.findElements(By.tagName("img"));
      
		  	   				   System.out.println(Imglist.size());
	
		  	   //driver.close();
	}
}
