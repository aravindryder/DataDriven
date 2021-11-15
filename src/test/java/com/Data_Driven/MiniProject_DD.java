package com.Data_Driven;

import org.openqa.selenium.WebDriver;

import com.BaseClass.Base_Class;
import com.SDP.Singleton;

public class MiniProject_DD extends Base_Class {

	public static WebDriver wd = Base_Class.Browser("chrome");
	
	public static Singleton sdp = new Singleton(wd);
	
	public static void main(String[] args) throws Throwable {

		String url = excel_particular_Data("Mini Project in Test Cases.xlsx", 0, 1, 5);
		Get_URL(url);
		Scroll_Down();
		snap("photo.png");
		sleep(5000);
		
		click(sdp.getHp().getSignbtn());
		snap("photo1.png");
		sleep(5000);
		
		String username = excel_particular_Data("Mini Project in Test Cases.xlsx", 0, 3, 5);
		Pass(sdp.getL().getUsername(), username);
		implicity();
		String password = excel_particular_Data("Mini Project in Test Cases.xlsx", 0, 8, 5);
		Pass(sdp.getL().getPassword(), password);
		implicity();
		click(sdp.getL().getLogin());
		sleep(2000);
		snap("photo2.png");
		sleep(5000);
		
		click(sdp.getW().getWomen());
		Scroll_Down();
		sleep(2000);
		snap("photo3.png");
		sleep(5000);
		
		click(sdp.getP().getPd());
		sleep(2000);
		snap("photo4.png");
		sleep(5000);
		
		click(sdp.getCart().getAc());
		sleep(2000);
		snap("photo5.png");
		sleep(5000);
		
		click(sdp.getProc().getCed());
		Scroll_Down();
		sleep(2000);
		snap("photo6.png");
		sleep(5000);
		
		click(sdp.getPro().getCeed());
		Scroll_Down();
		sleep(2000);
		snap("photo7.png");
		sleep(5000);
		
		click(sdp.getPro3().getPro3());
		Scroll_Down();
		sleep(2000);
		snap("photo8.png");
		sleep(5000);

		click(sdp.getT().getCon());
		Scroll_Down();
		sleep(2000);
		snap("photo9.png");
		sleep(5000);

		click(sdp.getPro4().getPro4());
		Scroll_Down();
		sleep(2000);
		snap("photo10.png");
		sleep(5000);

		click(sdp.getPay().getPay());
		Scroll_Down();
		sleep(2000);
		snap("photo11.png");
		sleep(5000);

		click(sdp.getPay2().getPay1());
		Scroll_Down();
		sleep(2000);
		snap("photo12.png");
		sleep(5000);
		
		sleep(3000);
		quit();
	}
}