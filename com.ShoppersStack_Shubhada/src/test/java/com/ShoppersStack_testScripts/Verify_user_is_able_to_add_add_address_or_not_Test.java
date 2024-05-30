package com.ShoppersStack_testScripts;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.apache.commons.codec.binary.Base32;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.ShoppersStack.genericUtility.Base_Test;
import com.ShoppersStack.genericUtility.WebDriver_Utitlity;
import com.ShoppersStack.pom.AddressForm_Page;
import com.ShoppersStack.pom.Home_Page;
import com.ShoppersStack.pom.MyAddress_Page;
import com.ShoppersStack.pom.Myprofile_Page;

public class Verify_user_is_able_to_add_add_address_or_not_Test extends Base_Test
{
	
		@Test
		public void addAdress() throws EncryptedDocumentException, IOException
		{
			homePage.getAccountSettingBtn().click();
			homePage.getMyProfileBtn().click();
			
			Myprofile_Page  myProfile = new Myprofile_Page(driver);
			myProfile.getMyAddressBtn().click();
			
			MyAddress_Page myAddress = new MyAddress_Page(driver);
			myAddress.getAddAddressBtn().click();
			
			AddressForm_Page  addressForm = new AddressForm_Page(driver);
			addressForm.getNameTF().sendKeys(file.readExcelData("Sheet1", 1, 0));
			addressForm.getHouseTF().sendKeys(file.readExcelData("Sheet1", 1, 1));
			addressForm.getStreetTF().sendKeys(file.readExcelData("Sheet1", 1, 2));
			addressForm.getLandmarkTF().sendKeys(file.readExcelData("Sheet1", 1, 3));
			WebDriver_Utitlity.selectByValue(addressForm.getCountryDD(), file.readPropertyData("country"));
			WebDriver_Utitlity.selectByValue(addressForm.getStateDD(), file.readPropertyData("state"));
			WebDriver_Utitlity.selectByValue(addressForm.getCityDD(),file.readPropertyData("city"));
	
			
			addressForm.getPincodeTF().sendKeys(file.readExcelData("Sheet1", 1, 4));
			addressForm.getPhoneNumberTF().sendKeys(file.readExcelData("Sheet1", 1, 5));
			addressForm.getAddAdreessBtn().click();
			

	}

}
