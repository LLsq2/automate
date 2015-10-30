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
	
	public static WebElement expandAllButton(WebDriver driver) {
		return driver.findElement(By.cssSelector(".ui-button.panel-expand-all"));
	}
	
	public static WebElement collapseAllButton(WebDriver driver) {
		return driver.findElement(By.cssSelector(".ui-button.panel-collapse-all"));
	}
	
	public static WebElement helpButton(WebDriver driver) {
		return driver.findElement(By.className("help-button"));
	}
	
	public static WebElement groupByList(WebDriver driver, int num) {
		StringBuilder locator = new StringBuilder("#group-by-menu .dropdown-menu li");
		for (int i=1; i<num; i++) {
			locator.append("+li");
		}
		locator.append(" a");
		return driver.findElement(By.cssSelector(locator.toString()));
	}
	
	public static WebElement helpWindow(WebDriver driver) {
		return driver.findElement(By.cssSelector(".ui-dialog.ui-widget.ui-widget-content.ui-corner-all.help.ui-draggable.ui-resizable"));
	}
	
	public static WebElement helpWindowTitle(WebDriver driver) {
		return driver.findElement(By.id("ui-dialog-title-pathListTooltip-content"));
	}
	
	public static WebElement helpWindowCloseButton(WebDriver driver) {
		return driver.findElement(By.cssSelector(".ui-icon.ui-icon-closethick"));
	}
}
