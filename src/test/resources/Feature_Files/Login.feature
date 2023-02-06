Feature: This feature is for login functionality


@cart
Scenario:Verify user can login in with valid credentials
Given MetaLaunch "<URL>"
Then Click Login Link
Then Enter Username and Enter Password and Click Login button
Then Verify user can login in with valid credentials

