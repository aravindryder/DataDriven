package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {
	
	public static WebDriver wd;
	
	@FindBy(xpath = "//a[@class='bankwire']")
	private WebElement pay;

	public Payment(WebDriver wd2) {
		this.wd = wd2;
		PageFactory.initElements(wd, this);
	}

	public WebElement getPay() {
		return pay;
	}

}
