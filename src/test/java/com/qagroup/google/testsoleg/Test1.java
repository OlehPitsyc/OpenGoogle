package com.qagroup.google.testsoleg;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test1 {
	private WebDriver driver;// декларування
	private String baseUrl;

	@BeforeClass(alwaysRun = true)
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		driver = new FirefoxDriver();// ініціалізація
		baseUrl = "https://www.google.com.ua/";
		// Will wait fir an element to appear for 30 seconds
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void test1() {
		driver.get(baseUrl + "/");
		driver.findElement(By.xpath("//"));
		driver.findElement(By.id("lst-ib")).clear();
		driver.findElement(By.id("lst-ib")).sendKeys("selenium ide");
		driver.findElement(By.name("btnG")).click();
		driver.findElement(By.linkText("Selenium IDE Plugins")).click();
		driver.findElement(By.linkText("Download")).click();
		assertEquals(driver.getTitle(), "Downloads");
	}

	@Test

//	public void testInDomainLanguage() {
//		google.openStartPage().search("Selenium IDE").selectResult("Selenium IDE Plugins").navigateToDownloadPage();
//	}
//	
	

	@AfterClass(alwaysRun = true)
	public void tearDown() {
		driver.quit();
	}
}
