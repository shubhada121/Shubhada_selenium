package com.ShoppersStack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAddress_Page 
{
	public MyAddress_Page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath="//button[text()='Add Address']")
	
	private WebElement addAddressBtn;
	
	
	
	public WebElement getAddAddressBtn() {
		return addAddressBtn;
	}
	
	@FindBy(xpath="(//button[@type='button'])[4]")
	private WebElement deleteBtn;
	
	@FindBy(xpath = "//button[text()='Yes']")
	private WebElement yesBtn;

	public WebElement getDeleteBtn() {
		return deleteBtn;
	}

	public WebElement getYesBtn() {
		return yesBtn;
	}
	
	@FindBy(xpath="(//button[@type='button'])[3]")
	private WebElement editBtn;

	public WebElement getEditBtn() {
		return editBtn;
	}
	
	

}
