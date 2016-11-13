package com.qagroup.google.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StartPage {

	private WebDriver driver;

	public StartPage(WebDriver driver) {
		this.driver = driver;
	}

public ResultPage searchFor(String keywords){
	
	driver.findElement(By.cssSelector("#lst-ib")).sendKeys(keywords);
	driver.findElement(By.cssSelector(".lsb"));

return new ResultPage(driver);
}
}