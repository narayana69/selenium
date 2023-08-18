package package3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jalert {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
//		Thread.sleep(3000);
//		driver.switchTo().alert().accept();
//		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
//		Thread.sleep(3000);
//		driver.switchTo().alert().dismiss();
	WebElement ele=	driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']"));
	 ele.click();
	 
	 
		Thread.sleep(3000);
		Alert k=driver.switchTo().alert();
		System.out.println(k.getText());
		
		k.sendKeys("venky");
		
		//Thread.sleep(3000);
		k.accept();
		

	}

}
