package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webElementCommands {

	public static void main(String[] args) {
		
		    System.out.println("-------webElement  COMMANDS------");
		    //sendKeys("");
		    //clear();
		    //getText();
		    //getAttribute();
		    //click();
		    //isSelected();
		    //isDisplayed();
		    //isEnabled();
		    //submit():
		    
		    WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
		    driver.get("https://itera-qa.azurewebsites.net/home/automation");
		   WebElement venky= driver.findElement(By.xpath("//input[@id='name']"));
           venky.sendKeys("venkata narayana");
            System.out.println(venky.getText());
            System.out.println(venky.getAttribute("value"));
            venky.clear();
            driver.findElement(By.xpath("//input[@id='male']")).click();
            System.out.println(driver.findElement(By.xpath("//label[normalize-space()='Name']")).getText());
            driver.findElement(By.xpath("//button[normalize-space()='Submit']")).submit();

	}

}
