package pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkboxess {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		List<WebElement> venky=  driver.findElements(By.xpath("//input[@class='form-check-input' and contains(@type,'checkbox')]"));
        System.out.println("size o   "+venky.size());
//        for(WebElement e:venky) {
//        	e.click();
//        }
        for(WebElement e:venky) {
        	if(e.getAttribute("id").equals("monday")||e.getAttribute("id").equals("saturday")){
        		e.click();
        	}
        }
        
	}

}
