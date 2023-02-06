package com.nexttechmeta.PageAction;

import org.testng.Assert;

import com.nexttechmeta.PageLocator.AccountPageLocator;

import Utility.Base_Parent;

public class AccountPageAction extends Base_Parent {
	
AccountPageLocator accountPageLocator=new AccountPageLocator();
	
public void Verifyusercanlogininwithvalidcredentials() throws Exception {
	
Thread.sleep(5000);
	
boolean verifyAccountProfile= accountPageLocator.AccountProfile.isDisplayed();
Assert.assertTrue(verifyAccountProfile);
	
}

}
