Feature: feature to test Help and Contact functionality



Scenario: To verify the Get help with an item that has not arrived tab
Given open browser
When give "https://www.ebay.com/"
Then display the home page of ebay
And click on help and contact tab
Then redirected to the help and contact page
Then click on get help with an item that has not arrived tab
And user redirected to the get help with an item that has not arrived tab