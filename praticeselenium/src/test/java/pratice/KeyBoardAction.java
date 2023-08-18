package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nopcommerce.com/en/register?returnUrl=%2Fen%2Fdemo");
		 
		WebElement ele=driver.findElement(By.xpath("//input[@id='FirstName']"));
		WebElement ele2=driver.findElement(By.xpath("//input[@id='ConfirmEmail']"));
		ele.sendKeys("venkat");
		
		Actions act=new Actions(driver);

		act.keyDown(ele, Keys.SHIFT).sendKeys("venky");
		act.keyUp(ele, Keys.SHIFT);
		act.keyDown(ele, Keys.CONTROL).sendKeys("a");
		act.keyUp(ele, Keys.CONTROL);
		act.keyDown(ele, Keys.CONTROL).sendKeys("c");
		act.keyUp(ele, Keys.CONTROL);
	//	act.sendKeys(Keys.TAB);
		act.keyDown(ele2, Keys.CONTROL).sendKeys("v");
	//act.keyUp(ele2, Keys.CONTROL);
		act.perform();
		
		
		
		
		
		
	}
	}


