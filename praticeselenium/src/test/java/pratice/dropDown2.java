package pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//bootstrop dropdown
public class dropDown2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("")).click();
		List<WebElement> one=driver.findElements(By.xpath(""));

		drop(one,"india");


		//System.out.println("size  "+one.size());
		//for(WebElement e:one) {
		//	if(e.getText().equals("India")) {
		//		e.click();
		//	}
		//}
		driver.findElement(By.xpath("")).click();
		List<WebElement> two=driver.findElements(By.xpath(""));
		drop(two,"nanadanavanam");
		//System.out.println("size  "+one.size());
		//for(WebElement e1:two) {
		//	if(e1.getText().equals("Nandanavanam")) {
		//		e1.click();
		//	}
		//}	


	}
	public static void drop(List<WebElement> elee,String value) {
		for(WebElement ele:elee) {
			if(ele.getText().equals(value)) {
				ele.click();
			}
		}



	}




}
