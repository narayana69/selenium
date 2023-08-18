package practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javaclass {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nopcommerce.com/en/register?returnUrl=%2Fen%2Fdemo");
		WebElement ele=driver.findElement(By.xpath("//h1[normalize-space()='Register']"));
		
		WebElement el=driver.findElement(By.xpath("//input[@id='register-button']"));

		//javascript.drawborder(ele, driver);
//	System.out.println(javascript.title(driver));	
	//	javascript.click(el, driver);
		//javascript.refresh(driver);
		//javascript.alret(driver, "this is alert");
		
//		javascript.scrolldown(driver);
//		javascript.scrollup(driver);
		javascript.zoom(driver);
		javascript.flash(driver, ele);
		

	}

}
