package practice2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Draganddrop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement ele=driver.findElement(By.xpath("//div[@id='box1']"));
		WebElement el=driver.findElement(By.xpath("//div[@id='box106']"));
		Actions act=new Actions(driver);
		
		//act.clickAndHold(ele).release(el).perform();
        act.dragAndDrop(ele, el).perform();
	}

}
