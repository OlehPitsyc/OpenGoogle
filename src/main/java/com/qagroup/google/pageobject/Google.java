package com.qagroup.google.pageobject;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import javax.management.RuntimeErrorException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import ru.yandex.qatools.allure.annotations.Step;

public class Google implements IWebApp {
	private WebDriver driver;
	private static final String baseUrl = "https://www.google.com.ua/";

	@Step("Open google start page: " + baseUrl)
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

	public File makeScreenshot() {
		return TakesScreenshot.class.cast(this.driver).getScreenshotAs(OutputType.FILE);
//		File screenPng = new File("assets/screenshot" + LocalDateTime.now().getSecond() + ".png");
//		try {
//			FileUtils.copyFile(screen, screenPng);
//		} catch (IOException e) {
//			throw new RuntimeException(e);
//		}
//		return screenPng;
	}
}
