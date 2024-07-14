package day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement Male = driver.findElement(By.xpath("//input[@id='male']"));
		WebElement Female = driver.findElement(By.xpath("//input[@id='female']"));
		
		System.out.println(Male.isSelected());
		System.out.println(Female.isSelected());
		
		Female.click();
		           
		System.out.println(Female.isSelected());

        
	}

}
