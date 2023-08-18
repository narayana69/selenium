package pratice;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SynchranizationProblems {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.google.com/");
  /*   
     //IMPLICTLY WAIT()
     
    // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
     
     
    //EXPLICITLY WAIT
     
     
     driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
     driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.RETURN);
     driver.findElement(By.xpath("//h3[normalize-space()='Selenium']"));
   WebDriverWait ele=new WebDriverWait(driver, 5);
   WebElement el=ele.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h3[normalize-space()='Selenium']")));
     el.click();
       
     By loc=By.xpath("//h3[normalize-space()='Selenium']");
     wait(driver,loc,5).click();
     
     //GENERIC METHOD
     
	}
	public static WebElement wait(WebDriver driver,By locator,int seconds) {
		
		WebDriverWait el=new WebDriverWait(driver, seconds);
		WebElement ele=el.until(ExpectedConditions.presenceOfElementLocated(locator));
		return driver.findElement(locator);
		
		
	}*/
     
//     Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
//     .withTimeout(Duration.ofSeconds(30))
//     .pollingEvery(Duration.ofSeconds(5))
//     .ignoring(NoSuchElementException.class);
//     driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
//     driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.RETURN);
//     
//     WebElement ele=wait.until(new Function<WebDriver, WebElement>() {
//    	 public WebElement apply(WebDriver driver) {
//    		 return driver.findElement(By.xpath("//h3[normalize-space()='Selenium']"));
//    	 }
//	});
//     ele.click();
     
     driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
   driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.RETURN);
   By loc=By.xpath("//h3[normalize-space()='Selenium']");
  wait(driver,loc).click();
	}
     public static WebElement wait(WebDriver driver,final By locator) {
    	 Wait<WebDriver> wait1=new FluentWait<WebDriver>(driver)
    		     .withTimeout(Duration.ofSeconds(30))
    		     .pollingEvery(Duration.ofSeconds(5))
    		     .ignoring(NoSuchElementException.class);
    		   
    		     
    		     WebElement ele=wait1.until(new Function<WebDriver, WebElement>() {
    		    	 public WebElement apply(WebDriver driver) {
    		    		 return driver.findElement(locator);
    		    	 }
     });
    		     return ele;
     
	}
	
	
	

}
