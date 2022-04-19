Feature: feature to test Help and Contact functionality



Scenario Outline: Check user is able to verify get help if you bought as a guest tab
Given open the browser
When enter the "https://www.ebay.com/"
Then display the home page
Then user clicks help and contact tab
And user redirected to help and contact page
Then user click on get help if you bought as a guest tab
And user redirected to get help if you bought as a guest tab
And user click on fing guest order details tab
Then user redirected to find guest order details page
And user enter Email details in the Email box
| Field | Value |
| Email | <Email> |
And click on submit request button


Examples:
| Email | 
| lipuswain2@gmail.com |

