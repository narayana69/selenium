package package3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nopcommerce.com/en/register?returnUrl=%2Fen");
		WebElement ele=driver.findElement(By.xpath("//select[@id='CountryId']"));
		Select sc=new Select(ele);
	//	sc.selectByIndex(2);
		//sc.selectByValue("239");
	//	sc.selectByVisibleText("Angola");
		List<WebElement> list=sc.getOptions();
		System.out.println(list.size());
		for(WebElement e:list) {
			if(e.getText().equals("Angola")) {
				e.click();
			}
			
			
		}
	}

}
