package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestAssert {
	
	@Test
	private void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gopal\\eclipse-workspace\\MavenProject\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.facebook.com");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("Gopaljack");
		String attribute = email.getAttribute("value");
		System.out.println(attribute);
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("7401132254",Keys.ENTER);
		
	}

}
