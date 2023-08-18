package practice2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkboxes {

	
		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get("https://itera-qa.azurewebsites.net/home/automation");
			
			//SELECT ONLY ONE OPTION
			
			//driver.findElement(By.xpath("//input[@id='monday']")).click();
			
			
			
		List<WebElement> list=driver.findElements(By.xpath("//input[@class='form-check-input' and contains(@type,'checkbox')]"));
		for(WebElement e:list){
			//SELECT ALL 
			//e.click();
			
			
			//SELECT ZIGZAG ORDER OR RAMDOM
			String text=e.getAttribute("id");
			if(text.equals("monday")||text.equals("thursday")||text.equals("saturday")) {
				
			
			e.click();
	
		}
			
		}
	}

}
