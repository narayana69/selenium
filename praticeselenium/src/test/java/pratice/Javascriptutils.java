package pratice;

import org.apache.http.impl.conn.AbstractPoolEntry;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Javascriptutils {

public @interface AbstractPoolEntry {

	}
	//	public static void drawborder(WebDriver driver,WebElement element) {
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].style.border='3px solid green'", element);
//	}
//	public static String title(WebDriver driver) {
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		 String tit=js.executeScript("return document.title;").toString();
//		return tit; 
//	}
//	public static void click(WebElement element,WebDriver driver) {
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeAsyncScript("arguments[0].click()", element);
//	}
//	public static void alert(WebDriver driver,String message) {
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("alert('"+message+"')");
//	}
//	public static void refresh(WebDriver driver) {
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("history.go(0)");
//	}
//	public static void scrollpagedown(WebDriver driver) {
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//		
//	}
//	public static void scrollup(WebDriver driver) {
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
//	}
//	public static void zoom(WebDriver driver) {
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("document.body.style.zoom='50%'");
//	}
//	public static void flash(WebDriver driver,WebElement element) throws InterruptedException {
//		
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		String bgcolor=element.getCssValue("backgroundColor");
//		for(int i=0;i<5;i++) {
//			changecolor("red",element,driver);
//			changecolor(bgcolor,element,driver);
//			
//		}
//		
//	}
//	public static void changecolor(String color,WebElement element,WebDriver driver) throws InterruptedException {
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].style.backgroundColor='"+color+"'", element);
//		
//			Thread.sleep(5000);
//		
//	}
//	
	public static void drawborder(WebElement element,WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='5px solid yellow'",element);
	}
	public static String title(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String tit=js.executeScript("return document.title;").toString();
		
		return tit;
	}	
	
	public static void click(WebElement element,WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);
		
	}
	public static void alert(WebDriver driver,String message) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('"+message+"'");
	}
	
	public static void refresh(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("history.go(0)");
		
	}
	
	public static void scrolldown(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	public static void scrollup(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight");
	}
	public static void zoom(WebDriver driver) {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("document.body.style.zoom='50%'");
		
	}
	public static void flash(WebDriver driver,WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String bgcolor=element.getCssValue("backgroundcolor");
		for(int a=0;a<5;a++) {
			changecolor("red",element,driver);
			changecolor(bgcolor,element,driver);
		}
	}
	public static void changecolor(String color,WebElement element,WebDriver driver) {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.backgroundColor='"+color+"'",element);
		
		try {
			Thread.sleep(5000);
		}catch (Exception e) {
			
		}
	}
		
		
	
	
	
	
}
