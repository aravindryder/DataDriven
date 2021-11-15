package com.SDP;

import org.openqa.selenium.WebDriver;

import com.Pom.AddToCart;
import com.Pom.HomePage;
import com.Pom.Login;
import com.Pom.Payment;
import com.Pom.Payment2;
import com.Pom.PrintDresses;
import com.Pom.Proceed;
import com.Pom.Proceed2;
import com.Pom.Proceed3;
import com.Pom.Proceed4;
import com.Pom.Terms;
import com.Pom.Women;

public class Singleton {
	
	public WebDriver wd;
	
	private HomePage hp;
	
	private Login l;		
	
	private Women w;
	
	private PrintDresses p;
	
	private AddToCart cart;
	
	private Proceed proc;
	
	private Proceed2 pro;
	
	private Proceed3 pro3;
	
	private Terms t;
	
	private Proceed4 pro4;
	
	private Payment pay;
	
	private Payment2 pay2;
	

	public Singleton(WebDriver wd2) {
		this.wd = wd2;
	}

	public HomePage getHp() {
	
		hp = new HomePage(wd);
		return hp;
	}

	public Login getL() {
		l = new Login(wd);	
		return l;
	}

	public Women getW() {
		w = new Women(wd);
		return w;
	}

	public PrintDresses getP() {
		p = new PrintDresses(wd);
		return p;
	}

	public AddToCart getCart() {
		cart = new AddToCart(wd);
		return cart;
	}

	public Proceed getProc() {
		proc = new Proceed(wd);
		return proc;
	}

	public Proceed2 getPro() {
		pro = new Proceed2(wd);
		return pro;
	}
	
	public Proceed3 getPro3() {
		pro3 = new Proceed3(wd);
		return pro3;
	}

	public Terms getT() {
		t = new Terms(wd);
		return t;
	}

	public Proceed4 getPro4() {
		pro4 = new Proceed4(wd);
		return pro4;
	}

	public Payment getPay() {
		pay = new Payment(wd);
		return pay;
	}

	public Payment2 getPay2() {
		pay2 = new Payment2(wd);
		return pay2;
	}
}