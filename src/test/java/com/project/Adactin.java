package com.project;

import javax.swing.JList.DropLocation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.AdactinPom.AdactinPom;

public class Adactin extends Baseclass {
	
	public static void main(String[] args) {
		
		
		
		launchbrowser("chrome");
		get("https://adactinhotelapp.com/");
		Gettitle();
		AdactinPom t=new AdactinPom(driver);
		Sendkeys(t.getU_name(),"Lavilaya");
		Sendkeys(t.getPass(), "Lavi@123");
		
		click(t.getLogin());
		
		dropdown(t.getLocation(), "text", "London");
		dropdown(t.getHotels(), "text", "Hotel Sunshine");
		dropdown(t.getRoom(), "text", "Super Deluxe");
		dropdown(t.getRoom_num(), "value", "1");
		clear(t.getDatepic());
		Sendkeys(t.getDatepic(), "29/12/2021");
		clear(t.getDateout());
		Sendkeys(t.getDateout(), "02/01/2022");
		dropdown(t.getAdult(), "value", "2");
		click(t.getSearch());
		click(t.getRadio());
		click(t.getC());
		
		Sendkeys(t.getF_name(), "Lavanya");
		Sendkeys(t.getL_name(), "Laya");
		Sendkeys(t.getAddress(), "No 6, Ramalinga jothi nagar,coimbatore");
		Sendkeys(t.getCredit(), "1234567891012134");
		Wait(5);
		
		//dropdown(t.getCctype(), "value", "AMEX");
		//WebElement f4=driver.findElement(By.id("cc_type"));
		//f4.click();
		dropdown(t.getCctype(), "text", "American Express");
		
		dropdown(t.getCcmonth(), "text", "February");
		dropdown(t.getCcyear(), "text", "2022");
		Sendkeys(t.getCvv(), "981");
		click(t.getBook());
		
		click(t.getIti());
		click(t.getLout());
		
		
	
		
	}
	

}
