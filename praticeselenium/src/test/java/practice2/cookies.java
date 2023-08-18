package practice2;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cookies {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://itera-qa.azurewebsites.net/");
		Set<Cookie> cookie=  driver.manage().getCookies();
		System.out.println(cookie.size());
		for(Cookie e:cookie) {
			System.out.println(e.getValue()+" "+e.getName());
		}
		Cookie oj=new Cookie("venky","532983739373");
		driver.manage().addCookie(oj);
		Set<Cookie> cookie1=  driver.manage().getCookies();
		System.out.println(cookie1.size());
		driver.manage().deleteCookie(oj);
		driver.manage().deleteCookieNamed("venky");
		Set<Cookie> cooki1=  driver.manage().getCookies();
		System.out.println(cooki1.size());
		driver.manage().deleteAllCookies();
		Set<Cookie> cooke1=  driver.manage().getCookies();
		System.out.println(cooke1.size());
	}
}