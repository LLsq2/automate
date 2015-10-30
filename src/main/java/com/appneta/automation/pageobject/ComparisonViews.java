package com.appneta.automation.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ComparisonViews {

	public static WebElement entriesDropDown(WebDriver driver) {
		return driver.findElement(By.name("DataTables_Table_0_length"));
	}
	
	public static WebElement entriesDropDownList(WebDriver driver, int num) {
		StringBuilder locator = new StringBuilder("#DataTables_Table_0_length option");
		for (int i=1; i<num; i++) {
			locator.append("+option");
		}
		return driver.findElement(By.cssSelector(locator.toString()));
	}
}
