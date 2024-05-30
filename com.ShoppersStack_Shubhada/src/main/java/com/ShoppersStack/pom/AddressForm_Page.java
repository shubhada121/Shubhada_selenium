package com.ShoppersStack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressForm_Page 
{
	public AddressForm_Page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="Name")
	private WebElement nameTF;
	
	
	
	@FindBy(id="House/Office Info")
	private WebElement houseTF;
	
	
	@FindBy(id="Street Info")
	private WebElement streetTF;
	
	
	@FindBy(id="Landmark")
	private WebElement landmarkTF;
	
	@FindBy(id="Country")
	private WebElement countryDD;
	
	
	
	@FindBy(id="State")
	private WebElement stateDD;
	
	
	
	
	@FindBy(id="City")
	private WebElement cityDD;
	
	
	@FindBy(id="Pincode")
	private WebElement pincodeTF;
	
	
	@FindBy(id="Phone Number")
	private WebElement phoneNumberTF;
	
	@FindBy(id="addAddress")
	private WebElement addAdreessBtn;

	
	public WebElement getNameTF() {
		return nameTF;
	}

	public WebElement getHouseTF() {
		return houseTF;
	}

	public WebElement getStreetTF() {
		return streetTF;
	}

	public WebElement getLandmarkTF() {
		return landmarkTF;
	}

	public WebElement getCountryDD() {
		return countryDD;
	}

	public WebElement getStateDD() {
		return stateDD;
	}

	public WebElement getCityDD() {
		return cityDD;
	}

	public WebElement getPincodeTF() {
		return pincodeTF;
	}

	public WebElement getPhoneNumberTF() {
		return phoneNumberTF;
	}

	public WebElement getAddAdreessBtn() {
		return addAdreessBtn;
	}
	
	@FindBy(id ="Update Address")
	private WebElement updateAdressBtn;

	public WebElement getUpdateAdressBtn() {
		return updateAdressBtn;
	}
	
	
}
