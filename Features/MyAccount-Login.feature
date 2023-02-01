Feature: My Account- Login Feature
Description: This  feature will test a login functionality


# In scenario we will precondition of test case 
#Scenario: Login with valid username and password 
#Given Open browser
#When Enter url "https://practice.automationtesting.in/"
#And Click on My Account menu
#And Enter registered Username and Password
#And Click on Login button
#Then User must successfully login in Web Page




# In scenario we will precondition of test case 
##Given Open browser
##And Enter registered Username "kandevinod446" and Password "Vinod@123"
#And Click on Login button
#Then User must successfully login in Web Page


# In scenario we will precondition of test case 
Scenario Outline: Login with valid username and password 
Given Open browser
When Enter url "https://practice.automationtesting.in/"
And Click on My Account menu
And Enter registered Username "<username>" and Password "<password>"
And Click on Login button
Then Verify login

Examples:
 | username | password |
 | kandevinod446 | Vinod@1 |
 | kandevinod | Vinod@123 |
 | kandevinod4 | Vinod |


























