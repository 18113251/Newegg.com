Feature: To Validate the login Functionality
Scenario: Validate the login functionality with valid username and valid password
Given user should launch chrome and load the page url
When user should click the Account button
And user should pass valid username and valid password
And user should click the login button
Then user should logout the Account


Scenario: Validate the user with Invalid email id
Given user should launch the chrome and load the url
When User should click the Account button
When user should give invalid emaild
And User should click the sign in button
And user should get invalid emailid error
Then user should close the browser


