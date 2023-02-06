package com.nexttechmeta.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Base_Parent;

public class HomePageLocator extends Base_Parent{

	
public HomePageLocator() {//land
	PageFactory.initElements(driver, this);//factory
	
}
@FindBy(id="login2")
public WebElement LoginLink;

@FindBy(xpath="//a[text()='Nokia lumia 1520']")
public WebElement NokiaPhone;

@FindBy(xpath="//a[text()='Add to cart']")
public WebElement AddToCart;
	
@FindBy(xpath="//a[text()='Cart']")
public WebElement CartLink;	
	
	
	
	
	
	
}
