package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Terms {
	
	public static WebDriver wd;

	@FindBy(id = "cgv")	
	private WebElement con;

	public Terms(WebDriver wd2) {
		this.wd=wd2;
		PageFactory.initElements(wd,this);
	}

	public WebElement getCon() {
	return con;
	}
}