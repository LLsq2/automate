package com.appneta.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.appneta.automate.tests.AppView;

public class main {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		boolean boo1 = AppView.appViewWebApp(driver);
		boolean boo2 = AppView.appViewWebDash(driver);
		boolean boo3 = AppView.appViewWebMon(driver);
		boolean boo4 = AppView.appViewCompView(driver);
		boolean boo5 = AppView.appViewEvents(driver);

	}

}
