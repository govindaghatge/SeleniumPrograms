package day8;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvent {

	public static void main(String[] args) 
	{
		 WebDriver driver = new ChromeDriver(); 
		 
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
         driver.get("https://demo-opencart.com/");
         driver.manage().window().maximize();	
         
         WebElement deskt = driver.findElement(By.xpath("//a[text()='Desktops']"));
         WebElement Mac = driver.findElement(By.xpath("//a[text()='Mac (2)']"));
         
         Actions act = new Actions(driver);	
         
         act.moveToElement(deskt).moveToElement(Mac).click().build().perform();
	}

}
