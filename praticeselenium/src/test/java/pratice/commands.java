package pratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class commands {

	public static void main(String[] args) {
    System.out.println("-------BROWSER COMMANDS------");
//  get();  
//  getTitle(); 
//   getCurrentUrl(); 
//  close();
//quit();
    WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com");
	System.out.println("TITLE  "+driver.getTitle());
	System.out.println("currentUrl  "+driver.getCurrentUrl());
	driver.close(); // close focus page
	driver.quit();  // close all pages
	
	}

}
