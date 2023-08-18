package package3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scroolbar {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		WebElement ele= driver.findElement(By.xpath("//span[2]"));
		System.out.println("location   "+ele.getLocation());
		System.out.println("location   "+ele.getSize());
		Actions act=new Actions(driver);
		//x axis
		WebElement el= driver.findElement(By.xpath("//span[1]"));
		act.dragAndDropBy(el, 100, 0);
		
		//y axis
		act.dragAndDropBy(ele, -100,0).perform();
		
	}

}
