package day9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysProgram {

	public static void main(String[] a) 
	{
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://text-compare.com/");
		 
		 driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Welcome");
		           
		 
		 Actions act = new Actions(driver);
		 act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();  // Select text
		 act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();  // Copy text
		 
		 act.keyDown(Keys.TAB).keyUp(Keys.TAB);  // Pressing Tab key
		 
		 act.keyDown(Keys.CONTROL).sendKeys("V").perform();		 
	}

}
