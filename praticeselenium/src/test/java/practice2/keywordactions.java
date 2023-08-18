package practice2;

import java.util.concurrent.TimeUnit;

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
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
	WebElement ele=	driver.findElement(By.xpath("//input[@id='name']"));
	ele.sendKeys("venky");
	WebElement el=	driver.findElement(By.xpath("//input[@id='password']"));

	
		Actions act=new Actions(driver);
		act.keyDown(ele,Keys.CONTROL).sendKeys("a");
		act.keyUp(ele,Keys.CONTROL);
		
		act.keyDown(ele,Keys.CONTROL).sendKeys("c");
		act.keyUp(ele,Keys.CONTROL);
		
		act.sendKeys(Keys.TAB).perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("v");
		act.keyDown(el,Keys.CONTROL).sendKeys("v");
		
		//act.keyUp(ele,Keys.CONTROL);
		
		
		act.perform();
		
	}

}
