package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	public static WebDriver wd;
	
	@FindBy(id = "email")
	private WebElement username;
	
	@FindBy(name = "passwd")
	private WebElement password;
	
	@FindBy(xpath = "(//button[@type='submit'])[3]")
	private WebElement login;

	public Login(WebDriver wd2) {
		this.wd = wd2;
		PageFactory.initElements(wd, this);

	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
}
