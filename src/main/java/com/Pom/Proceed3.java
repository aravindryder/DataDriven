package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed3 {

	public static WebDriver wd;

	@FindBy(xpath = "(//button[@type='submit'])[2]")	
	private WebElement pro3;

	public Proceed3(WebDriver wd2) {
		this.wd=wd2;
		PageFactory.initElements(wd,this);
	}

	public WebElement getPro3() {
	return pro3;
	}
}