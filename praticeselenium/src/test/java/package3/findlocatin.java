package package3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class findlocatin {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nopcommerce.com/en/register?returnUrl=%2Fen");
		WebElement ele=driver.findElement(By.xpath("//img[@title='nopCommerce']"));
		
     System.out.println(ele.getLocation());
     System.out.println(ele.getLocation().getX());
     System.out.println(ele.getLocation().getY());
     
     
     
     System.out.println(ele.getRect());
     System.out.println(ele.getRect().getX());
     System.out.println(ele.getRect().getY());
     
     
     System.out.println(ele.getSize());
     System.out.println(ele.getSize().getHeight());
     System.out.println(ele.getSize().getWidth());
     
     System.out.println(ele.getRect().getDimension().getHeight());
     System.out.println(ele.getRect().getDimension().getWidth());
     
       
	}

}
