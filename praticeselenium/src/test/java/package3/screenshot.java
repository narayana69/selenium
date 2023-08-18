package package3;

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
import practice2.Takescreenshot;
import practice2.fileupload;

public class screenshot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		
		TakesScreenshot t=(TakesScreenshot)driver;
		File src=t.getScreenshotAs(OutputType.FILE);
		File trg=new File(".\\screenshots\\ball.png");
		FileUtils.copyFile(src, trg);
		
		
		
	WebElement ele=driver.findElement(By.xpath("//h1[normalize-space()='Test automation practice form']"));
	File sr=ele.getScreenshotAs(OutputType.FILE);
	File r=new File(".\\screenshots\\amma.png");
	FileUtils.copyFile(sr, r);
	
	WebElement e=driver.findElement(By.xpath("//nav[@class='navbar navbar-expand-lg navbar-dark bg-primary']"));
	File ven=e.getScreenshotAs(OutputType.FILE);
	File venky=new File(".\\screenshots\\nanna.png");
	FileUtils.copyFile(ven, venky);
		
	}

}
