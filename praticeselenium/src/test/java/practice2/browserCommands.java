package practice2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browserCommands {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		System.out.println(" this is currentUrl   "+driver.getCurrentUrl());
		System.out.println(" this is title   "+driver.getTitle());
		System.out.println(" this is class   "+driver.getClass());
		driver.close();
		driver.quit();
		
		

	}

}
