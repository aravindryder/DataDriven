package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Women {
	
	public static WebDriver wd;
	
	@FindBy(linkText = "Women")
	private WebElement women;
	
	

	public Women(WebDriver wd2) {
		this.wd = wd2;
		PageFactory.initElements(wd, this);
	}

	public WebElement getWomen() {
		return women;
	}
}