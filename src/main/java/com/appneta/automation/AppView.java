package com.appneta.automation;

import org.openqa.selenium.WebDriver;

import com.appneta.automation.pageobject.Header;
import com.appneta.automation.pageobject.LoginPage;
import com.appneta.automation.pageobject.MenuItems;
import com.appneta.automation.pageobject.WebApplication;
import com.appneta.automation.pageobject.WebDashboard;
import com.appneta.automation.pageobject.WebMonitor;

public class AppView {

	public static void appViewWebApplications(WebDriver driver) throws NotMatchException {
		Helper helper = new Helper();
		driver.get("https://signon.pv-st.appneta.com/signon/login.html");
		LoginPage.username(driver).sendKeys("testhouse@appneta.com");
		LoginPage.password(driver).sendKeys("@ppN3ta!");
		LoginPage.username(driver).submit();

		System.out.print("Accessing Menu");
		MenuItems.appViewButton(driver).click();
		helper.explicitWait(driver, MenuItems.webApp(driver));
		MenuItems.webApp(driver).click();
		System.out.println("...done");
		
		helper.catchMessage(driver, helper);

		System.out.print("Check header buttons");
		Header.headerTitle(driver).isDisplayed();
		helper.checkText(Header.headerTitle(driver), "Web Applications");
		Header.shareButton(driver).isDisplayed();
		Header.messagesButton(driver).isDisplayed();
		Header.settingsButton(driver).isDisplayed();
		Header.username(driver).isDisplayed();
		helper.checkText(Header.username(driver), "testhouse@appneta.com");
		System.out.println("...done");
		
		System.out.print("Check Web Application Buttons");
		WebApplication.addWebApplication(driver).isDisplayed();
		WebApplication.addGlobalWebMonitor(driver).isDisplayed();
		WebApplication.sortByButton(driver).isDisplayed();
		WebApplication.expandAllButton(driver).isDisplayed();
		WebApplication.collapseAllButton(driver).isDisplayed();
		WebApplication.mapToggleButton(driver).isDisplayed();
		System.out.println("...done");
		
		System.out.print("Checking Web Applcation form");
		WebApplication.addWebApplication(driver).click();
		helper.explicitWait(driver, WebApplication.webApplicationForm(driver));
		WebApplication.webApplicationFormTitle(driver).isDisplayed();
		helper.checkText(WebApplication.webApplicationFormTitle(driver), "define a new web app");
		WebApplication.webApplicationFormAppDropDown(driver).isDisplayed();
		WebApplication.webApplicationFormAppDropDown(driver).click();
		System.out.println("...done");
		System.out.print("Checking Web Applcation dropdown");
		helper.checkText(WebApplication.webApplicationFormAppDropDownList(driver, 1), "Custom");
		helper.checkText(WebApplication.webApplicationFormAppDropDownList(driver, 2), "Salesforce");
		helper.checkText(WebApplication.webApplicationFormAppDropDownList(driver, 3), "Microsoft Office 365");
		helper.checkText(WebApplication.webApplicationFormAppDropDownList(driver, 4), "AthenaHealth");
		helper.checkText(WebApplication.webApplicationFormAppDropDownList(driver, 5), "Google Apps");
		helper.checkText(WebApplication.webApplicationFormAppDropDownList(driver, 6), "ServiceNow");
		helper.checkText(WebApplication.webApplicationFormAppDropDownList(driver, 7), "Desk.com");
		helper.checkText(WebApplication.webApplicationFormAppDropDownList(driver, 8), "Confluence");
		WebApplication.webApplicationFormCancelButton(driver).isDisplayed();
		WebApplication.webApplicationFormCancelButton(driver).click();
		System.out.println("...done");
	}

	public static void appViewWebDashboard(WebDriver driver) throws NotMatchException {
		Helper helper = new Helper();
		driver.get("https://signon.pv-st.appneta.com/signon/login.html");
		LoginPage.username(driver).sendKeys("testhouse@appneta.com");
		LoginPage.password(driver).sendKeys("@ppN3ta!");
		LoginPage.username(driver).submit();

		System.out.print("Accessing Menu");
		MenuItems.appViewButton(driver).click();
		helper.explicitWait(driver, MenuItems.webDash(driver));
		MenuItems.webDash(driver).click();
		System.out.println("...done");

		System.out.print("Check header buttons");
		helper.pause(2);
		Header.headerTitle(driver).isDisplayed();
		helper.checkText(Header.headerTitle(driver), "Web Dashboard");
		Header.shareButton(driver).isDisplayed();
		Header.messagesButton(driver).isDisplayed();
		Header.settingsButton(driver).isDisplayed();
		Header.username(driver).isDisplayed();
		helper.checkText(Header.username(driver), "testhouse@appneta.com");
		System.out.println("...done");
		
		System.out.print("Check Web Dashboard Header");
		WebDashboard.dashboardTitle(driver).isDisplayed();
		helper.checkText(WebDashboard.dashboardTitle(driver), "Name Your Dashboard");
		WebDashboard.editDashboardTitle(driver).isDisplayed();
		WebDashboard.switchDashboardButton(driver).isDisplayed();
		WebDashboard.newDashboardButton(driver).isDisplayed();
		System.out.println("...done");
	}

	public static void appViewWebMonitors(WebDriver driver) throws NotMatchException {
		Helper helper = new Helper();
		driver.get("https://signon.pv-st.appneta.com/signon/login.html");
		LoginPage.username(driver).sendKeys("testhouse@appneta.com");
		LoginPage.password(driver).sendKeys("@ppN3ta!");
		LoginPage.username(driver).submit();

		System.out.print("Accessing Menu");
		MenuItems.appViewButton(driver).click();
		helper.explicitWait(driver, MenuItems.webMon(driver));
		MenuItems.webMon(driver).click();
		System.out.println("...done");

		System.out.print("Check header buttons");
		helper.pause(2);
		Header.headerTitle(driver).isDisplayed();
		helper.checkText(Header.headerTitle(driver), "Web Monitors");
		Header.shareButton(driver).isDisplayed();
		Header.messagesButton(driver).isDisplayed();
		Header.settingsButton(driver).isDisplayed();
		Header.username(driver).isDisplayed();
		helper.checkText(Header.username(driver), "testhouse@appneta.com");
		System.out.println("...done");
		
		System.out.print("Check Web Monitor Header");
		WebMonitor.groupByButton(driver).isDisplayed();
		WebMonitor.groupByButton(driver).click();
		helper.checkText(WebMonitor.groupByList(driver, 1), "Group");
		helper.checkText(WebMonitor.groupByList(driver, 2), "Appliance");
		helper.checkText(WebMonitor.groupByList(driver, 3), "Monitoring Target");
		helper.checkText(WebMonitor.groupByList(driver, 4), "None");
		WebMonitor.bulkActionButton(driver).isDisplayed();
		WebMonitor.requestGlobalMonitorButton(driver).isDisplayed();
		WebMonitor.expandAllButton(driver).isDisplayed();
		WebMonitor.collapseAllButton(driver).isDisplayed();
		System.out.println("...done");
		System.out.print("Check help function");
		WebMonitor.helpButton(driver).isDisplayed();
		WebMonitor.helpButton(driver).click();
		WebMonitor.helpWindow(driver).isDisplayed();
		helper.checkText(WebMonitor.helpWindowTitle(driver), "Quick Help");
		WebMonitor.helpWindowCloseButton(driver).click();
		System.out.println("...done");
	}

	public static void appViewComparisonViews(WebDriver driver) throws NotMatchException {
		Helper helper = new Helper();
		driver.get("https://signon.pv-st.appneta.com/signon/login.html");
		LoginPage.username(driver).sendKeys("testhouse@appneta.com");
		LoginPage.password(driver).sendKeys("@ppN3ta!");
		LoginPage.username(driver).submit();

		System.out.print("Accessing Menu");
		MenuItems.appViewButton(driver).click();
		helper.explicitWait(driver, MenuItems.compView(driver));
		MenuItems.compView(driver).click();
		System.out.println("...done");

		System.out.print("Check header buttons");
		helper.pause(2);
		Header.headerTitle(driver).isDisplayed();
		helper.checkText(Header.headerTitle(driver), "Comparison Views");
		Header.messagesButton(driver).isDisplayed();
		Header.settingsButton(driver).isDisplayed();
		Header.username(driver).isDisplayed();
		helper.checkText(Header.username(driver), "testhouse@appneta.com");
		System.out.println("...done");
		
		//check buttons
		

	}

	public static void appViewEvents(WebDriver driver) throws NotMatchException {
		Helper helper = new Helper();
		driver.get("https://signon.pv-st.appneta.com/signon/login.html");
		LoginPage.username(driver).sendKeys("testhouse@appneta.com");
		LoginPage.password(driver).sendKeys("@ppN3ta!");
		LoginPage.username(driver).submit();

		System.out.print("Accessing Menu");
		MenuItems.appViewButton(driver).click();
		helper.explicitWait(driver, MenuItems.events(driver));
		MenuItems.events(driver).click();
		System.out.println("...done");

		System.out.print("Check header buttons");
		helper.pause(2);
		Header.headerTitle(driver).isDisplayed();
		helper.checkText(Header.headerTitle(driver), "Web Monitor Event Distribution: Past 7 Days");
		Header.messagesButton(driver).isDisplayed();
		Header.settingsButton(driver).isDisplayed();
		Header.username(driver).isDisplayed();
		helper.checkText(Header.username(driver), "testhouse@appneta.com");
		System.out.println("...done");

	}
}
