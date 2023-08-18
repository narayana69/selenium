package package3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframes {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.switchTo().frame("frm1");
		driver.findElement(By.xpath("//select[@id='selectnav1']")).click();
         driver.switchTo().defaultContent();
         driver.switchTo().frame("frm2");
         driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("venky");

	}

}
