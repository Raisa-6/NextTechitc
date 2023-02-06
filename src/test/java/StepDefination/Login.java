package StepDefination;

import com.nexttechmeta.PageAction.AccountPageAction;
import com.nexttechmeta.PageAction.HomePageAction;
import com.nexttechmeta.PageAction.LoginPageAction;

import Utility.Base_Parent;
import Utility.MetaUtility;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Login extends Base_Parent {
	
HomePageAction homePageAction=new HomePageAction();
LoginPageAction loginPageAction=new LoginPageAction();
AccountPageAction accountPageAction=new AccountPageAction();
	
	@Given("^MetaLaunch \"([^\"]*)\"$")
	public void metalaunch(String URL) throws Throwable {
		metaLaunchURL(URL);
	}
	@Then("^Click Login Link$")
	public void click_Login_Link() throws Throwable {
	homePageAction.ClickLoginLink();
	    
	}

	@Then("^Enter Username and Enter Password and Click Login button$")
	public void enter_Username_and_Enter_Password_and_Click_Login_button() throws Throwable {
	loginPageAction.metaLoginCred(metaprop.getProperty("UserName"), metaprop.getProperty("password"));
	    
	}

	@Then("^Verify user can login in with valid credentials$")
	public void verify_user_can_login_in_with_valid_credentials() throws Throwable {
	accountPageAction.Verifyusercanlogininwithvalidcredentials();
	MetaUtility.takeMyScreenshot(driver,"Account Profile Page");
	    
	}


}
