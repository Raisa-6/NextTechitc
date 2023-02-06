package com.cucumber.example.com.cucumber.example;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//Cucumber options
@CucumberOptions(features = {"src/test/resources/FeatureFile"},
plugin = {"json:target/cucumber.json"},
glue = "stepDefination",tags= {"@YY"})
public class TestrunnerClass extends AbstractTestNGCucumberTests {

}
//Tag is for run specific test cases