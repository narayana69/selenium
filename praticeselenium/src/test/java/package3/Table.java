package package3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://tablepress.org/demo/");
		// FIND OUT HOW MANY ROWS	

		int rows=	driver.findElements(By.xpath("//body/center[1]/table[1]//tbody//tr")).size();
		System.out.println("rows  "+rows);

		//FIND OUT HOW MANY COLOUMNS

		int cls=	driver.findElements(By.xpath("//body/center[1]/table[1]//tbody//tr[1]//th")).size();
		System.out.println("coloumns  "+cls);
         
       //RETRIEW SPECIFIC ROW AND SPECIFIC COLOUMN DATA
		 
		String ele12=	driver.findElement(By.xpath("//body/center[1]/table[1]//tbody//tr[2]//td[4]")).getText();
		System.out.println("data  "+ele12);
		
		//HOW TO RETRIEW ALL DATA
		
		for(int r=1;r<=rows;r++) {
			for(int c=1;c<=cls;c++) {
			String k=	driver.findElement(By.xpath("//body/center[1]/table[1]//tr["+r+"]//td{"+c+"]")).getText();
				System.out.println(k+" ");
			}
				
			System.out.println("");
		}
		driver.quit();
	}

}
