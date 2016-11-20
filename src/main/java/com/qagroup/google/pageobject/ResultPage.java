package com.qagroup.google.pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.annotations.Step;

public class ResultPage {

	private WebDriver driver;

	public ResultPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

	@FindBy(css = ".g")
	private List<WebElement> resultsList;

	@Attachment("Search result number")
	@Step("Calculate the result number ")
	public int getSearchResultNumber() {
		return resultsList.size();
	}
}
