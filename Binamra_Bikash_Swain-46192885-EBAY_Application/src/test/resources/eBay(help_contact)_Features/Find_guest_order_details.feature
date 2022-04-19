Feature: feature to test Help and Contact functionality



Scenario Outline: Check user is able to verify "Find guest order details tab"
Given open the browser
When enter the "https://www.ebay.com/"
Then Page is displayed
And user clicks help and contact tab
Then user redirected to help and contact page
And click on buying as a guest tab
Then user is redirected to buying as a guest page
And user click on find guest order details tab
Then user redirected to find guest order details page
And enter the email id '<Emailid>'
Then click on Submit Request button

Examples: 
      | Emailid |
      | lipunswain2@gmail.com |
      
