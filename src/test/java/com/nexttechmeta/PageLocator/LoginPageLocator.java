package com.nexttechmeta.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Base_Parent;

public class LoginPageLocator extends Base_Parent {
public LoginPageLocator() {//land
		PageFactory.initElements(driver, this);//factory
		
	}

@FindBy(id="loginusername")
public WebElement UserName;

@FindBy(id="loginpassword")
public WebElement PassWord;

@FindBy(xpath="//button[text()='Log in']")
public WebElement LoginButton;












}
