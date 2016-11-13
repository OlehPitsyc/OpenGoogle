package com.qagroup.google.testsoleg;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qagroup.google.pageobject.Google;
import com.qagroup.google.pageobject.ResultPage;
import com.qagroup.google.pageobject.StartPage;

public class SearchResultNumberTest {
	private WebDriver driver;
	private StartPage startPage;
	WebElement keyboard;
	private ResultPage resultPage;
	private Google google = new Google();

	@BeforeClass
	public void setUp() {
		startPage = google.openStartPage();

		
	}

	@Test
	public void test1() {
		resultPage = startPage.searchFor("Hello world!");
		// driver.findElement(By.cssSelector("#lst-ib")).sendKeys("Hello
		// world!");
		// driver.findElement(By.cssSelector(".lsb"));
		// driver.findElement(By.cssSelector(".g"));
		// List<WebElement> resultsList =
		// driver.findElements(By.cssSelector(".g"));
		int numberOfResult = resultPage.getSearchResultNumber();
		Assert.assertEquals(numberOfResult, 10);

	}

	@AfterClass(alwaysRun = true)
	public void tearDown() {
//		if (driver != null)
//		driver.quit();
		google.close();
	}

	// @Test
	// public void test2() {
	// driver.get(baseUrl);
	// driver.findElement(By.cssSelector("#gs_st0")).click();
	// keyboard = driver.findElement(By.cssSelector("#kbd"));
	// Assert.assertTrue(keyboard.isDisplayed());
	// }

	// @Test(priority = 1)
	// public void testClosedKeyBoard() {
	// driver.get(baseUrl);
	// WebElement keyboardClosed =
	// keyboard.findElement(By.cssSelector(".vk-t-btn"));
	// keyboardClosed.click();
	//
	// driver.findElement(By.cssSelector("#gs_st0")).click(); WebElement
	// keyboard = driver.findElement(By.cssSelector("#kbd"));
	// driver.findElement(By.xpath("//div[@class='vk-t-btn vk-sf-cl']")).
	// click();
	//
	// Assert.assertFalse(keyboard.isDisplayed());
	// Assert.assertTrue(keyboard.isEnabled());
}
