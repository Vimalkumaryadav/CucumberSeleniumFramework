Feature: Regression Testing feature
 
  Scenario Outline:  Validating Registring Page
  
    Given I navigated to the application and to registration page
     When I validate the fields in registration page
     When I enter "<title>" , "<firstname>" , "<lastname>" , "<email>" , "<businesstype>" , "<businessname>" , "<password>" and "<confirmpassword>" and click on register
      And I navigate to email and enter "<email>" and Verify the email
     Then I again login into application with registrated user
  
    Examples: 
      | title | firstname | lastname | email                     | businesstype | businessname        | password    | confirmpassword | 
      | Mr    | James     | anderson | testtoolbot16@yopmail.com | Carpenter    | The Carpenter Store | Welcome@123 | Welcome@123     |  
      
  Scenario Outline:  Validating Login Page
  
    Given user is on login page
     When forgot your password link should be displayed 
      And registration link should be displayed
     Then user enters "<email>" and "<password>"
      And application should display expected result based on "<criteria>"
  
    Examples: 
      | email                     | password    | criteria | 
      | testtoolbot16@yopmail.com | Welcome@123 | valid    | 
      
  Scenario Outline:  Validating Clients details Page
  
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
      | testtoolbot8@yopmail.com | Welcome@123 | Mr          | Richard         | Atkins         |asdf@gmail.com      |testtoolbot28@yopmail.com | 01823554741     | 07414582645  | Autoamted notes | 167 Long View | Little Ham | Ham  | Somerset | TA126GS  | Automated notes |
    
  Scenario Outline:  Validating Labour Page
  
    Given user is on login page
     When I sign in with "<email>" and "<password>"
      And I validate the all fields in the Labour page
     Then I navigate to labour and enter the "<calloutcharge>" , "<hourlyrate>" , "<dayrate>" , "<weekendcalloutcharge>" , "<weekendhourlyrate>" , "<saturdaydayrate>" , "<sundaydayrate>" , "<emergencycalloutcharge>" and click on save button
     
     Examples:
     |email                     |password   |calloutcharge|hourlyrate|dayrate|weekendcalloutcharge|weekendhourlyrate|saturdaydayrate|sundaydayrate|emergencycalloutcharge|
     |testtoolbot16@yopmail.com |Welcome@123|15           |10        |80     |20                  |15               |150            |200          |250                   |

 Scenario Outline:  Validating Certificate Page
  
  Given user is on login page
   When I sign in with "<email>" and "<password>"
   Then I validate the fields in the certificate page
    And I Add Certificate "<certificatename>" , "<certificatenetprice>" , "<certificategrossprice>" and click on save certificate button
    And I Add duplicate Certificate "<certificatename>" , "<certificatenetprice>" , "<certificategrossprice>" and click on save certificate button
    
    Examples:
     |email                     |password   ||certificatename|certificatenetprice|certificategrossprice|
     |testtoolbot16@yopmail.com |Welcome@123||Level 2357 NVQ |48.50              |58.50                |
     
  Scenario Outline:  Materials Page

 		 Given user is on login page
     When I sign in with "<email>" and "<password>"
      And I validate the fields in Category page
     Then I navigate to category page and Add "<maincategorytitle>" , "<selectmaincategory>" , "<subcategorytitle>" , "<retailertitle>" and click on save button
      And I validate the fields in Add Product
      And I add product and select "<maincategorytitle>" , "<selectmaincategory>" , "<subcategorytitle>" , "<retailertitle>" and "<productsku>" , "<netprice>" , "<grossprice>" , "<packsize>" , "<webaddress>" , "<description>" and click on save button
      And I add duplicate product and select "<maincategorytitle>" , "<selectmaincategory>" , "<subcategorytitle>" , "<retailertitle>" and "<productsku>" , "<netprice>" , "<grossprice>" , "<packsize>" , "<webaddress>" , "<description>" and click on save button
     
     Examples:
     | email                     | password    |maincategorytitle|selectmaincategory|subcategorytitle|retailertitle|productsku|netprice|grossprice|packsize|webaddress                                                                                                           |description                                                                                |
     | testtoolbot16@yopmail.com | Welcome@123 |Electrical       |Electrical        |Accessories     |ToolStation  |5555      |58.29   |68.29     |25      |https://www.toolstation.com/axiom-metal-17th-edition-amendment-3-high-integrity-dual-rcd-10-mcbs-consumer-unit/p82853|Axiom Metal 17th Edition Amendment 3 High Integrity Dual RCD + 10 MCBs Consumer Unit 12 Way|