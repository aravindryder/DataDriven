package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SizeSelection {
	
	public static WebDriver wd;

	@FindBy(id = "group_1")
	private WebElement size;

	public SizeSelection(WebDriver wd2) {
		this.wd = wd2;
		PageFactory.initElements(wd, this);
	}

	public WebElement getSize() {
		return size;
	}
}
