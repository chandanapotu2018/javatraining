package com.simplilearn.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookTestById {
	public static void main(String[] args) {
		
		//step:1 Declare path of driver
		
		String path="C:\\javatraining\\phase5\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		
		//step:2 initiate the driver
		
		WebDriver driver= new ChromeDriver();
		
		//step:3 base url
		
		String base_url="https://www.facebook.com/";
		
		
		//step:4 launch the facebook
		
		driver.get(base_url);
		
		
		//finding email
		WebElement email= driver.findElement(By.id("email"));
		System.out.println(email.getAttribute("placeholder"));
		
		
		//finding password
		WebElement pass= driver.findElement(By.id("pass"));
		System.out.println(pass.getAttribute("placeholder"));
		 
		
		//type email using sendkeys
		
		email.sendKeys("9912155448");
		pass.sendKeys("chandu@anu");
		
		//login  button
		WebElement login= driver.findElement(By.name("login"));
		login.click();
		
	}

}
