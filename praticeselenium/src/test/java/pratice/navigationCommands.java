package pratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class navigationCommands {

	
		public static void main(String[] args) {
		    System.out.println("-------NAVIGATION  COMMANDS------");
		//  navigate().to();  
		//  navigate().forward(); 
		//   navigate().back(); 
		//  navigate().refresh();
		//quit();
		    WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.youtube.com");
			driver.navigate().to("https://www.gmail.com");// gmail
			driver.navigate().back();   // you tube
			driver.navigate().forward();// gmail
			driver.navigate().refresh();// refresh gmali page

	}

}
