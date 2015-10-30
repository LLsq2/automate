package com.appneta.automation.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Header {

	public static WebElement headerTitle(WebDriver driver) {
		return driver.findElement(By.cssSelector("#header div#header-content h1"));
	}
	
	public static WebElement shareButton (WebDriver driver) {
		return driver.findElement(By.cssSelector(".dropdown-toggle.pull-right"));
	}
	
	public static WebElement messagesButton(WebDriver driver) {
		return driver.findElement(By.cssSelector("#user-messages a"));
	}
	
	public static WebElement settingsButton(WebDriver driver) {
		return driver.findElement(By.cssSelector("#settings-menu span"));
	}
	
	public static WebElement username(WebDriver driver) {
		return driver.findElement(By.cssSelector("#user-menu span span"));
	}
}
