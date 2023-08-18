package package3;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLPermission;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.net.UrlChecker;

import io.github.bonigarcia.wdm.WebDriverManager;
import practice2.webelmentcommands;

public class brokenlinks {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
	List<WebElement> el=driver.findElements(By.tagName("a"));

	System.out.println(el.size());
	int broken = 0;
	int visit=0;
	for(WebElement e:el) {
		try {
		String k=e.getAttribute("href");
		URL url =new URL(k);
		HttpURLConnection http=(HttpURLConnection)url.openConnection();
		http.connect();
		int w=http.getResponseCode();
		
		if(w>400) {
			System.out.println(w +" "+url+"   this is broken links");
			
			broken++;
		}
		
		else {
			System.out.println(w +" "+url+"   this is visit links");
			visit++;
		}}catch(Exception e1) {
			
		}
	
	}
	System.out.println(broken+"this is broken links");
	System.out.println(visit+"this is visit links");

	}

}
