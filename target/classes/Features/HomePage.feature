Feature: HomePage
@homePage
Scenario: Validate Search Option is working

Given User is on Retail Website
When User type 'iphone' on searchbar
And User click on search icon
Then User should see available iphones
