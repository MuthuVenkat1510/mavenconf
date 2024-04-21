package org.pojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelLogin extends BaseClass {
	public HotelLogin() {
		PageFactory.initElements(driver, this);
	}

	@CacheLookup
	@FindBy(id = "username")
	private WebElement usrname;
	@FindBy(id = "password")
	private WebElement txtpass;
	@FindBy(id = "login")
	private WebElement btnlgn;
	@FindBy(xpath = "//select[@id='location']")
	private WebElement locationDropBox;
	@FindBy(xpath = "//select[@id='hotels']")
	private WebElement HotelDropBox;
	@FindBy(xpath = "//select[@id='room_type']")
	private WebElement roomTypeDropBox;
	@FindBy(xpath = "//select[@id='room_nos']")
	private WebElement roomNoDropBox;
	@FindBy(xpath = "//select[@id='adult_room']")
	private WebElement adultRoomNoDropBox;
	@FindBy(xpath = "//select[@id='child_room']")
	private WebElement ChildNoDropBox;
	@FindBy(xpath = "//input[@id='Submit']")
	private WebElement searchBtn;

	@FindBy(name = "radiobutton_0")
	private WebElement radioBtn;
	@FindBy(name = "continue")
	private WebElement cntbtn;

	@FindBy(name = "cc_type")
	private WebElement ccType;
	@FindBy(name = "cc_exp_month")
	private WebElement ccMnth;
	@FindBy(name = "cc_exp_year")
	private WebElement ccexpyear;
	
	@FindBy(name = "first_name")
	private WebElement firstName;
	@FindBy(name = "last_name")
	private WebElement lastName;
	@FindBy(name = "address")
	private WebElement address;
	@FindBy(name = "cc_num")
	private WebElement ccnum;
	@FindBy(name = "cc_cvv")
	private WebElement cccvv;
	
	@FindBy(name = "book_now")
	private WebElement bookBtn;
	@FindBy(name = "order_no")
	private WebElement orderNo;
	public WebElement getOrderNo() {
		return orderNo;
	}

	public WebElement getBookBtn() {
		return bookBtn;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcnum() {
		return ccnum;
	}

	public WebElement getCccvv() {
		return cccvv;
	}

	public WebElement getCcType() {
		return ccType;
	}

	public WebElement getCcMnth() {
		return ccMnth;
	}

	public WebElement getCcexpyear() {
		return ccexpyear;
	}

	public WebElement getCntbtn() {
		return cntbtn;
	}

	public WebElement getRadioBtn() {
		return radioBtn;
	}

	public WebElement getHotelDropBox() {
		return HotelDropBox;
	}

	public WebElement getRoomTypeDropBox() {
		return roomTypeDropBox;
	}

	public WebElement getRoomNoDropBox() {
		return roomNoDropBox;
	}

	public WebElement getAdultRoomNoDropBox() {
		return adultRoomNoDropBox;
	}

	public WebElement getChildNoDropBox() {
		return ChildNoDropBox;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public WebElement getLocationDropBox() {
		return locationDropBox;
	}

	public WebElement getUsrname() {
		return usrname;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getBtnlgn() {
		return btnlgn;
	}

}
