package day6;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropDown {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver(); 
		 
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();	
        
        driver.findElement(By.name("q")).sendKeys("selenium");
	
	    List <WebElement> option = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
	    
	    System.out.println(option.size());
    
	    for(int i=0; i<option.size();i++)
	    {	    
	    	if(option.get(i).getText().equals("selenium"))
	   
	    	{
	    		option.get(i).click();
	    		break;
	    	}
	    }
	    
/*	    for(WebElement op: option)
	    {
	    	if(op.getText().equals("selenium"))
	    	{
	    	  op.click();
	    	}
	    }
*/	    
	}
	

}
