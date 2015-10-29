package com.appneta.automate.tests;

import org.openqa.selenium.WebDriver;

import com.appneta.automation.pageobject.LoginPage;
import com.appneta.automation.pageobject.MenuItems;

public class AppView {

	public static boolean appViewWebApp(WebDriver driver) {
		driver.get("https://signon.pv-st.appneta.com/signon/login.html");
		LoginPage.username(driver).sendKeys("testhouse@appneta.com");
		LoginPage.password(driver).sendKeys("@ppN3ta!");
		LoginPage.username(driver).submit();
		
		//access AppView through menus
		MenuItems.appViewButton(driver).click();
		MenuItems.webApp(driver).click();
		
		return true;
	}

	public static boolean appViewWebDash(WebDriver driver) {
		driver.get("https://signon.pv-st.appneta.com/signon/login.html");
		LoginPage.username(driver).sendKeys("testhouse@appneta.com");
		LoginPage.password(driver).sendKeys("@ppN3ta!");
		LoginPage.username(driver).submit();
		
		//access AppView through menus
		MenuItems.appViewButton(driver).click();
		MenuItems.webDash(driver).click();
		
		return true;
	}

	public static boolean appViewWebMon(WebDriver driver) {
		driver.get("https://signon.pv-st.appneta.com/signon/login.html");
		LoginPage.username(driver).sendKeys("testhouse@appneta.com");
		LoginPage.password(driver).sendKeys("@ppN3ta!");
		LoginPage.username(driver).submit();
		
		//access AppView through menus
		MenuItems.appViewButton(driver).click();
		MenuItems.webMon(driver).click();
		
		return true;
	}

	public static boolean appViewCompView(WebDriver driver) {
		driver.get("https://signon.pv-st.appneta.com/signon/login.html");
		LoginPage.username(driver).sendKeys("testhouse@appneta.com");
		LoginPage.password(driver).sendKeys("@ppN3ta!");
		LoginPage.username(driver).submit();
		
		//access AppView through menus
		MenuItems.appViewButton(driver).click();
		MenuItems.compView(driver).click();
		
		return true;
	}

	public static boolean appViewEvents(WebDriver driver) {
		driver.get("https://signon.pv-st.appneta.com/signon/login.html");
		LoginPage.username(driver).sendKeys("testhouse@appneta.com");
		LoginPage.password(driver).sendKeys("@ppN3ta!");
		LoginPage.username(driver).submit();
		
		//access AppView through menus
		MenuItems.appViewButton(driver).click();
		MenuItems.events(driver).click();
		
		return true;
	}

}
