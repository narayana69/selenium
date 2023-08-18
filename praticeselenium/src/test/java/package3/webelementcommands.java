package package3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webelementcommands {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		WebElement ele=driver.findElement(By.xpath("//input[@id='name']"));
		WebElement el=driver.findElement(By.xpath("//input[@id='thursday']"));
		ele.sendKeys("venky");
		System.out.println(ele.getAttribute("value"));
		System.out.println(ele.getTagName());
		System.out.println(ele.getAttribute("id"));
		ele.clear();
		el.click();
		
		

	}

}
