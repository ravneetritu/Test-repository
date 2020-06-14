#Feature: Amazon login feature

#Without Examples keyword
#Scenario: Amazon Login Test Scenario

#Given User is already on login page
#When title of the page is Amazon
#Then User enters "7986409223" and "jio@123"
#Then User clicks on login button
#Then user is on home page

#With Examples keyword
#Scenario Outline: Amazon Login Test Scenario

#Given User is already on login page
#When Title of the page is Amazon
#Then User enters <username> and <password>
#Then User clicks on login button
#Then User is on home page
#Then User searches an <item> 
#And  Selects the <specificItem> and adds <thisItem> to cart
#Then verifies the added item
#And  Close the browser

#Examples:
 #| username   | password | item | specificItem | thisItem |
 #| "7986409223" | "jio@123" | "books" | "selenium" | ""|
 #| "9711511077" | "icp@123" | "computer" | "Dell inspirion"| "" |
 
 