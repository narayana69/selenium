package package3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import practice2.webelmentcommands;

public class dropdownsort {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nopcommerce.com/en/register?returnUrl=%2Fen");
		WebElement ele=driver.findElement(By.xpath("//select[@id='CountryId']"));
		Select sc=new Select(ele);
		List<WebElement> e=sc.getOptions();
		System.out.println(e.size());
		int a=e.size();
	ArrayList org=new ArrayList(a);
	ArrayList tem=new ArrayList();
	for(WebElement d:e) {
		org.add(d.getText());
		tem.add(d.getText());
	}
	System.out.println(org);
	Collections.sort(tem);
	System.out.println(tem);
	if(org.equals(tem)) {
		System.out.println("it is not sort");
		
	}
	else {
		System.out.println(" sort");
	}
		
		
	}

}
