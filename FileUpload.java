package day10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FileUpload {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		 
		 driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("D:\\pictures\\1.jpg");
		 
		 if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("1.jpg"))
		 {
			 System.out.println("Uploading Pass");
		 }
		 else
		 {
			 System.out.println("Uploading Failed");
		 }
		
	}

}
