package pratice;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

	public static void main(String[] args) throws IOException  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/createaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		driver.manage().window().maximize();
		List<WebElement> lists=driver.findElements(By.tagName("a"));
		int broken=0;
		System.out.println("size of the webpage"+lists.size());
		for(WebElement ven:lists) {
			String v=ven.getAttribute("href");
			URL url=new URL(v);
			HttpsURLConnection http=(HttpsURLConnection)url.openConnection();
			http.connect();
			
			int res=http.getResponseCode();
			
			
			
			if(res>=400) {
				System.out.println(res+" "+url+".....broken link is visit");
				
				broken++;
				
			}
			else {
				
				System.out.println(res+" "+url+".....link is visit");
			}
			
		}
System.out.println(" is broken links"+broken);
driver.quit();
	}

}
