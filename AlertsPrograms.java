package day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsPrograms {

	public static void main(String[] args) throws InterruptedException 
	{
         WebDriver driver = new ChromeDriver(); 
         driver.get("https://the-internet.herokuapp.com/javascript_alerts");
         
         
         driver.manage().window().maximize();
         
        //driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
         
       
         //Alert Alert = driver.switchTo().alert();
         //driver.switchTo().alert().accept();
         
         //driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
         Thread.sleep(2000);
         
         //driver.switchTo().alert().accept();
         //driver.switchTo().alert().dismiss();
         
         driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
         Alert Alert = driver.switchTo().alert();
         System.out.println(Alert.getText());
        
         Alert.sendKeys("Hello");
         
         Alert.accept();
	}

}
