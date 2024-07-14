package day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertHandleByExplicitWait 
{
           public static void main(String[] args) throws InterruptedException 
           {
        	   WebDriver driver = new ChromeDriver(); 
               driver.get("https://the-internet.herokuapp.com/javascript_alerts");
               
               driver.manage().window().maximize();
           
               driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
               
               WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                
               Alert alerts = wait.until(ExpectedConditions.alertIsPresent());
               
                     alerts.dismiss();
                    
		   }
}
