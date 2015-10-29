package com.appneta.automation.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebDashboard {
	
	public static WebElement dashboardTitle(WebDriver driver) {
		return driver.findElement(By.className("dashboard-name"));
	}
	
	public static WebElement editDashboardTitle(WebDriver driver) {
		return driver.findElement(By.className("fa fa-pencil edit-toggle clickable dashboard-edit"));
	}
}
