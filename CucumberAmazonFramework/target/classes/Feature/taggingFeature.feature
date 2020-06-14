Feature: Test tagging functionality

@RegressionTest @SmokeTest
Scenario: Verify the login with correct credentials
Given user is on login screen
When user enters username and password
Then user clicks on login button

@RegressionTest @SmokeTest
Scenario: Verify the login with correct credentials
Given user is on login screen
When user enters username and password
Then user clicks on login button


@RegressionTest @SmokeTest
Scenario: Verify homeScreenTitle functionality
Given user is on login screen
When user enters username and password
Then user clicks on login button
Then user verifies the homeScreen

@RegressionTest
Scenario: Verify adding items to the cart
Given user is on login screen
When user enters username and password
Then user clicks on login button
Then user searches an item
Then user selects the searched item
And adds the item to cart


@RegressionTest
Scenario: Verify deleting items to the cart
Given user is on login screen
When user enters username and password
Then user clicks on login button
Then user searches an item
Then user selects the searched item
And adds the item to cart
Then user verifies the item added to cart
And deletes the added item


@RegressionTest
Scenario: Verify user is able to make payment
Given user is on login screen
When user enters username and password
Then user clicks on login button
Then user searches an item
Then user selects the searched item
And adds the item to cart
Then user makes the payment
And user receives the success message

@RegressionTest @SmokeTest
Scenario: Verify logout functionality
Given user is on login screen
When user enters username and password
Then user clicks on login button
Then user verifies the home screen
Then user logs out from the application

@SmokeTest @E2E
Scenario: Verify ForgotPassword functionality
Given user is on login screen
When user clicks ForgotPassword link
Then user navigates to ForgotPassword screen
Then user enters the email id
Then user gets the success message

@SmokeTest
Scenario: Verify ChangePassword functionality
Given user is on login screen
When user clicks ChangePassword link
Then user navigates to ChangePassword screen
Then user enters the email id
Then user gets the success message

@RegressionTest
Scenario: Verify search item functionality
Given user is on login screen
When user enters username and password
Then user clicks on login button
Then user searches an item
Then user selects the searched item

@RegressionTest @E2E
Scenario: Verify countOfItemsInCart functionality
Given user is on login screen
When user enters username and password
Then user clicks on login button
Then user searches an item
Then user selects the searched item
And adds the item to cart
Then user verifies the number of items added to cart




