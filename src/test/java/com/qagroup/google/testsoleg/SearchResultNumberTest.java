package com.qagroup.google.testsoleg;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qagroup.google.pageobject.Google;
import com.qagroup.google.pageobject.IWebApp;
import com.qagroup.google.pageobject.IWebAppTest;
import com.qagroup.google.pageobject.ResultPage;
import com.qagroup.google.pageobject.StartPage;

import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;

@Features("Search")
public class SearchResultNumberTest implements IWebAppTest {

	private StartPage startPage;
	WebElement keyboard;
	private ResultPage resultPage;
	private Google google = new Google();

	@BeforeMethod
	public void setUp() {
		startPage = google.openStartPage();

	}

	@Stories("Result Number Story")
	@Test(dataProvider = "dataProvider")
	public void test1(String query) {
		resultPage = startPage.searchFor(query);
		int numberOfResult = resultPage.getSearchResultNumber();

		Assert.assertEquals(numberOfResult, 10, "The number of found results is incorect:");

	}

	@DataProvider(name = "dataProvider")
	public Object[][] data() {
		return new Object[][] { { "Hello World!" }, { "911" }, { "Selenium ide" } };
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() {
		google.close();
	}

	public IWebApp getTestedApp() {
		return this.google;
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
