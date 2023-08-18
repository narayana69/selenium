package package3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rightanddoubleclick {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
//RIGHT CLICK
		driver.manage().window().maximize();
		/*driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	WebElement ele=	driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions act=new Actions(driver);
		act.contextClick(ele).perform();*/
		
//DOUBLE CLICK		
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick");
		driver.switchTo().frame("iframeResult");
	WebElement ele=	driver.findElement(By.xpath("//button[normalize-space()='Double-click me']"));
		Actions act=new Actions(driver);
		act.doubleClick(ele).perform();
		
		
		
		
		
		
		
		
			}

}
