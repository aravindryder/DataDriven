package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed4 {
	
	public static WebDriver wd;

	@FindBy(name = "processCarrier")	
	private WebElement pro4;

	public Proceed4(WebDriver wd2) {
		this.wd=wd2;
		PageFactory.initElements(wd,this);
	}

	public WebElement getPro4() {
	return pro4;
	}

}
