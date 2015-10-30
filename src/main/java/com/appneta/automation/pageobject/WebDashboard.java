package com.appneta.automation.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebDashboard {
	
	public static WebElement dashboardTitle(WebDriver driver) {
		return driver.findElement(By.className("dashboard-name"));
	}
	
	public static WebElement editDashboardTitle(WebDriver driver) {
		return driver.findElement(By.cssSelector(".fa.fa-pencil.edit-toggle.clickable.dashboard-edit"));
	}
	
	public static WebElement switchDashboardButton(WebDriver driver) {
		return driver.findElement(By.cssSelector("#dashboards-top-bar button"));
	}
	
	public static WebElement newDashboardButton(WebDriver driver) {
		return driver.findElement(By.cssSelector(".ui-button.ui-button-success"));
	}
	
}
