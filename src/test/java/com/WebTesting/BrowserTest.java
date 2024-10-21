package com.WebTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		System.out.println("Chrome Browser opened");
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		//email
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		//password
		driver.findElement(By.name("password")).sendKeys("Admin123");

		//checkbox
		driver.findElement(By.className(contains("login-button"))
				.className.contains(("login-button")).click();
		
		//button-InvalidSelectorException: Compound class names not permitted
		//driver.findElement(By.className("btn btn-default btn-primary")).click();
		
		driver.findElement(By.className("btn-default")).click();
		System.out.println("Successfully logged in to site");
		
		driver.get("https://automationplayground.com/crm/sign_out.html");
		
		//driver.quit();
	}
}
