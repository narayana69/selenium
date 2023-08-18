package pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		 WebElement venky= driver.findElement(By.xpath("//select[@class='custom-select']"));
		//venky.click();
		 
		 
		 Select ven=new Select(venky);
		//ven.selectByValue("3");
		//ven.selectByIndex(2);
		//ven.selectByVisibleText("Italy");
		List<WebElement> op=ven.getOptions();
		System.out.println("size is   "+op.size());
		for(WebElement en:op) {
			System.out.println("text   "+en.getText());
			if(en.getText().equals("Italy")) {
				en.click();
			}
		}
		
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		Select vv=new Select(driver.findElement(By.xpath("")));
		Select vv1=new Select(driver.findElement(By.xpath("")));
		Select vv2=new Select(driver.findElement(By.xpath("")));
		
		vv.selectByIndex(0);
		vv1.selectByVisibleText("");
		vv2.selectByValue("");
		WebElement venk=driver.findElement(By.xpath(""));
		selectdropdown(venk,"Italy");
		
		WebElement venk1=driver.findElement(By.xpath(""));
		selectdropdown(venk1,"France");
		
		
		WebElement venk2=driver.findElement(By.xpath(""));
		selectdropdown(venk2,"India");
		
			}
	public static void selectdropdown(WebElement ele,String value) {
		Select bb=new Select(ele);
		List<WebElement> opp=bb.getOptions();
		for(WebElement e:opp) {
			if(e.getText().equals(value)) {
				e.click();
			}
		}
	}

}
