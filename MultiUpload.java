package day10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiUpload {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		 
		 String img1 = "D:\\pictures\\1.jpg";
		 String img2 = "D:\\pictures\\4..webp";
		
		 //driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(img1+"\n"+img2);
		 driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("D:\\pictures\\1.jpg");
		 driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("D:\\pictures\\4..webp");
		 
		 int count = driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		     
		 if(count==2)
		 {
			 System.out.println("All files are uploaded1");
		 }
		 else
		 {
			 System.out.println("All files are not uploaded1");
		 }
		 
		 if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("1.jpg") && driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("4.webp"))
		 {
			 System.out.println("File names are matching");
		 }
		 else
		 {
			 System.out.println("File names are not matching");
		 }
		 
	}

}
