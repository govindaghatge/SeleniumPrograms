package day11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHrmTestCases 
{
   WebDriver Driver;
   
   @Test(priority=1)
   void OpenApp()
   {
	   Driver = new ChromeDriver();
	   Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   Driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   Driver.manage().window().maximize();
   }
   
   @Test(priority=3)
   void Logo() throws InterruptedException
   {
	   Thread.sleep(5000);
	   boolean logo =Driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	           System.out.println("logo is Display ?" + logo);
   }
   
   @Test(priority=6)
   void Login()
   {
	       Driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
           Driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
           Driver.findElement(By.xpath("//button[@type='submit']")).click();
   }
}
