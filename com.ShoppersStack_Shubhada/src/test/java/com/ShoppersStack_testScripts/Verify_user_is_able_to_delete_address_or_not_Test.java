package com.ShoppersStack_testScripts;

import org.testng.annotations.Test;

import com.ShoppersStack.genericUtility.Base_Test;
import com.ShoppersStack.pom.MyAddress_Page;
import com.ShoppersStack.pom.Myprofile_Page;

public class Verify_user_is_able_to_delete_address_or_not_Test extends Base_Test
{

	@Test
	public void addAdress() throws  InterruptedException 
	{
		homePage.getAccountSettingBtn().click();
		homePage.getMyProfileBtn().click();
		
		Myprofile_Page  myProfile = new Myprofile_Page(driver);
		myProfile.getMyAddressBtn().click();
		
		MyAddress_Page myAddress = new MyAddress_Page(driver);
		Thread.sleep(2000);
		myAddress.getDeleteBtn().click();
		Thread.sleep(2000);

		myAddress.getYesBtn().click();
		Thread.sleep(2000);

		driver.switchTo().alert().accept();
		Thread.sleep(2000);
}
}