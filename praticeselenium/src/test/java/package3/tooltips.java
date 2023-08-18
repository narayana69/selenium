package package3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tooltips {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		driver.manage().window().maximize();
	WebElement el=	driver.findElement(By.xpath("//input[@id='email']"));
	System.out.println(el.getAttribute("value"));
	System.out.println(el.getAttribute("type"));
	System.out.println(el.getAttribute("id"));
	System.out.println(el.getTagName());
		

	}

}
