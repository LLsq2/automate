package com.appneta.automation.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ComparisonViews {

	public static WebElement entriesDropDown(WebDriver driver) {
		return driver.findElement(By.name("DataTables_Table_0_length"));
	}
}