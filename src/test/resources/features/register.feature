Feature: ToolBot
Scenario Outline: Account Registration 

Given I navigated to the application and to registration page
When I enter "<title>" , "<firstname>" , "<lastname>" , "<email>" , "<businesstype>" , "<businessname>" , "<password>" and "<confirmpassword>" and click on register
Then Application should display expected result based on "<criteria>"
And I navigate to email and enter "<email>" and Verified the email
Then I again login into application with registrated user
And I navigate to client tab and click on add client button
And I enter the "<clienttitle>" , "<clientfirstname>" , "<clientlastname>" , "<telephonenumber>" , "<mobilenumber>" , "<clientemail>" , "<notes>" and click on sumbit button
Then I click on Add Address button and enter the "<address1>" , "<address2>" , "<town>" , "<county>" , "<postcode>" , "<addressnotes>" and click on save changes button
When I import client through excel file
And I navigate to labour and enter the "<calloutcharge>" , "<hourlyrate>" , "<dayrate>" , "<weekendcalloutcharge>" , "<weekendhourlyrate>" , "<saturdaydayrate>" , "<sundaydayrate>" , "<emergencycalloutcharge>" and click on save button
And I Add Certificate "<certificatename>" , "<certificatenetprice>" , "<certificategrossprice>" and and click on save certificate button
Then I navigate to category page and Add "<maincategorytitle>" , "<selectmaincategory>" , "<subcategorytitle>" , "<retailertitle>" and click on save button
And I add product and select "<maincategorytitle>" , "<selectmaincategory>" , "<subcategorytitle>" , "<retailertitle>" and "<productsku>" , "<netprice>" , "<grossprice>" , "<packsize>" , "<webaddress>" , "<description>" and click on save button
When I navigate to estimate page and add estimate
And create estimate by entering "<jobreference>" , "<paymentterms>" , "<clienttitle>" , "<clientfirstname>" , "<clientlastname>" , "<address1>" , "<jobname>" , "<jobdescription>" and save estimate
Then I added part materials "<selectmaincategory>" , "<subcategorytitle>" , "<retailertitle>" , "<productsku>" , "<quantity>" and save material
And Add labour charges by givng "<labourquantity>" and save labour charges 
And Add certificate by selecting "<certificatename>" and save certificate
Then send estimate with message "<estimatemessage>" and send estimate email
Then Add estimate as mark as invoice 



Examples:
|title|firstname|lastname|email                    |businesstype|businessname       |password   |confirmpassword|criteria|clienttitle|clientfirstname|clientlastname|clientemail              |telephonenumber|mobilenumber|notes          |address1        |address2  |town|county  |postcode|addressnotes   |calloutcharge|hourlyrate|dayrate|weekendcalloutcharge|weekendhourlyrate|saturdaydayrate|sundaydayrate|emergencycalloutcharge|certificatename|certificatenetprice|certificategrossprice|maincategorytitle|selectmaincategory|subcategorytitle|retailertitle|productsku|netprice|grossprice|packsize|webaddress                                                                                                           |description                                                                                |quantity|labourquantity|estimatemessage            |
|Mr   |James    |anderson|testtoolbot24@yopmail.com|Carpenter   |The Carpenter Store|Welcome@123|Welcome@123    |valid   |Mr   			 |Richard        |Atkins        |testtoolbot20@yopmail.com|01823554741    |07414582645 |Autoamted notes|167 Long View   |Little Ham|Ham |Somerset|TA126GS |Automated notes|15           |10        |80     |20                  |15               |150            |200          |250                   |Level 2357 NVQ |48.50              |58.50                |Electrical       |Electrical        |Accessories     |ToolStation  |5555      |58.29   |68.29     |25      |https://www.toolstation.com/axiom-metal-17th-edition-amendment-3-high-integrity-dual-rcd-10-mcbs-consumer-unit/p82853|Axiom Metal 17th Edition Amendment 3 High Integrity Dual RCD + 10 MCBs Consumer Unit 12 Way|2       |2             |Autoamtion Testing estimate|










