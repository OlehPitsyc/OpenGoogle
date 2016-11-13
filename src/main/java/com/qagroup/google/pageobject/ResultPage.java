package com.qagroup.google.pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultPage {

	private WebDriver driver;
	public ResultPage(WebDriver driver){
		this.driver=driver;
	}
	public int getSearchResultNumber(){
		List<WebElement> resultsList = driver.findElements(By.cssSelector(".g"));
		return resultsList.size();
	}
}
