package package3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jQueryDropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
			
		WebElement ele=driver.findElement(By.xpath("//input[@id='justAnInputBox']"));
		ele.click();
		
		
		
	/*	//select(driver,"choice 2");
		
		select(driver,"choice 2","choice 6","choice 1");
		//select(driver,"all");
		
		

	}
	public static void select(WebDriver driver,String...value) {
		
		List<WebElement> list=driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		if(!value[0].equalsIgnoreCase("all")) {
			for(WebElement e:list) {
				String k=e.getText();
				for(String val:value) {
					if(k.equals(val)) {
						e.click();
						break;
					}
				}
				
			}
		}
		else {
			try {
			for(WebElement e:list) {
				e.click();
			}
		}catch(Exception el) {
			
		}}
		
		
		
	}*/
		
	//select(driver,"choice 1");
	select(driver,"choice 4","choice 5","choice 3");
	
	
		

}
	public static void select(WebDriver driver, String...value) {
		List<WebElement> list=driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		if(!value[0].equalsIgnoreCase("all")) {
			for(WebElement e:list) {
				String k=e.getText();
				for(String val:value) {
					if(k.equals(val)) {
						e.click();
						break;
					}
					
				}
				
		}}
		
			
		else {
			try {
				for(WebElement li:list) {
					li.click();
				}
			}catch(Exception kl) {
				
			}
		}
	}








}
