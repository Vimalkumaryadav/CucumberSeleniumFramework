Feature: Certificate page feature

  Scenario Outline:  Validating Certificate Page
  
  Given user is on login page
   When I sign in with "<email>" and "<password>"
   Then I validate the fields in the certificate page
    And I Add Certificate "<certificatename>" , "<certificatenetprice>" , "<certificategrossprice>" and click on save certificate button
    And I Add duplicate Certificate "<certificatename>" , "<certificatenetprice>" , "<certificategrossprice>" and click on save certificate button
    
    Examples:
     |email                    |password   ||certificatename|certificatenetprice|certificategrossprice|
     |testtoolbot22@yopmail.com |Welcome@123||Level 2357 NVQ |48.50              |58.50                |