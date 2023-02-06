package com.nexttechmeta.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Base_Parent;

public class AccountPageLocator extends Base_Parent {
	
	public AccountPageLocator() {//land
		PageFactory.initElements(driver, this);//factory
		
	}

@FindBy(id="nameofuser")
public WebElement AccountProfile;	

}
