package com.appneta.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class main {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		boolean boo1 = true;
		boolean boo2 = true;
		boolean boo3 = true;
		boolean boo4 = true;
		boolean boo5 = true;
		
//		try {
//			AppView.appViewWebApplications(driver);
//		}
//		catch(NotMatchException e) {
//			boo1 = false;
//		}
//		try {
//			AppView.appViewWebDashboard(driver);
//		}
//		catch(NotMatchException e) {
//			boo2 = false;
//		}
		try{
			AppView.appViewWebMonitors(driver);
		}
		catch(NotMatchException e) {
			boo3 = false;
			System.out.println("Text did not match");
		}
//		try {
//			AppView.appViewComparisonViews(driver);
//		}
//		catch(NotMatchException e) {
//			boo4 = false;
//		}
//		try {
//			AppView.appViewEvents(driver);
//		}
//		catch(NotMatchException e) {
//			boo5 = false;
//		}
		
		driver.quit();

		OutputResults.results(boo1, boo2, boo3, boo4, boo5);
	}

}
