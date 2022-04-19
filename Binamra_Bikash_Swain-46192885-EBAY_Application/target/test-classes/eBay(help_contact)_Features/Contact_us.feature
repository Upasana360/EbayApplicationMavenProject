Feature: feature to test Help and Contact functionality



Scenario: verify contact us
Given give the "https://www.ebay.com/"
When home page
Then help and contact tab
And user is able to get the help and contact page
Then contact us tab
And user is able to get the contact us page
Then account tab
And user get the account deatils