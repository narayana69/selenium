package practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javascriptExecutor {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://itera-qa.azurewebsites.net/home/automation");
WebElement ele=driver.findElement(By.xpath("//h1[normalize-space()='Test automation practice form']"));
WebElement el=driver.findElement(By.xpath("//input[@id='wednesday']"));
   
//javascript.drawborder(ele, driver);
//String title=javascript.title(driver);
//System.out.println(title);
//javascript.click(el, driver);
//javascript.alret(driver, "this is alert box......");

//javascript.refresh(driver);
//javascript.scrolldown(driver);
//Thread.sleep(3000);
//javascript.scrollup(driver);
//javascript.zoom(driver);

javascript.flash(driver, ele);

//driver.close();

	}

}
