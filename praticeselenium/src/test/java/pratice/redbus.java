package pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class redbus {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
                  driver.get("https://www.redbus.in/");
         driver.manage().window().maximize();
      String month="August";
      String year="2023";
      String date="25";
            driver.findElement(By.xpath("//div[@id='onwardCal']")).click();
		while(true) {
			String monthyr=driver.findElement(By.xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//div[2]")).getText();
			System.out.println(monthyr);
			String arr[]=monthyr.split(" ");
			String mn=arr[0];
			String yr=arr[1];
			if(mn.equals(month)&&yr.equals(year)) {
				break;
			}
			else {
				driver.findElement(By.xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//div[3]//*[name()='svg']")).click();
			}
			List<WebElement> venky=driver.findElements(By.xpath("//span[normalize-space()='25']"));
			for(WebElement e:venky) {
				if(e.getText().equals(date)) {
					e.click();
				}
				
			}
			
			
			
		}


	}

}


////span[normalize-space()='14'] 
//span[normalize-space()='25']











