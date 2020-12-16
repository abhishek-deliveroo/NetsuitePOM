Feature: To test Sales Order creation in Netsuite

Scenario Outline: To Test SO creation
Given User present in Login Page
When Login Button is clicked by User
Then User enters the value for username "<uname>"
And User enters the value for password "<pwd>"
And Submit Button is clicked by User
When User enters Authentication Code as "<Code>"
And Submit is clicked by User
When User selects Sales Order from Menu
Then Sales Order Screen is displayed 
When User enters SO details and click Submit 
Then Sales Order is created

Examples:
      |uname|pwd|Code|
      |sindhuja.b@tvarana.com|Tvarana@123|job| 