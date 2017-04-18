package com.cybage.alm.TechDataDemo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class RegistrationTest {
	WebDriver driver;
	
	 @Test
	  public void registration() throws Exception {
		 
		 /*FirefoxProfile prof = new FirefoxProfile();
		 prof.setPreference("browser.startup.homepage_override.mstone", "ignore");
		 prof.setPreference("startup.homepage_welcome_url.additional", "about:blank");
		 driver = new FirefoxDriver(prof);*/

		driver=new FirefoxDriver();
	    driver.get("http://newtours.demoaut.com");
	    driver.findElement(By.linkText("REGISTER")).click();
	    driver.findElement(By.name("firstName")).clear();
	    driver.findElement(By.name("firstName")).sendKeys("shiva");
	    driver.findElement(By.name("lastName")).clear();
	    driver.findElement(By.name("lastName")).sendKeys("s");
	    driver.findElement(By.name("phone")).clear();
	    driver.findElement(By.name("phone")).sendKeys("1111111111");
	    driver.findElement(By.id("userName")).clear();
	    driver.findElement(By.id("userName")).sendKeys("s@g.com");
	    driver.findElement(By.name("address1")).clear();
	    driver.findElement(By.name("address1")).sendKeys("jhgjhghj");
	    driver.findElement(By.name("address2")).clear();
	    driver.findElement(By.name("address2")).sendKeys("jhghg");
	    driver.findElement(By.name("city")).clear();
	    driver.findElement(By.name("city")).sendKeys("hghjgjh");
	    driver.findElement(By.name("state")).clear();
	    driver.findElement(By.name("state")).sendKeys("jkh");
	    driver.findElement(By.name("postalCode")).clear();
	    driver.findElement(By.name("postalCode")).sendKeys("4545454");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("ss");
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys("ss");
	    driver.findElement(By.name("confirmPassword")).clear();
	    driver.findElement(By.name("confirmPassword")).sendKeys("ss");
	    driver.findElement(By.name("register")).click();
	 
	 driver.close();
	 }
	 
}
