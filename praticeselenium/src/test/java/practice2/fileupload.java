package practice2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fileupload {

	public static void main(String[] args) throws AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.foundit.in/");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn secondaryBtn']")).click();
	WebElement ele=	driver.findElement(By.xpath("//input[@id='file-upload']"));
	//	ele.sendKeys("C:\\Users\\Venky\\Documents\\Kandregula_Kishore_DevOps_3.2.docx");
		
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("arguments[0].click()", ele);
	  
	 Robot rb=new Robot();
	 rb.delay(2000);
	    
	 
	 StringSelection ss=new StringSelection("C:\\Users\\Venky\\Documents\\Kandregula_Kishore_DevOps_3.2.docx");
	 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, ss);
	 
	 
	 rb.keyPress(KeyEvent.VK_CONTROL);
	 rb.keyPress(KeyEvent.VK_V);
	 
	 rb.keyRelease(KeyEvent.VK_CONTROL);
	 rb.keyRelease(KeyEvent.VK_V);
	 
	 rb.keyPress(KeyEvent.VK_ENTER);
	 rb.keyRelease(KeyEvent.VK_ENTER);

	 
	}

}
