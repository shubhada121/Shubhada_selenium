package com.ShoppersStack_testScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.ShoppersStack.genericUtility.Base_Test;
import com.ShoppersStack.pom.AddressForm_Page;
import com.ShoppersStack.pom.MyAddress_Page;
import com.ShoppersStack.pom.Myprofile_Page;

public class Verify_user_is_able_to_update_address_or_not_Test extends Base_Test
{
	@Test
	public void updateAdress() throws EncryptedDocumentException, IOException, InterruptedException {
		homePage.getAccountSettingBtn().click();
		homePage.getMyProfileBtn().click();
		
		Myprofile_Page  myProfile = new Myprofile_Page(driver);
		myProfile.getMyAddressBtn().click();
		
		MyAddress_Page myAddress = new MyAddress_Page(driver);
		myAddress.getEditBtn().click();
		
		AddressForm_Page  addressForm = new AddressForm_Page(driver);
		addressForm.getNameTF().clear();
		addressForm.getNameTF().sendKeys("ShubhadaS");
		Thread.sleep(2000);
		
		
		

	}

}
