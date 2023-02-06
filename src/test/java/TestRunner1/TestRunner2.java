package TestRunner1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Utility.Base_Parent;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//Cucumber options
@CucumberOptions(features = {"src/test/resources/Feature_Files"},
plugin = {"json:target/cucumber.json"},
glue = "StepDefination",tags= {"@cart"})
public class TestRunner2 extends AbstractTestNGCucumberTests {

@BeforeTest
public void metasetup() {
	Base_Parent test = new Base_Parent();
	test.metabrowserinit();
	
}
@AfterTest
public void metaCloseURL() {
	Base_Parent test = new Base_Parent();
	test.driver.quit();
	
	
}
	
	
	
	
}
