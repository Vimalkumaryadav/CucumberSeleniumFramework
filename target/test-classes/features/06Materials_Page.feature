Feature: Materials page feature

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
     | testtoolbot22@yopmail.com | Welcome@123 |Electrical       |Electrical        |Accessories     |ToolStation  |5555      |58.29   |68.29     |25      |https://www.toolstation.com/axiom-metal-17th-edition-amendment-3-high-integrity-dual-rcd-10-mcbs-consumer-unit/p82853|Axiom Metal 17th Edition Amendment 3 High Integrity Dual RCD + 10 MCBs Consumer Unit 12 Way|