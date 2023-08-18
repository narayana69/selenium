package pratice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdownsort {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		 WebElement venky= driver.findElement(By.xpath("//select[@class='custom-select']"));
		
		Select ven=new Select(venky);
		List<WebElement> ve=ven.getOptions();
		ArrayList one=new ArrayList();
		ArrayList one1=new ArrayList();
		
		for(WebElement e:ve) {
			one.add(e.getText());
			one1.add(e.getText());
		}
		System.out.println(one);
		Collections.sort(one1);
		System.out.println(one1);
		if(one.equals(one1)) {
			System.out.println("not sorted");
		}
		else {
			System.out.println("sorted");
		}
		
			}

}
