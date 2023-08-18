package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mousehover {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nopcommerce.com/en/demo");
		WebElement ele=driver.findElement(By.xpath("//span[@class='user-actions-ico']//*[name()='svg']//*[name()='path' and contains(@fill-rule,'evenodd')]"));
		WebElement ele2=driver.findElement(By.xpath("//span[normalize-space()='Register']"));
		Actions act=new Actions(driver);
		
		act.moveToElement(ele).moveToElement(ele2).click().perform();
//		act.moveToElement(ele).perform();
//		act.moveToElement(ele2).click().perform();
		
		
		
		
//		act.dragAndDrop(ele, ele2).perform();
//		act.clickAndHold(ele).release(ele2)
		

	}

}
