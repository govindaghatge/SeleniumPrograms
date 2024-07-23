package day9;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowSwitching {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demo.nopcommerce.com/");
		 
		 WebElement register =driver.findElement(By.xpath("//a[@class='ico-register']"));
		 
		 Actions act = new Actions(driver);
		        
		 act.keyDown(Keys.CONTROL).click(register).keyUp(Keys.CONTROL).perform();
		 
		 List<String> ids = new ArrayList(driver.getWindowHandles());
		 
		 driver.switchTo().window(ids.get(1));
		 
		 driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Govinda");
		 
		 driver.switchTo().window(ids.get(0));
		 
		 driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Mobile");

	}

}
