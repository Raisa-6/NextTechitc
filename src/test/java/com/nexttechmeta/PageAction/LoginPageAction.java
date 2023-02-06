package com.nexttechmeta.PageAction;

import com.nexttechmeta.PageLocator.LoginPageLocator;

import Utility.Base_Parent;

public class LoginPageAction extends Base_Parent {
	
LoginPageLocator loginPageLocator=new LoginPageLocator();
	
public void metaLoginCred(String u,String p) {

loginPageLocator.UserName.sendKeys(u);	
loginPageLocator.PassWord.sendKeys(p);
loginPageLocator.LoginButton.click();
	
	
	
	
	
	
}

}
