package package3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import practice2.webelmentcommands;

public class checkboxes {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		//driver.findElement(By.xpath("//input[@id='tuesday']")).click();
		//driver.findElement(By.xpath("//input[@id='thursday']")).click();
	List<WebElement> c=	driver.findElements(By.xpath("//input[@class='form-check-input' and contains(@type,'checkbox')]"));
	System.out.println(c.size());
	for(WebElement e:c) {
		e.click();
		String k=e.getAttribute("id");
		if(k.equals("monday")||k.equals("thursday")) {
		e.click();
	}
	}	
				

	}

}
