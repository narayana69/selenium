package practice2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class navigations {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/datepicker/");
		driver.navigate().to("https://www.youtube.com/watch?v=m2kU2b9PYcs&list=RDIYx2il03A90&index=12");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
	}

}
