package package3;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
//import org.openqa.selenium.safari.SafariDriver.WindowType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class open2URLSintwotabs {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nopcommerce.com/en/register?returnUrl=%2Fen");
	//	driver.switchTo().newWindow(WindowType.WINDOW);
		//driver.switchTo().newWindow(WindowType.window);
		driver.get("https://www.google.com");
	

	}

}
