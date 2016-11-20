package com.qagroup.homework911;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage {

	private WebDriver driver;

	@FindBy(name = "btnG")
	private WebElement searchButton;

	@FindBy(id = "lst-ib")
	private WebElement inputField;

	public ResultPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void serachResultPage() {
		searchButton.click();
	}

	public String getTextFromIput() {
		return inputField.getText();
	}
}
