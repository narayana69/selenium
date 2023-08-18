package package3;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cookiees {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://artoftesting.com/samplesiteforselenium");
	Set<Cookie> cooki=	driver.manage().getCookies();
	System.out.println(cooki.size());
	for(Cookie e:cooki) {
		System.out.println(e.getValue()+"  "+e.getName());
	}
	Cookie ob=new Cookie("venky", "2333");
	driver.manage().addCookie(ob);
	Set<Cookie> co=driver.manage().getCookies();
	System.out.println(co.size());
	for(Cookie e:cooki) {
		System.out.println(e.getValue()+"  "+e.getName());
	}
	
//	driver.manage().deleteCookie(ob);
	//driver.manage().deleteCookieNamed("venky");
	driver.manage().deleteAllCookies();
	
	Set<Cookie> cow=driver.manage().getCookies();
	System.out.println(cow.size());
	
	
		

	}

	

}
