package day10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demo.nopcommerce.com/");
		 
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 
//		 js.executeScript("window.scrollBy(0,700)","");
//		 
//		 System.out.println(js.executeScript("return window.pageYOffset"));
           
		 WebElement ele = driver.findElement(By.xpath("//strong[text()='Featured products']"));
		 
		 js.executeScript("arguments[0].scrollIntoView();", ele);
		 System.out.println(js.executeScript("return window.pageYOffset"));
		 
		 
		 js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		 System.out.println(js.executeScript("return window.pageYOffset"));
		 
		 Thread.sleep(2000);
		 
		 js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		 System.out.println(js.executeScript("return window.pageYOffset"));
	}

}
