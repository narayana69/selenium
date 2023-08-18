package package3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javaclass {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nopcommerce.com/en/register?returnUrl=%2Fen");
		//WebElement ele=driver.findElement(By.xpath("//img[@title='nopCommerce']"));
		WebElement el=driver.findElement(By.xpath("//input[@id='FirstName']"));
		//javascript.drawborder(ele, driver);
		//javascript.flash(driver, ele);
		//javascript.refresh(driver);
		//javascript.scroolup(driver);
		//javascript.scrooldown(driver);
		//Thread.sleep(3000);
//		javascript.scroolup(driver);
//		Thread.sleep(3000);
//		javascript.scrooldown(driver);
	//	javascript.zoom(driver);
		//javascript.alert(driver, "this is venky");
		//javascript.click(el, driver);
		//System.out.println(javascript.title(driver));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('firstName').value=test text");
	}

}
