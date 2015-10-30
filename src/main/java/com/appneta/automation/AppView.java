package com.appneta.automation;

import org.openqa.selenium.WebDriver;

import com.appneta.automation.pageobject.Header;
import com.appneta.automation.pageobject.LoginPage;
import com.appneta.automation.pageobject.MenuItems;
import com.appneta.automation.pageobject.WebApplication;

public class AppView {

	public static void appViewWebApplications(WebDriver driver) throws NotMatchException {
		Helper helper = new Helper();
		driver.get("https://signon.pv-st.appneta.com/signon/login.html");
		LoginPage.username(driver).sendKeys("testhouse@appneta.com");
		LoginPage.password(driver).sendKeys("@ppN3ta!");
		LoginPage.username(driver).submit();

		//access AppView through menus
		MenuItems.appViewButton(driver).click();
		helper.explicitWait(driver, MenuItems.webApp(driver));
		MenuItems.webApp(driver).click();
		
		helper.catchMessage(driver, helper);

		System.out.println("Check header buttons");
		Header.headerTitle(driver).isDisplayed();
		helper.checkText(Header.headerTitle(driver), "Web Applications");
		Header.shareButton(driver).isDisplayed();
		Header.messagesButton(driver).isDisplayed();
		Header.settingsButton(driver).isDisplayed();
		Header.username(driver).isDisplayed();
		helper.checkText(Header.username(driver), "testhouse@appneta.com");
		
		System.out.println("Check Web Application Buttons");
		WebApplication.addWebApplication(driver).isDisplayed();
		WebApplication.addGlobalWebMonitor(driver).isDisplayed();
		WebApplication.sortByButton(driver).isDisplayed();
		WebApplication.expandAllButton(driver).isDisplayed();
		WebApplication.collapseAllButton(driver).isDisplayed();
		WebApplication.mapToggleButton(driver).isDisplayed();
		
		System.out.println("Checking Web Applcation form");
		WebApplication.addWebApplication(driver).click();
		helper.explicitWait(driver, WebApplication.webApplicationForm(driver));
		WebApplication.webApplicationFormTitle(driver).isDisplayed();
		helper.checkText(WebApplication.webApplicationFormTitle(driver), "define a new web app");
		WebApplication.webApplicationFormAppDropDown(driver).isDisplayed();
		WebApplication.webApplicationFormAppDropDown(driver).click();
		helper.checkText(WebApplication.webApplicationFormAppDropDownList(driver, 1), "Custom");
		helper.checkText(WebApplication.webApplicationFormAppDropDownList(driver, 2), "Salesforce");
		helper.checkText(WebApplication.webApplicationFormAppDropDownList(driver, 3), "Microsoft Office 365");
		helper.checkText(WebApplication.webApplicationFormAppDropDownList(driver, 4), "AthenaHealth");
		helper.checkText(WebApplication.webApplicationFormAppDropDownList(driver, 5), "Google Apps");
		helper.checkText(WebApplication.webApplicationFormAppDropDownList(driver, 6), "ServiceNow");
		helper.checkText(WebApplication.webApplicationFormAppDropDownList(driver, 7), "Desk.com");
		helper.checkText(WebApplication.webApplicationFormAppDropDownList(driver, 1), "Confluence");
		WebApplication.webApplicationFormCancelButton(driver).isDisplayed();
		WebApplication.webApplicationFormCancelButton(driver).click();
	}

	public static void appViewWebDashboard(WebDriver driver) throws NotMatchException {
		Helper helper = new Helper();
		driver.get("https://signon.pv-st.appneta.com/signon/login.html");
		LoginPage.username(driver).sendKeys("testhouse@appneta.com");
		LoginPage.password(driver).sendKeys("@ppN3ta!");
		LoginPage.username(driver).submit();

		//access AppView through menus
		MenuItems.appViewButton(driver).click();
		helper.explicitWait(driver, MenuItems.webDash(driver));
		MenuItems.webDash(driver).click();

		System.out.println("Check header buttons");
		helper.pause(2);
		Header.headerTitle(driver).isDisplayed();
		helper.checkText(Header.headerTitle(driver), "Web Dashboard");
		Header.shareButton(driver).isDisplayed();
		Header.messagesButton(driver).isDisplayed();
		Header.settingsButton(driver).isDisplayed();
		Header.username(driver).isDisplayed();
		helper.checkText(Header.username(driver), "testhouse@appneta.com");
		
		System.out.println("Check Web Dashboard Buttons");
	}

	public static void appViewWebMonitors(WebDriver driver) throws NotMatchException {
		Helper helper = new Helper();
		driver.get("https://signon.pv-st.appneta.com/signon/login.html");
		LoginPage.username(driver).sendKeys("testhouse@appneta.com");
		LoginPage.password(driver).sendKeys("@ppN3ta!");
		LoginPage.username(driver).submit();

		//access AppView through menus
		MenuItems.appViewButton(driver).click();
		helper.explicitWait(driver, MenuItems.webMon(driver));
		MenuItems.webMon(driver).click();

		System.out.println("Check header buttons");
		helper.pause(2);
		Header.headerTitle(driver).isDisplayed();
		helper.checkText(Header.headerTitle(driver), "Web Monitors");
		Header.shareButton(driver).isDisplayed();
		Header.messagesButton(driver).isDisplayed();
		Header.settingsButton(driver).isDisplayed();
		Header.username(driver).isDisplayed();
		helper.checkText(Header.username(driver), "testhouse@appneta.com");

	}

	public static void appViewComparisonViews(WebDriver driver) throws NotMatchException {
		Helper helper = new Helper();
		driver.get("https://signon.pv-st.appneta.com/signon/login.html");
		LoginPage.username(driver).sendKeys("testhouse@appneta.com");
		LoginPage.password(driver).sendKeys("@ppN3ta!");
		LoginPage.username(driver).submit();

		//access AppView through menus
		MenuItems.appViewButton(driver).click();
		helper.explicitWait(driver, MenuItems.compView(driver));
		MenuItems.compView(driver).click();

		//check Header items
		helper.pause(2);
		Header.headerTitle(driver).isDisplayed();
		helper.checkText(Header.headerTitle(driver), "Comparison Views");
		Header.messagesButton(driver).isDisplayed();
		Header.settingsButton(driver).isDisplayed();
		Header.username(driver).isDisplayed();
		helper.checkText(Header.username(driver), "testhouse@appneta.com");
		
		//check buttons
		

	}

	public static void appViewEvents(WebDriver driver) throws NotMatchException {
		Helper helper = new Helper();
		driver.get("https://signon.pv-st.appneta.com/signon/login.html");
		LoginPage.username(driver).sendKeys("testhouse@appneta.com");
		LoginPage.password(driver).sendKeys("@ppN3ta!");
		LoginPage.username(driver).submit();

		//access AppView through menus
		MenuItems.appViewButton(driver).click();
		helper.explicitWait(driver, MenuItems.events(driver));
		MenuItems.events(driver).click();

		System.out.println("Check header buttons");
		helper.pause(2);
		Header.headerTitle(driver).isDisplayed();
		helper.checkText(Header.headerTitle(driver), "Web Monitor Event Distribution: Past 7 Days");
		Header.messagesButton(driver).isDisplayed();
		Header.settingsButton(driver).isDisplayed();
		Header.username(driver).isDisplayed();
		helper.checkText(Header.username(driver), "testhouse@appneta.com");

	}
}
