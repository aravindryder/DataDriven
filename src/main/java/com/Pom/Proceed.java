package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed {
	
	public static WebDriver wd;

	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement ced;

	public Proceed(WebDriver wd2) {
		this.wd = wd2;
		PageFactory.initElements(wd, this);
	}

	public WebElement getCed() {
		return ced;
	}
}
