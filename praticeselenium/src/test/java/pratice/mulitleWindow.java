package pratice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mulitleWindow {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signup/v2/createaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
	String ven=driver.getWindowHandle();
//        System.out.println(ven);
		
		driver.findElement(By.xpath("//a[normalize-space()='Help']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Privacy']")).click();
		System.out.println(driver.getTitle());
		Set<String> venky= driver.getWindowHandles();
		//System.out.println(venky);
		
		List<String> venkat=new ArrayList(venky);
//		String parentid=venkat.get(0);
//		String childid1 =venkat.get(1);
//		String childid =venkat.get(1);
//		
//		System.out.println(parentid);
//		System.out.println(childid);
//		//System.out.println(childid1);
//		driver.switchTo().window(childid);
//		System.out.println(driver.getTitle()+"this is child2");
//
//		driver.switchTo().window(childid1);
//		System.out.println(driver.getTitle()+"this is child");
//		driver.switchTo().window(parentid);
//		System.out.println(driver.getTitle()+"this is child");
//		
		
		
		for(String e:venkat) {
		//System.out.println(e);		
String ve=driver.switchTo().window(e).getTitle();
		System.out.println(ve);
			
		}
		
		
		
		
		
		
		
		
//		Iterator<String> ids=venky.iterator();
//	    String parent=	ids.next();
//		String child=ids.next();
//		String child2=ids.next();
//		driver.switchTo().window(child);
//		System.out.println(driver.getTitle());
//		driver.findElement(By.xpath("//*[@id=\"search-form\"]/input[1]")).sendKeys("i need help");//child 1
//		//driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("i need help");//parent
//		driver.switchTo().window(child2);
//		System.out.println(driver.getTitle());
//		driver.switchTo().window(parent);
//		System.out.println(driver.getTitle());
//		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("i need help");//parent
		//System.out.println(driver.getTitle());
		//driver.findElement(By.xpath("//*[@id=\"search-form\"]/input[1]")).sendKeys(" i need help");
//		Set<String> ids=driver.getWindowHandles();
//		System.out.println(ids);
//		Iterator<String> ven=ids.iterator();
//		String parent=ven.next();
//		String child=ven.next();
//		System.out.println("this is parent  "+parent);
//		System.out.println("this is child  "+child);
//		System.out.println(driver.getTitle()); 
//		driver.switchTo().window(child);
//		System.out.println(driver.getTitle()); 
//		driver.switchTo().window(parent)
//;		System.out.println(driver.getTitle());
//		
		
		
	}

}
