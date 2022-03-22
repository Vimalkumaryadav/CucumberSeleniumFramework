
Feature: Labour page feature

  Scenario Outline:  Validating Labour Page
  
    Given user is on login page
     When I sign in with "<email>" and "<password>"
      And I validate the all fields in the Labour page
     Then I navigate to labour and enter the "<calloutcharge>" , "<hourlyrate>" , "<dayrate>" , "<weekendcalloutcharge>" , "<weekendhourlyrate>" , "<saturdaydayrate>" , "<sundaydayrate>" , "<emergencycalloutcharge>" and click on save button
     
     Examples:
     |email                     |password   |calloutcharge|hourlyrate|dayrate|weekendcalloutcharge|weekendhourlyrate|saturdaydayrate|sundaydayrate|emergencycalloutcharge|
     |testtoolbot22@yopmail.com |Welcome@123|15           |10        |80     |20                  |15               |150            |200          |250                   |