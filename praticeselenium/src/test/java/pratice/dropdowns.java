package pratice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import okhttp3.internal.connection.RouteSelector.Selection;

public class dropdowns {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
	WebElement	ele=driver.findElement(By.xpath("//select[@class='custom-select']"));
		Select s=new Select(ele);
		List<WebElement> el=s.getOptions();
		System.out.println(el.size());
		int k=el.size();
//		for(WebElement e:el) {
//			String k=e.getText();
//			System.out.println(k);
//			if(k.equals("Malta")) {
//				e.click();
//			}
//			
//		}
		
		ArrayList list=new ArrayList(k);
		ArrayList list2=new ArrayList();
		for(WebElement e:el) {
			
			String r=e.getText();
			list.add(r);
			list2.add(r);
			
		}
		System.out.println(list);
		System.out.println(list2);
		Collections.sort(list2);
		System.out.println(list2);
		if(list.equals(list2)) {
			System.out.println("is not sorted");
			
		}
		else {
			System.out.println("is sorted");
		}
		
		
	}	

}
