package package3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class autocompletegoogleplacesdropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.twoplugs.com/");
		driver.findElement(By.xpath("//a[normalize-space()='Live Posting']")).click();
		WebElement ele=driver.findElement(By.xpath("//input[@id='autocomplete']"));
		ele.clear();
		ele.sendKeys("venky");
		String text;
		do {
			ele.sendKeys(Keys.ARROW_DOWN);
			text=ele.getAttribute("value");
			if(text.equals("Venky Avenue, Vellore, Tamil Nadu, India")) {
				ele.sendKeys(Keys.ENTER);
				break;
			}
			
			
			
			
		}while(!text.isEmpty());
	}

	
	}	
		
		
		
		
		

