Feature: This Feature is for cart functionality

@HH
Scenario: Verify item in Cart 
Given Launch Url(Demoblaze)
When Click Samsung Phone
Then Click Add to cart
Then Verify item in Cart

@YY
Scenario: Verify New text message is displayed in Contact Page
Given Launch Url(DemoBlaze)
Then Click Contact Link
Then Verify New text message is displayed in Contact Page

