package package3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keywordactions {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nopcommerce.com/en/register?returnUrl=%2Fen");
		WebElement ele=driver.findElement(By.xpath("//input[@id='FirstName']"));
		ele.sendKeys("venky");
		//WebElement el=driver.findElement(By.xpath(""));
        Actions act=new Actions(driver);
      //  act.keyDown(ele, Keys.SHIFT).sendKeys("venky").perform();
        
        act.keyDown(ele,Keys.CONTROL).sendKeys("a");
        act.keyDown(ele,Keys.CONTROL).sendKeys("c");
        act.keyUp(Keys.CONTROL);
        act.sendKeys(Keys.TAB);
        act.keyDown(Keys.CONTROL).sendKeys("v").perform();
        WebElement e=driver.findElement(By.xpath("//input[@id='ConfirmEmail']"));
        act.keyDown(e,Keys.CONTROL).sendKeys("v").perform();
        
        
	}

}
