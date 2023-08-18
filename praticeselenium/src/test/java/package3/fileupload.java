package package3;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fileupload {

	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.foundit.in/");
		WebElement ele=driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn secondaryBtn']"));
       ele.click();
       Thread.sleep(2000);
       WebElement el=driver.findElement(By.xpath("//input[@id='file-upload']"));
       JavascriptExecutor js=(JavascriptExecutor)driver;
       js.executeScript("arguments[0].click()", el);
       
       Robot rb=new Robot();
       rb.delay(2000);
       StringSelection ss=new StringSelection("C:\\Users\\Venky\\Documents\\Kandregula_Kishore_DevOps_3.2.docx");
       rb.keyPress(KeyEvent.VK_CONTROL);
       rb.keyPress(KeyEvent.VK_V);
       
       rb.keyRelease(KeyEvent.VK_CONTROL);
       rb.keyRelease(KeyEvent.VK_V);
       
       
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
                      
	}

}
