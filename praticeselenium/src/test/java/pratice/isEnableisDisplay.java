package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class isEnableisDisplay {

	public static void main(String[] args) {
		// conditional commands
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		WebElement venky=driver.findElement(By.xpath("//input[@id='password']"));
	System.out.println("is display method   "+venky.isDisplayed());	//it returns boolean value
	System.out.println("is display method   "+venky.isEnabled());   //same
	System.out.println("is display method   "+venky.isSelected());	// same .it can perform on check boxes radio buutons drop downs
	WebElement venky1=driver.findElement(By.xpath("//input[@id='male']"));
	venky1.click();
	System.out.println("is display method   "+venky1.isSelected());//true
	WebElement venky2=driver.findElement(By.xpath("//label[normalize-space()='Female']"));
	System.out.println("is display method   "+venky2.isSelected());//false
	}

}
