package com.ShoppersStack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page 
{

	public Home_Page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[contains(@class,'BaseBadge-badge MuiBadge-badge MuiBadge-standard ')]")
	private WebElement accountSettingBtn;
	
	
	@FindBy(xpath="//li[text()='My Profile']")
	
	private WebElement myProfileBtn;
	
	
	public WebElement getAccountSettingBtn() {
		return accountSettingBtn;
	}


	public WebElement getMyProfileBtn() {
		return myProfileBtn;
	}


	public WebElement getLogoutBtn() {
		return logoutBtn;
	}

	@FindBy(xpath="//li[text()='Logout']")
	private WebElement logoutBtn;
}
