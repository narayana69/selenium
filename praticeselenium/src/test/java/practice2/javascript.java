package practice2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class javascript {

	

	public static void drawborder(WebElement element,WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='3px solid green'", element);
	}
	public static String title(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
	String k=js.executeScript("return document.title").toString();
	return k;	
	}
	public static void click(WebElement element,WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);
	}
	public static void alret(WebDriver driver,String message) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('"+message+"')");
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
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	}

	public static void zoom(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.body.style.zoom='50%'");
	}
	public static void flash(WebDriver driver,WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String bgcolor=element.getCssValue("backgroundcolor");
		for(int i=0; i<4;i++) {
			changecolor("green",element,driver);
			changecolor(bgcolor,element,driver);
		}
	}
	public static void changecolor(String color,WebElement element, WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.backgroundColor='"+color+"'",element);
	try {
		Thread.sleep(2000);
	} catch (Exception e) {
		
	}}
	
}
