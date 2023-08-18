package package3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class draganddrop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
		WebElement ele=driver.findElement(By.xpath("//div[@id='box2']"));
		WebElement el=driver.findElement(By.xpath("//div[@id='box106']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(ele, el).perform();
		//act.clickAndHold(ele).release(el).perform();

	}

}
