package com.cybage.alm.TechDataDemo;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class LoginTest {
	
	public static WebDriver driver;
	

	@Test
	public void positiveTest() {
		/*FirefoxProfile prof = new FirefoxProfile();
		prof.setPreference("browser.startup.homepage_override.mstone", "ignore");
		prof.setPreference("startup.homepage_welcome_url.additional", "about:blank");
		driver = new FirefoxDriver(prof);
*/
	driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		WebElement user = driver.findElement(By.name("userName"));
		user.sendKeys("mercury");
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		driver.quit();

	}

	@Test
	public void negativeTest() {
		try {
			/*
			FirefoxProfile prof = new FirefoxProfile();
			prof.setPreference("browser.startup.homepage_override.mstone", "ignore");
			prof.setPreference("startup.homepage_welcome_url.additional", "about:blank");
			driver = new FirefoxDriver(prof);*/

          driver = new FirefoxDriver();
			driver.get("http://newtours.demoaut.com");
			WebElement user = driver.findElement(By.name("userName"));
			user.sendKeys("mercury");
			WebElement pass = driver.findElement(By.name("password"));
			pass.sendKeys("mercury");
			driver.findElement(By.name("login0")).click();
		} finally  {
			driver.quit();
		}
		

	}

	@Test
	public void dummyTest() {
		try {
			
			/*FirefoxProfile prof = new FirefoxProfile();
			prof.setPreference("browser.startup.homepage_override.mstone", "ignore");
			prof.setPreference("startup.homepage_welcome_url.additional", "about:blank");
			driver = new FirefoxDriver(prof);
*/
			driver = new FirefoxDriver();
			
			driver.get("http://newtours.demoaut.com");
			WebElement user = driver.findElement(By.name("userName"));
			user.sendKeys("mercury");
			WebElement pass = driver.findElement(By.name("password"));
			pass.sendKeys("mercury");
			driver.findElement(By.name("login0")).click();
			
		} finally  {
			driver.quit();
		}
	}
	

}
