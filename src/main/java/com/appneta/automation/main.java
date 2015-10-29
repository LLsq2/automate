package com.appneta.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.appneta.automate.tests.AppView;

public class main {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		AppView.appViewWebApp(driver);
		AppView.appViewWebDash(driver);
		AppView.appViewWebMon(driver);
		AppView.appViewCompView(driver);
		AppView.appViewEvents(driver);

	}

}
