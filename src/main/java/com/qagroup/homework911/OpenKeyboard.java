package com.qagroup.homework911;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenKeyboard {

	private WebDriver driver;

	@FindBy(id = "gs_ok0")
	private WebElement keyBoardIcon;

	@FindBy(id = "kbd")
	private WebElement keyBoardApp;

	@FindBy(id = "K57")
	private WebElement numberNine;

	@FindBy(id = "K49")
	private WebElement numberOne;

	public OpenKeyboard(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

	public ResultPage findAndOpenKeyboar() {
		keyBoardIcon.click();
		numberNine.click();
		for (int i = 0; i < 2; i++) {
			numberOne.click();
		}
		return new ResultPage(driver);
	}

	// public void inputDataInSearch() {
	// numberNine.click();
	// for (int i = 0; i < 2; i++) {
	// numberOne.click();
	// }
	// }
}