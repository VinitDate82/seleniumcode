package com.WebTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		System.out.println("Chrome Browser opened");
		
		driver.get("https://www.google.com");

		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
				
	}
}
