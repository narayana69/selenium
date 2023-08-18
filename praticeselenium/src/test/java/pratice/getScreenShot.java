package pratice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getScreenShot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nopcommerce.com/en/demo");
		/*TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File(".\\screenshots\\venky.png");
		FileUtils.copyFile(src, trg);*/
//		WebElement venky=driver.findElement(By.xpath("//div[@class='stats-1']//a"));
//		File src=venky.getScreenshotAs(OutputType.FILE);
//		File trg=new File(".\\venkyy\\ven.png");
//		FileUtils.copyFile(src, trg);
		
		WebElement venky=driver.findElement(By.xpath("//img[@title='nopCommerce']"));
		File src=venky.getScreenshotAs(OutputType.FILE);
		File trg=new File(".\\venkyy\\ven.png");
		FileUtils.copyFile(src, trg);
		
		
		
	}
	
	
	
	

}
