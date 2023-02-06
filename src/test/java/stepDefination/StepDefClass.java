package stepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefClass {
WebDriver driver;// global
@Given("^Launch Url\\(Demoblaze\\)$")
public void launch_Url_Demoblaze() throws Throwable {
	//local
	System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");	
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoblaze.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	driver.manage().deleteAllCookies();	
	
	}

	@When("^Click Samsung Phone$")
	public void click_Samsung_Phone() throws Throwable {
	WebElement Samsung=driver.findElement(By.linkText("Samsung galaxy s6"));
	 Samsung.click();    
	}

	@Then("^Click Add to cart$")
	public void click_Add_to_cart() throws Throwable {
	WebElement AddToCart=driver.findElement(By.linkText("Add to cart"));
	AddToCart.click();
	Thread.sleep(10000);
	driver.switchTo().alert().accept();    
	}

	@Then("^Verify item in Cart$")
	public void verify_item_in_Cart() throws Throwable {
	WebElement Cart=driver.findElement(By.linkText("Cart"));
	Cart.click();
	boolean result=driver.findElement(By.xpath("//td[text()='Samsung galaxy s6']")).isDisplayed();
	Assert.assertTrue(result);		
	 driver.quit();   
	}
	@Given("^Launch Url\\(DemoBlaze\\)$")
	public void launch_Url_DemoBlaze() throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");	
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoblaze.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	driver.manage().deleteAllCookies();    
	}
	@Then("^Click Contact Link$")
	public void click_Contact_Link() throws Throwable {
	WebElement ContactLink=driver.findElement(By.linkText("Contact"));
	ContactLink.click();
	
	}

	@Then("^Verify New text message is displayed in Contact Page$")
	public void verify_New_text_message_is_displayed_in_Contact_Page() throws Throwable {
	Thread.sleep(10000);
	boolean NewMessage=driver.findElement(By.id("exampleModalLabel")).isDisplayed();
	Assert.assertTrue(NewMessage);
	driver.close();
	}
	
	
}	

