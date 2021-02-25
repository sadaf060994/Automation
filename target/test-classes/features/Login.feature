Feature: Logging in Demo

Scenario: Homepage default login
Given User is on homepage
When Username and password is entered
Then Homepage is populated
And Cards are displayed
