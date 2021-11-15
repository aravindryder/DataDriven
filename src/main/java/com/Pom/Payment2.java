package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment2 {
	
	public static WebDriver wd;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement pay1;

	public Payment2(WebDriver wd2) {
		this.wd = wd2;
		PageFactory.initElements(wd, this);
	}

	public WebElement getPay1() {
		return pay1;
	}
}