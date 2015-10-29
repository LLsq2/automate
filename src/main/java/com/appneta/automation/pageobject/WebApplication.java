package com.appneta.automation.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebApplication {
	
	public static WebElement headerTitle(WebDriver driver) {
		return driver.findElement(By.cssSelector("#header div#header-content h1"));
	}
	
	public static WebElement addWebApplication(WebDriver driver) {
		return driver.findElement(By.id("addPathButton"));
	}
	
	public static WebElement addGlobalWebMonitor (WebDriver driver) {
		return driver.findElement(By.name("apn-button-request-web-monitor"));
	}

}
