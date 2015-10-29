package com.appneta.automation.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebMonitor {

	public static WebElement groupByButton(WebDriver driver) {
		return driver.findElement(By.cssSelector("#group-by-menu button"));
	}
	
	public static WebElement bulkActionButton(WebDriver driver) {
		return driver.findElement(By.cssSelector("#group-by-menu button"));
	}
	
	public static WebElement requestGlobalMonitorButton(WebDriver driver) {
		return driver.findElement(By.className("ui-button ui-button-success request-web-monitor-btn"));
	}
}
