package package3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multiledropdowns {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
	WebElement ele=	driver.findElement(By.xpath(""));
	
	selectoption(ele,"India");
	WebElement el=	driver.findElement(By.xpath(""));
	selectoption(el,"India");
	
	WebElement e=	driver.findElement(By.xpath(""));
	selectoption(e,"India");
//		Select sc=new Select(ele);
//		sc.selectByIndex(7);
//		
//		Select sc2=new Select(el);
//		sc2.selectByValue("7");
//		
//		
//		Select sc3=new Select(e);
//		sc3.selectByVisibleText("India");
	
	
	//BY USING GENEIC METHOD
	}
	public static void selectoption(WebElement element,String value) {
	
		Select sc=new Select(element);
		List<WebElement> list=sc.getOptions();
		for(WebElement k:list) {
			if(k.getText().equals(value)) {
				k.click();
				break;
			}
		}
	 

	}

}
