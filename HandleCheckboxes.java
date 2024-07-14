package day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes {

	public static void main(String[] args)
	{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://testautomationpractice.blogspot.com/");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			WebElement checkb = driver.findElement(By.xpath("//input[@id='sunday']"));
			        System.out.println(checkb.isSelected());
			        
			//driver.findElement(By.xpath("//input[@id='sunday']")).click();
					System.out.println(checkb.isSelected());
			
			List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
			        System.out.println(checkboxes.size());
			        
/*			        for(WebElement cb: checkboxes)
			        {
			        	cb.click();
			        }
			        */
			        
			 for(int i=4; i<checkboxes.size(); i++)
			 {
				 checkboxes.get(i).click();
			 }
			        
		    //driver.close();
			
	}

}
