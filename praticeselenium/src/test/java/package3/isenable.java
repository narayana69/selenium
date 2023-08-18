package package3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class isenable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		 WebElement ele=  driver.findElement(By.xpath("//label[@for='customCheck7']"));
		 WebElement el=  driver.findElement(By.xpath("//input[@id='tuesday']"));
		 System.out.println(ele.isDisplayed());
		 System.out.println(ele.isEnabled());
		 System.out.println(ele.isSelected());
		 el.click();
		 System.out.println(el.isSelected());
		 

	}

}
