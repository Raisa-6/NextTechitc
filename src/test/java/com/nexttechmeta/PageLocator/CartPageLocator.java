package com.nexttechmeta.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Base_Parent;

public class CartPageLocator extends Base_Parent {

	
	public CartPageLocator() {//land
		PageFactory.initElements(driver, this);//factory
		
	}
	@FindBy(xpath="//td[text()='Nokia lumia 1520']")
	public WebElement VerifyCart;
}
