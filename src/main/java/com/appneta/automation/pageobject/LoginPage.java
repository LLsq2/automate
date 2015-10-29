package com.appneta.automation.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	
	public static WebElement username(WebDriver driver) {
		return driver.findElement(By.id("username-input"));
	}
	
	public static WebElement password(WebDriver driver) {
		return driver.findElement(By.name("j_password"));
	}
}
