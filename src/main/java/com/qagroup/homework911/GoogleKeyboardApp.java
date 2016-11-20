package com.qagroup.homework911;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qagroup.google.pageobject.StartPage;

import ru.yandex.qatools.allure.annotations.Step;

public class GoogleKeyboardApp {
	
		private WebDriver driver;
		private static final String baseUrl = "https://www.google.com.ua/";

		@Step("Open google start page: " + baseUrl)
		public OpenKeyboard openStartPage() {
			String pathSeparator = File.separator;
			String pathToDriver = "assets" + pathSeparator + "webdriver" + pathSeparator + "geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", pathToDriver);
			driver = new FirefoxDriver();
			driver.get(baseUrl);
			return new OpenKeyboard (driver);

		}

		public void close() {
			if (this.driver != null)

				this.driver.quit();
			this.driver = null;
		}

	}

