package pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class autosuggitions {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Akshay kumar");
		
		Thread.sleep(5000);
		
  List<WebElement> keywords = driver.findElements(By.xpath("//ul[@class='G43f7e']//li"));
  
  System.out.println(keywords.size());
  
  for(WebElement ele : keywords) {
	  
	  if(ele.getText().equals("akshay kumar age")) {
		  
		  
	  ele.click();
	  break;
	  }
  
  }
  
	}

}
