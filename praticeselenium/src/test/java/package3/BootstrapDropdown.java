package package3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootstrapDropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		
	//SELECT ONE BOOTSTRAP	
		WebElement ele=driver.findElement(By.xpath(""));
		ele.click();
		
		List<WebElement> opt=driver.findElements(By.xpath(""));
		selectopt(opt,"venky");
		System.out.println(opt.size());
		/*for(WebElement e:opt) {
			if(e.getText().equals("India")) {
				e.click();
				break;
			}
		}*/
		
		// SELECT SECOND BOOTSTRAP

		driver.findElement(By.xpath("")).click();
		List<WebElement> opti=driver.findElements(By.xpath(""));
		selectopt(opti,"venky");
		
		
		/*for(WebElement k:opti) {
			if(k.getText().equals("venky")) {
				k.click();
				break;
			}
		}*/
		
	
	}
	//BY USING GENERIC METHOD
	
	public static void selectopt(List<WebElement> options,String value) {
		for(WebElement el:options) {
			if(el.getText().equals(value)) {
				el.click();
				break;
			}
		}
	}
	

}
