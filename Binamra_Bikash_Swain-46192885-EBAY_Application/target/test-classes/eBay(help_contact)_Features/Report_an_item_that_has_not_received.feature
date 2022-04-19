Feature: feature to test Help and Contact functionality



Scenario Outline: Check user is able to verify report an item that has not arrived
Given browser open
When enter "https://www.ebay.com/"
Then home page of ebay
Then click help and contact tab
And redirected to help and contact page
Then click get help with an item that has not arrived tab
And redirected to get help with an item that has not arrived page
And click report an item that has not arrived tab
Then redirected sign in page
And enter Emailid in the Email box
| Field | Value |
| Email | <Emailid> |
And click on Continue button
And enters the password in Passwordbox
| Field | Value |
| password | <Password> |
And click on Sign in button
Then navigated to the report an item that has not arrived page

Examples:
| Emailid | Password |
| lipuswain2@gmail.com | Lipun@2001 |