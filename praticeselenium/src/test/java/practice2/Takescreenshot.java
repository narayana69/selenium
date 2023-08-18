package practice2;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Takescreenshot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		WebElement ele=driver.findElement(By.xpath("//img[@alt='Google']"));
		WebElement el=driver.findElement(By.xpath("//div[@class='o3j99 ikrT4e om7nvf']"));
		
		TakesScreenshot k=(TakesScreenshot)driver;
	File src=	k.getScreenshotAs(OutputType.FILE);
	File trg=new File(".\\screenshots\\venkyy.png");
	FileUtils.copyFile(src, trg);
	
	
	File sr=ele.getScreenshotAs(OutputType.FILE);
	File tr=new File(".\\screenshots\\rowdyy.png");
	FileUtils.copyFile(src, tr);
	
	File s=el.getScreenshotAs(OutputType.FILE);
	File t=new File(".\\screenshots\\rowdy.png");
	FileUtils.copyFile(s, t);
	
	
	
		
	}

}
