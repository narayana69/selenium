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

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://itera-qa.azurewebsites.net/");


		TakesScreenshot ven=(TakesScreenshot)driver;
		File src=ven.getScreenshotAs(OutputType.FILE);
		File trg=new File(".\\screenshot\\venky1.png");
		FileUtils.copyFile(src, trg);

		WebElement ele=driver.findElement(By.xpath("//div[@class='jumbotron']"));
		File src1=ele.getScreenshotAs(OutputType.FILE);
		File ter=new File(".\\screenshot\\venkat.png");
		FileUtils.copyFile(src1, ter);
		
		WebElement ele2=driver.findElement(By.xpath("//img[@alt='Test']"));
	File src2=	ele2.getScreenshotAs(OutputType.FILE);
		File trg2=new File(".\\screenshot\\venka.png");
         FileUtils.copyFile(src2, trg2);
	}

}
