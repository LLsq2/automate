package com.appneta.automation.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebApplication {
	
	public static WebElement addWebApplication(WebDriver driver) {
		return driver.findElement(By.id("addPathButton"));
	}
	
	public static WebElement addGlobalWebMonitor(WebDriver driver) {
		return driver.findElement(By.name("apn-button-request-web-monitor"));
	}
	
	public static WebElement sortByButton(WebDriver driver) {
		return driver.findElement(By.cssSelector("#ember683 button"));
	}
	
	public static WebElement expandAllButton(WebDriver driver) {
		return driver.findElement(By.cssSelector(".ui-button.panel-expand-all"));
	}
	
	public static WebElement collapseAllButton(WebDriver driver) {
		return driver.findElement(By.cssSelector(".ui-button.panel-collapse-all"));
	}
	
	public static WebElement mapToggleButton(WebDriver driver) {
		return driver.findElement(By.id("world-map-toggle"));
	}
	
	public static WebElement webApplicationForm(WebDriver driver) {
		return driver.findElement(By.cssSelector("#ember637 .form-horizontal"));
	}
	
	public static WebElement webApplicationFormTitle(WebDriver driver) {
		return driver.findElement(By.cssSelector("#ember637 .form-horizontal legend"));
	}
	
	public static WebElement webApplicationFormAppLabel(WebDriver driver) {
		return driver.findElement(By.cssSelector("#ember637 .form-horizontal .control-group span"));
	}
	
	public static WebElement webApplicationFormAppDropDown(WebDriver driver) {
		return driver.findElement(By.cssSelector("#ember637 .form-horizontal .control-group select"));
	}
	
	public static WebElement webApplicationFormCancelButton(WebDriver driver) {
		return driver.findElement(By.cssSelector("#ember637 .form-horizontal button[name='apn-button-cancel']"));
	}
	
	public static WebElement webApplicationFormAppDropDownList(WebDriver driver, int num) {
		StringBuilder locator = new StringBuilder("#ember637 .form-horizontal .control-group option");
		for (int i=1; i<num; i++) {
			locator.append("+option");
		}
		return driver.findElement(By.cssSelector(locator.toString()));
	}

}
