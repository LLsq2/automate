package com.appneta.automate.tests;

import org.openqa.selenium.WebDriver;

import com.appneta.automation.pageobject.LoginPage;
import com.appneta.automation.pageobject.MenuItems;

public class AppView {

	public static void appViewWebApp(WebDriver driver) {
		driver.get("https://signon.pv-st.appneta.com/signon/login.html");
		LoginPage.username(driver).sendKeys("testhouse@appneta.com");
		LoginPage.password(driver).sendKeys("@ppN3ta!");
		LoginPage.username(driver).submit();
		
		//access AppView through menus
		MenuItems.appViewButton(driver).click();
		MenuItems.webApp(driver).click();
	}

	public static void appViewWebDash(WebDriver driver) {
		driver.get("https://signon.pv-st.appneta.com/signon/login.html");
		LoginPage.username(driver).sendKeys("testhouse@appneta.com");
		LoginPage.password(driver).sendKeys("@ppN3ta!");
		LoginPage.username(driver).submit();
		
		//access AppView through menus
		MenuItems.appViewButton(driver).click();
		MenuItems.webDash(driver).click();
	}

	public static void appViewWebMon(WebDriver driver) {
		driver.get("https://signon.pv-st.appneta.com/signon/login.html");
		LoginPage.username(driver).sendKeys("testhouse@appneta.com");
		LoginPage.password(driver).sendKeys("@ppN3ta!");
		LoginPage.username(driver).submit();
		
		//access AppView through menus
		MenuItems.appViewButton(driver).click();
		MenuItems.webMon(driver).click();
	}

	public static void appViewCompView(WebDriver driver) {
		driver.get("https://signon.pv-st.appneta.com/signon/login.html");
		LoginPage.username(driver).sendKeys("testhouse@appneta.com");
		LoginPage.password(driver).sendKeys("@ppN3ta!");
		LoginPage.username(driver).submit();
		
		//access AppView through menus
		MenuItems.appViewButton(driver).click();
		MenuItems.compView(driver).click();
	}

	public static void appViewEvents(WebDriver driver) {
		driver.get("https://signon.pv-st.appneta.com/signon/login.html");
		LoginPage.username(driver).sendKeys("testhouse@appneta.com");
		LoginPage.password(driver).sendKeys("@ppN3ta!");
		LoginPage.username(driver).submit();
		
		//access AppView through menus
		MenuItems.appViewButton(driver).click();
		MenuItems.events(driver).click();
	}

}
