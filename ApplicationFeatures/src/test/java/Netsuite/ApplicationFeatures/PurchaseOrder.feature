Feature: To test Purchase Order creation in Netsuite

Scenario Outline: To Test PO creation
Given User is in Login Page
When User clicks Login Button
Then User enters username "<uname>"
And User enters password "<pwd>"
And User clicks Submit Button
When User enters "<Code>"
And User clicks on Submit
Then User is on Home Page
When User selects Purchase Order from Menu
Then Purchase Order Screen is displayed 
When User enters details and click Submit 
Then Purchase Order is created

Examples:
      |uname|pwd|Code|
      |sindhuja.b@tvarana.com|Tvarana@123|job|
      
    
 
