Feature: Multiple user logins

Scenario: Multiple users are able to login

Given User is already on login page
When Title of the page is Amazon
Then User enters username and password
|7986409223|jio@123|
|9711511077|icp@123|
Then User clicks on login button
Then User is on home page
And  Close the browser