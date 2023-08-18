package package3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class datepicker {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		String datemonth="April 2024";
		String date="15";
		while(true) {
			String monthyr=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			if(monthyr.equals(datemonth)) {
				break;
			}
		
		else {
			driver.findElement(By.xpath("//a[@title='Next']")).click();
		}}
		List<WebElement> ele=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		for(WebElement e:ele) {
			if(e.getText().equals(date)) {
				e.click();
			}
		}
	}

}
