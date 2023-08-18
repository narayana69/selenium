package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScript {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nopcommerce.com/en/register?returnUrl=%2Fen");
		WebElement ele=driver.findElement(By.xpath("//h1[normalize-space()='Register']"));
		WebElement el=driver.findElement(By.xpath("//input[@id='register-button']"));
		
//		//DRAW THE BORDER
//		
//		Javascriptutils.drawborder(driver,ele);
//		
//		
//		//TITLE
//		String title=Javascriptutils.title(driver);
//		System.out.println(title);
//		
//		//CLICK
//		
//		Javascriptutils.click(el, driver);
//		
//		
//		//ALERT MESSAGE
//		
//	//	Javascriptutils.alert(driver, "this is alert pop up....");
//		Thread.sleep(3000);
//		//REFRESH
//		Javascriptutils.refresh(driver);
//		
//		//PAGE SCROOL
//		
//		Javascriptutils.scrollpagedown(driver);
//		Thread.sleep(3000);
//		Javascriptutils.scrollup(driver);
//		
		//PAGE ZOOM
//		Thread.sleep(3000);
//		Javascriptutils.zoom(driver);
		
		//flash
		
		Javascriptutils.flash(driver, ele);
	}

}
