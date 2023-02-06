package com.nexttechmeta.PageAction;

import org.testng.Assert;

import com.nexttechmeta.PageLocator.CartPageLocator;

import Utility.Base_Parent;

public class CartPageAction extends Base_Parent {
	
CartPageLocator cartPageLocator=new CartPageLocator();
	
public void Verifyitemaddedincart() throws Exception {
	
Thread.sleep(4000);
	
boolean verifyCart= cartPageLocator.VerifyCart.isDisplayed();
Assert.assertTrue(verifyCart);
	
}

}
