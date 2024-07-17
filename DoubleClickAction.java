package day8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		 
		 driver.switchTo().frame("iframeResult");
		 
		 WebElement Field1 = driver.findElement(By.xpath("//input[@id='field1']"));
		 WebElement Field2 = driver.findElement(By.xpath("//input[@id='field2']"));
		 WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));

		 Field1.clear();
		 
		 Field1.sendKeys("Welcome");
		 
		 Actions act = new Actions(driver);
		 act.doubleClick(button).perform();
		 
		 System.out.println(Field2.getText());
		 
	}

}



//input[@id='field2']
//input[@id='field1']
//button[normalize-space()='Copy Text']