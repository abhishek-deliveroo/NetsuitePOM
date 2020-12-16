Feature: To test Purchase Order creation in Netsuite

Scenario Outline: To Test PO creation
Given User currently in Login Page
When User clicks on Login Button
Then User enters the username "<uname>""<pwd>"
And User clicks on Submit Button
When User enters the "<Code>"
And User clicks on the Submit
Then User is currently in Home Page
When User makes Purchase Order selection from Menu
When User enters all details and click Submit 
Then Purchase Order gets created

Examples:
      |uname|pwd|Code|
      |sindhuja.b@tvarana.com|Tvarana@123|job|
      
    
 
