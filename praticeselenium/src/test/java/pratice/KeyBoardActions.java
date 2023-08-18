package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://text-compare.com/");
		
		WebElement ele= driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		WebElement ele1= driver.findElement(By.xpath("//textarea[@id='inputText2']"));
		ele.sendKeys("this is my first");
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		//Thread.sleep(2000);
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();
	//	Thread.sleep(2000);
		
        act.sendKeys(Keys.TAB);
        act.perform();
        //act.keyUp(Keys.TAB);
       // Thread.sleep(2000);
        
        act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
        act.perform();
       
        
	}

}
