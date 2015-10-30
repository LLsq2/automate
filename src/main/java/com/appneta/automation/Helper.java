package com.appneta.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.appneta.automation.pageobject.Header;

public class Helper {
	
	public Helper() {
	}

	public void explicitWait(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void pause(int secs) {
		secs*=10;
		try {
			Thread.sleep(secs);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void checkText(WebElement element, String text) throws NotMatchException {
		if (!element.getText().equals(text)) {
			throw new NotMatchException();
		}
	}
	
	public void catchMessage(WebDriver driver, Helper helper) {
		WebElement element = null;
		try {
			element = driver.findElement(By.className("tlypageguide_dismiss"));
			helper.explicitWait(driver, element);
			element.click();
		}
		catch (NoSuchElementException e) {
			
		}
	}
}