package pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();
        
       selectChoiceValues(driver,"all");
        
        

	}
    public static void selectChoiceValues(WebDriver driver,String...value) {
    	List<WebElement> opts=driver.findElements(By.xpath("//li[@class='ComboTreeItemChlid']//span"));
    	if(!value[0].equalsIgnoreCase("all")) {
    		for(WebElement ele:opts) {
    			String ve=ele.getText();
    			for(String vf:value)
    			{
    				
    				if(ve.equals(vf)) {
    					ele.click();
    				}
    			}
    		}
    			
    		
    	}
    else {
    	try {
    		
    	
    	for(WebElement ele:opts) {
    		ele.click();
    	}
    	}
    	catch(Exception e)
    	{
    		
    	}
    	
    		
    	}
    }	
    }

