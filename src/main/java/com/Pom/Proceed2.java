package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed2 {
	
	public static WebDriver wd;

	@FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")	
	private WebElement ceed;

	public Proceed2(WebDriver wd2) {
		this.wd = wd2;
		PageFactory.initElements(wd, this);
	}

	public WebElement getCeed() {
		return ceed;
	}

}
