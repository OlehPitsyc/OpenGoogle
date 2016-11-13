package com.qagroup.google.pageobject;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google {
	private WebDriver driver;
	private static String baseUrl = "https://www.google.com.ua/";

	public StartPage openStartPage() {

		String pathSeparator = File.separator;
		String pathToDriver = "assets" + pathSeparator + "webdriver" + pathSeparator + "geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", pathToDriver);
		driver = new FirefoxDriver();// ³í³ö³àë³çàö³ÿ
		driver.get(baseUrl);
		return new StartPage(driver);

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void close() {
		if (this.driver != null)
			
		this.driver.quit();
		this.driver = null;
	}
}
