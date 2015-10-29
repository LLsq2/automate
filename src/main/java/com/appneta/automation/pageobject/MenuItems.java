package com.appneta.automation.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuItems {

	public static WebElement appViewButton(WebDriver driver) {
		return driver.findElement(By.cssSelector(".accordion>li+li+li a"));
	}
	
	public static WebElement webApp(WebDriver driver) {
		return driver.findElement(By.cssSelector(".accordion>li+li+li li"));
	}
	
	public static WebElement webDash(WebDriver driver) {
		return driver.findElement(By.cssSelector(".accordion>li+li+li li+li"));
	}
	
	public static WebElement webMon(WebDriver driver) {
		return driver.findElement(By.cssSelector(".accordion>li+li+li li+li+li"));
	}
	
	public static WebElement compView(WebDriver driver) {
		return driver.findElement(By.cssSelector(".accordion>li+li+li li+li+li+li"));
	}
	
	public static WebElement events(WebDriver driver) {
		return driver.findElement(By.cssSelector(".accordion>li+li+li li+li+li+li+li"));
	}
}
