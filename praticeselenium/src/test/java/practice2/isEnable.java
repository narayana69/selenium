package practice2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class isEnable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		WebElement ele=driver.findElement(By.xpath("//input[@id='name']"));
	
		System.out.println(ele.isDisplayed());//true
		System.out.println(ele.isEnabled());//true
		System.out.println(ele.isSelected());//false
		WebElement el=driver.findElement(By.xpath("//input[@id='tuesday']"));
		System.out.println(el.isSelected());//false
		el.click();
		System.out.println(el.isSelected());//true
		
		
	}

}
