package practice2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class autoSuggetions {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("vijay");
	List<WebElement> list=driver.findElements(By.xpath("//ul[@class='G43f7e']//li"));
	System.out.println("size is   "+list.size());
	for(WebElement e:list) {
		if(e.getText().equals("vijay karthikeya")) {
			e.click();
			break;
		}
	}
	}

}
