package pratice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class uploadFile {

	public static void main(String[] args) throws AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.foundit.in/");
		driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn secondaryBtn']")).click();
		//driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\Venky\\Documents\\Kandregula_Kishore_DevOps_3.2.docx");
		WebElement ele=driver.findElement(By.xpath("//input[@id='file-upload']"));//click action on the button
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", ele);
		/*
		1.copy the path
		2.control V
		3.enter
		C:\Users\Venky\Documents\Kandregula_Kishore_DevOps_3.2.docx
		*/
		Robot r=new Robot();
		r.delay(2000);
		//put path to file in a clipboard
		StringSelection rs=new StringSelection("C:\\Users\\Venky\\Documents\\Kandregula_Kishore_DevOps_3.2.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(rs, null);
		
		//control v
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		//enter
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

}
