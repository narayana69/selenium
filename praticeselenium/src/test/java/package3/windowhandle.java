package package3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signup/v2/createaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.findElement(By.xpath("//a[normalize-space()='Privacy']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Help']")).click();
		System.out.println(driver.getTitle());
	Set<String> k=	driver.getWindowHandles();
//	String win=	driver.getWindowHandle();
//	System.out.println(win);
//		Iterator<String> it=k.iterator();
//		String parent=it.next();
//		String child=it.next();
//		String child1=it.next();
//		driver.switchTo().window(child1);
//		System.out.println(driver.getTitle());
		List<String> kl=new ArrayList<String>(k);
		String parent=kl.get(0);
		String child=kl.get(1);
		String child1=kl.get(2);
		
		driver.switchTo().window(child1);
		System.out.println(driver.getTitle());
		
//		for(String l:kl) {
//			driver.switchTo().window(l);
//			
//			System.out.println(l+""  +driver.getTitle());
//		}
		

	}

}
