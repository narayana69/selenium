package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		//   DRAG AND DROP
		
		
		
//		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
//		
//		WebElement ele=driver.findElement(By.xpath("//div[@id='box2']"));
//		WebElement ele2=driver.findElement(By.xpath("//div[@id='box106']"));
//		
//		Actions act=new Actions(driver);
//		 
//		//act.clickAndHold(ele).release(ele2).perform();
//		act.dragAndDrop(ele, ele2).perform();
//		   
		
		
		//DOUBLE CLICK
		
//		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick");
//		
//		driver.switchTo().frame("iframeResult");
//		WebElement ele=driver.findElement(By.xpath("//button[normalize-space()='Double-click me']"));
//		
//		Actions act=new Actions(driver);
//		act.doubleClick(ele).perform();
		
		//RIGHT CLICK
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement ele=driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		Actions act=new Actions(driver);
		act.contextClick(ele).perform();
	}

}
