package com.appneta.automation.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Events {
	
	public static WebElement emptyText(WebDriver driver) {
		return driver.findElement(By.className("empty-message"));
	}
	
	public static WebElement helpButton(WebDriver driver) {
		return driver.findElement(By.className("help-button"));
	}
	
	public static WebElement helpWindow(WebDriver driver) {
		return driver.findElement(By.cssSelector(".ui-dialog.ui-widget.ui-widget-content.ui-corner-all.help.ui-draggable.ui-resizable"));
	}
	
	public static WebElement helpWindowTitle(WebDriver driver) {
		return driver.findElement(By.id("ui-dialog-title-eventsTooltip-content"));
	}
	
	public static WebElement helpWindowCloseButton(WebDriver driver) {
		return driver.findElement(By.cssSelector(".ui-icon.ui-icon-closethick"));
	}

}
