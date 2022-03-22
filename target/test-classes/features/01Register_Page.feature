Feature: Register page feature

	Scenario Outline:  Validating Registring Page

		Given I navigated to the application and to registration page
 		 When I validate the fields in registration page
 		 When I enter "<title>" , "<firstname>" , "<lastname>" , "<email>" , "<businesstype>" , "<businessname>" , "<password>" and "<confirmpassword>" and click on register
  		And I navigate to email and enter "<email>" and Verify the email
 		 Then I again login into application with registrated user

		 Examples:
			|title|firstname|lastname|email                    |businesstype|businessname       |password   |confirmpassword|
			|Mr   |James    |anderson|testtoolbot22@yopmail.com|Carpenter   |The Carpenter Store|Welcome@123|Welcome@123    |