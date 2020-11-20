package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase {
	WebDriver driver;
	@Test(priority=1)
	private void browser() {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\gopal\\eclipse-workspace\\MavenProject\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
		
	//}
	//@Test(priority=3)
	//private void password() {
	WebElement txtemail = driver.findElement(By.id("email"));
	txtemail.sendKeys("Hello");
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("Welcome",Keys.ENTER);
		//}
	
	
	
	//@Test(priority=2)
	//private void userName() {
	
		}
	
	
	
}
