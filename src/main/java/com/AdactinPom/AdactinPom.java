package com.AdactinPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinPom {
	
	public static WebDriver driver;

	@FindBy(id="username")
	private WebElement u_name;
	
	@FindBy(id="password")
	private WebElement pass;
	
	@FindBy(id="login")
	private WebElement login;
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotels;
	

	@FindBy(id="room_type")
	private WebElement room;
	
	@FindBy(id="room_nos")
	private WebElement room_num;
	
	
	@FindBy(id="datepick_in")
	private WebElement datepic;
	
	@FindBy(id="datepick_out")
	private WebElement dateout;
	
	@FindBy(id="adult_room")
	private WebElement adult;
	
	@FindBy(id="Submit")
	private WebElement search;
	
	@FindBy(id="radiobutton_0")
	private WebElement radio;
	
	@FindBy(id="continue")
	private WebElement c;
	
	@FindBy(id="first_name")
	private WebElement f_name;
	
	

	@FindBy(id="last_name")
	private WebElement l_name;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement credit;
	
	@FindBy(id="cc_type")
	private WebElement cctype;
	
	

	@FindBy(id="cc_exp_month")
	private WebElement ccmonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement ccyear;

	
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	
	@FindBy(id="book_now")
	private WebElement book;
	
	@FindBy(id="my_itinerary")
	private WebElement iti;
	

@FindBy(id="logout")
private WebElement lout;

	

	public static WebDriver getDriver() {
		return driver;
	}

	public AdactinPom(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
		
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getU_name() {
		return u_name;
	}

	public WebElement getPass() {
		return pass;
	}
	
	public WebElement getLocation() {
		return location;
	}
	

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getRoom_num() {
		return room_num;
	}
	
	public WebElement getDatepic() {
		return datepic;
	}

	public WebElement getDateout() {
		return dateout;
	}

	public WebElement getAdult() {
		return adult;
	}
	public WebElement getSearch() {
		return search;
	}
	public WebElement getRadio() {
		return radio;
	}

	public WebElement getC() {
		return c;
	}
	
	public WebElement getF_name() {
		return f_name;
	}

	public WebElement getL_name() {
		return l_name;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCredit() {
		return credit;
	}
    
	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getCcmonth() {
		return ccmonth;
	}

	public WebElement getCcyear() {
		return ccyear;
	}
	

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook() {
		return book;
	}
	
	public WebElement getIti() {
		return iti;
	}

	public WebElement getLout() {
		return lout;
	}
	
	
}
