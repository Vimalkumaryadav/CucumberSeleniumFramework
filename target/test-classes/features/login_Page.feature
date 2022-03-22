Feature: 2.Login page feature

Scenario Outline:  Validating Login Page

Given user is on login page
When forgot your password link should be displayed 
And registration link should be displayed
Then user enters "<email>" and "<password>"
And application should display expected result based on "<criteria>"

Examples:
|email                    |password   |criteria|
|testtoolbot17@yopmail.com|Welcome@123|valid	 |
|testtoolbot@yopmail.com  |Welcome123 |invalid |