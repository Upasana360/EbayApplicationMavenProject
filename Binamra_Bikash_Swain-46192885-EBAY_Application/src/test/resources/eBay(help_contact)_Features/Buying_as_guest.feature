Feature: feature to test Help and Contact functionality



Scenario: Check user is able to verify buying as a guest tab and user is able to given the feedback
Given open the browser
When enter the "https://www.ebay.com/"
Then Page is displayed
Then user clicks help and contact tab
Then user redirected to help and contact page
And click on buying as a guest tab
Then user is redirected to buying as a guest page
And user able to given the feedback