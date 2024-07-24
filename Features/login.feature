Feature: Login Test 
this is login test
 
Background: 
Given open the chrome
When user enters url "https://practice.expandtesting.com/login"
 
Scenario:  to verify login works properly when we give valid cred

When user enters username as "practice"
When user enters password as "SuperSecretPassword!"
And user clicks on login 
Then user is able to see logout button 
Then close the browser


@mytag @negative
Scenario: to verify we are not able to login with invalid cred

When user enters username as "abced"
When user enters password as "abced"
And user clicks on login 
Then user is able to see logout button 
Then close the browser


#login functionality , multip invlid username passord



@dataDriven
Scenario Outline:  to verify we are not able to login with invalid cred

When user enters username as <username>

When user enters password as <password>
And user clicks on login 
Then user is able to see logout button 
Examples:
|username|password|
|"abc1"|"passwd1" |
|"abcd2"|"passwd2"|