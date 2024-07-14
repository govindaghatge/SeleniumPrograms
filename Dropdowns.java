package day6;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver(); 
		 
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();	
        
        WebElement dropdown = driver.findElement(By.id("country"));
        
        Select sel = new Select(dropdown);
        
        //sel.selectByIndex(2);
        //sel.selectByValue("france");
        sel.selectByVisibleText("Germany");
        
        List <WebElement> Options =  sel.getOptions();
        
         for(int i=0; i<Options.size(); i++)
         {
        	 System.out.println(Options.get(i).getText());
         }
        
        
	}

}
