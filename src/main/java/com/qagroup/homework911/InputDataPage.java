package com.qagroup.homework911;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InputDataPage {

	private WebDriver driver;

	@FindBy(xpath = "//*[@id='K57']")
	private WebElement numberNine;

	@FindBy(id = "K49")
	private WebElement numberOne;

	public InputDataPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public ResultPage inputDataInSearch() {
		numberNine.click();
//		for (int i = 0; i < 2; i++) {
//			numberOne.click();
//		}
		return new ResultPage(driver);
	}
}