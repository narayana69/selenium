package practice2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class datepicker {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		String monthyear="September 2024";
		String date ="23";
		
		while(true) {
			String monyr=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			 if(monyr.equals(monthyear)) {
				 break;
			 }
			 else {
				 driver.findElement(By.xpath("//a[@title='Next']")).click();
				 
			 }
		}
			 List<WebElement> dt=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
			 for(WebElement e:dt) {
				if(e.getText().equals(date)) {
					e.click();
			
				 
				 
			 }
		}

	}

}
