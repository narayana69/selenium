package package3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class innerframes {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();
	WebElement parent=	driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(parent);
		WebElement child=	driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(child);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("venky");
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[normalize-space()='Single Iframe']")).click();
	}

}
