package pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class datePicker {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
                  driver.get("https://www.abhibus.com/?utm_source=google&utm_medium=cpc&utm_campaign=Abhibus_Brand&utm_term=abhibus&utm_content=Brand&gclid=CjwKCAjwm4ukBhAuEiwA0zQxk6BA0EPlPITQNVLtlG7y90vQrnPVJeg0Ddz02nmWxlMOOxYXwMW3xxoCgZ8QAvD_BwE");
         driver.manage().window().maximize();
      String month="July";
      String year="2023";
      String date="3";
            driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
		while(true) {
			String monthyr=driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-left']//div[@class='ui-datepicker-title']")).getText();
			System.out.println(monthyr);
			String arr[]=monthyr.split(" ");
			String mn=arr[0];
			String yr=arr[1];
			if(mn.equals(month)&&yr.equals(year)) {
				break;
			}
			else {
				driver.findElement(By.xpath("//a[@title='Next']")).click();
			}}
			List<WebElement> venky=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
			for(WebElement e:venky) {
				if(e.getText().equals(date)) {
					e.click();
				}
				
			}
			
			
			
		


	}

}
