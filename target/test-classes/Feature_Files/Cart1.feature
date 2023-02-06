Feature: This feature is for cart functionality

@cart
Scenario: Verify item added in cart
Given MetaLaunch "<URL>"
Then Click Nokia lumia
Then Click add to cart
Then Click click cart
Then Verify item added in cart