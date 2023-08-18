package package3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class opennewtab {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en/register?returnUrl=%2Fen");
		driver.manage().window().maximize();
	String k=Keys.chord(Keys.CONTROL,Keys.RETURN);
        driver.findElement(By.xpath("//a[contains(text(),'Store demo')]")).sendKeys(k);
	}

}
