package practice2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdownSort {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
	WebElement ele=	driver.findElement(By.xpath("//select[@class='custom-select']"));
	Select s=new Select(ele);
	//s.selectByIndex(5);
	//s.selectByValue("7");
	//s.selectByVisibleText("Denmark");
	
	List<WebElement> list=s.getOptions();
	ArrayList orginal=new ArrayList();
	ArrayList tem=new ArrayList();
	
 	for(WebElement e:list) {
 		String k=e.getText();
		orginal.add(k);
		tem.add(k);
	}
 	System.out.println(orginal);
 	System.out.println(tem);
 	Collections.sort(tem);
 	System.out.println(tem);
 	if(tem.equals(orginal)) {
 		System.out.println("this is not sorted");
 		
 	}
 	else {
 		System.out.println("this is sorted");
 	}
 		
 		

	}

}
