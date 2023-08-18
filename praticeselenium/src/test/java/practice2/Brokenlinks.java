package practice2;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Brokenlinks {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://itera-qa.azurewebsites.net/");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size()+"   this is size of links");
		int broken=0;
		int visit=0;
	for(WebElement e:links) {
	String tr=	e.getAttribute("href");
	URL url=new URL(tr);
	HttpURLConnection http=(HttpURLConnection)url.openConnection();
	http.connect();
	int res=http.getResponseCode();
	if(res>400) {
		System.out.println(res+"  "+url+" broken link");
		broken++;
	}else {
	System.out.println(res+"  "+url+" broken link");
	visit++;
	}
	}
	System.out.println(broken+"  this broken links size");
	System.out.println(visit+"  this visit links size");
	driver.quit();
	}}
