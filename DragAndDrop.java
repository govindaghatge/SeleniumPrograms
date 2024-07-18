package day8;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
         
		 //Drag and Drop 1
		 WebElement Rome = driver.findElement(By.id("box6"));
		 WebElement Italy = driver.findElement(By.id("box106"));
		 
		//Drag and Drop 1
		 WebElement Spain = driver.findElement(By.id("box107"));
		 WebElement Madrid = driver.findElement(By.id("box7"));
		 WebElement box = driver.findElement(By.id("capitals"));
		 
		 Actions Act = new Actions(driver);
		 
		 Act.dragAndDrop(Rome,Italy).perform();
		 
		 Act.dragAndDrop(Madrid,Spain).perform();
		 
		 Act.dragAndDrop(Madrid, box).perform();

	}

}
