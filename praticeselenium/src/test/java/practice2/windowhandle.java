package practice2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://accounts.google.com/signup/v2/createaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		String sing=driver.getWindowHandle();
		System.out.println(sing);

		WebElement ele=	driver.findElement(By.xpath("//a[normalize-space()='Help']"));
		ele.click();
		WebElement ele1=driver.findElement(By.xpath("//a[normalize-space()='Privacy']"));
		ele1.click();
		WebElement ele2=driver.findElement(By.xpath("//a[normalize-space()='Terms']"));
		ele2.click();

		Set<String> ven= driver.getWindowHandles();
		System.out.println(ven);

		//BY USING ITERATOR METHOD
	
	/*	Iterator<String> it=ven.iterator();
		String parent=it.next();
		String child1=it.next();
		String child2=it.next();
		String child3=it.next();
		System.out.println(driver.getTitle());
		System.out.println(it);
		driver.switchTo().window(child3);//privacy
		System.out.println(driver.getTitle());
		//driver.findElement(By.xpath("")).click();
		
		
		driver.switchTo().window(child2);// help
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@placeholder='Describe your issue']")).sendKeys("venky");
		
		
		
		driver.switchTo().window(child1);//terms
		System.out.println(driver.getTitle());
		//driver.findElement(By.xpath("")).click();
		
		
		
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("power");*/
				
       List<String> li=new ArrayList<String>(ven);
//       String parent=li.get(0);
//       String child1=li.get(1);
//       String child2=li.get(2);
//       String child3=li.get(3); 
//       driver.switchTo().window(child3);
//       System.out.println(driver.getTitle());
//       driver.switchTo().window(child1);
//       System.out.println(driver.getTitle());
	
       
       // BY USING FOR LOOP
       
       for(String e:li) {
    	   System.out.println(e);
    	String te=   driver.switchTo(). window(e).getTitle();
    	  System.out.println(te); 
       }
	}
}
