Feature: 3.Client page feature

  Scenario Outline:  Validating Client Page
  
    Given user is on login page
     When I sign in with "<email>" and "<password>"
     When I navigate to client tab and click on add client button
     Then I validate the fields in the client details tab
     	And I validate email by passing already used "<clientemailduplicate>"
     	And I validate email by passing invalid email "<clientfirstname>"
      And I enter the "<clienttitle>" , "<clientfirstname>" , "<clientlastname>" , "<telephonenumber>" , "<mobilenumber>" , "<clientemail>" , "<notes>" and click on sumbit button
     Then I validate the fields in the client address tab
      And I click on Add Address button and enter the "<address1>" , "<address2>" , "<town>" , "<county>" , "<postcode>" , "<addressnotes>" and click on save changes button
  
  		Examples: 
      | email                    | password    | clienttitle | clientfirstname | clientlastname |clientemailduplicate|clientemail               | telephonenumber | mobilenumber | notes           | address1      | address2   | town | county   | postcode | addressnotes    | 
      | testtoolbot8@yopmail.com | Welcome@123 | Mr          | Richard         | Atkins         |asdf@gmail.com      |testtoolbot29@yopmail.com | 01823554741     | 07414582645  | Autoamted notes | 167 Long View | Little Ham | Ham  | Somerset | TA126GS  | Automated notes | 
