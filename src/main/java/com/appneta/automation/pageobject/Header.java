package com.appneta.automation.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Header {

	public static WebElement headerTitle(WebDriver driver) {
		return driver.findElement(By.cssSelector("#header div#header-content h1"));
	}
}
