$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/01Register_Page.feature");
formatter.feature({
  "line": 1,
  "name": "A.Register page feature",
  "description": "",
  "id": "a.register-page-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Validating Registring Page",
  "description": "",
  "id": "a.register-page-feature;validating-registring-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I navigated to the application and to registration page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I validate the fields in registration page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I enter \"\u003ctitle\u003e\" , \"\u003cfirstname\u003e\" , \"\u003clastname\u003e\" , \"\u003cemail\u003e\" , \"\u003cbusinesstype\u003e\" , \"\u003cbusinessname\u003e\" , \"\u003cpassword\u003e\" and \"\u003cconfirmpassword\u003e\" and click on register",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I navigate to email and enter \"\u003cemail\u003e\" and Verify the email",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I again login into application with registrated user",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "a.register-page-feature;validating-registring-page;",
  "rows": [
    {
      "cells": [
        "title",
        "firstname",
        "lastname",
        "email",
        "businesstype",
        "businessname",
        "password",
        "confirmpassword"
      ],
      "line": 12,
      "id": "a.register-page-feature;validating-registring-page;;1"
    },
    {
      "cells": [
        "Mr",
        "James",
        "anderson",
        "testtoolbot19@yopmail.com",
        "Carpenter",
        "The Carpenter Store",
        "Welcome@123",
        "Welcome@123"
      ],
      "line": 13,
      "id": "a.register-page-feature;validating-registring-page;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 7975054600,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Validating Registring Page",
  "description": "",
  "id": "a.register-page-feature;validating-registring-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I navigated to the application and to registration page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I validate the fields in registration page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I enter \"Mr\" , \"James\" , \"anderson\" , \"testtoolbot19@yopmail.com\" , \"Carpenter\" , \"The Carpenter Store\" , \"Welcome@123\" and \"Welcome@123\" and click on register",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5,
    6,
    7
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I navigate to email and enter \"testtoolbot19@yopmail.com\" and Verify the email",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I again login into application with registrated user",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_Steps.i_navigated_to_the_application_and_to_registration_page()"
});
formatter.result({
  "duration": 7200123800,
  "status": "passed"
});
formatter.match({
  "location": "Registration_Steps.i_validate_the_fields_in_registration_page()"
});
formatter.result({
  "duration": 14273190600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mr",
      "offset": 9
    },
    {
      "val": "James",
      "offset": 16
    },
    {
      "val": "anderson",
      "offset": 26
    },
    {
      "val": "testtoolbot19@yopmail.com",
      "offset": 39
    },
    {
      "val": "Carpenter",
      "offset": 69
    },
    {
      "val": "The Carpenter Store",
      "offset": 83
    },
    {
      "val": "Welcome@123",
      "offset": 107
    },
    {
      "val": "Welcome@123",
      "offset": 125
    }
  ],
  "location": "Registration_Steps.i_enter_and_and_click_on_register(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 15039316800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "testtoolbot19@yopmail.com",
      "offset": 31
    }
  ],
  "location": "Registration_Steps.i_navigate_to_email_and_enter_and_Verify_the_email(String)"
});
formatter.result({
  "duration": 31613598300,
  "status": "passed"
});
formatter.match({
  "location": "Registration_Steps.i_again_login_into_application_with_registrated_user()"
});
formatter.result({
  "duration": 1175171400,
  "status": "passed"
});
formatter.after({
  "duration": 10144447400,
  "status": "passed"
});
formatter.uri("src/test/resources/features/02Login_Page.feature");
formatter.feature({
  "line": 1,
  "name": "B.Login page feature",
  "description": "",
  "id": "b.login-page-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Validating Login Page",
  "description": "",
  "id": "b.login-page-feature;validating-login-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "forgot your password link should be displayed",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "registration link should be displayed",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user enters \"\u003cemail\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "application should display expected result based on \"\u003ccriteria\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "b.login-page-feature;validating-login-page;",
  "rows": [
    {
      "cells": [
        "email",
        "password",
        "criteria"
      ],
      "line": 12,
      "id": "b.login-page-feature;validating-login-page;;1"
    },
    {
      "cells": [
        "testtoolbot19@yopmail.com",
        "Welcome@123",
        "valid"
      ],
      "line": 13,
      "id": "b.login-page-feature;validating-login-page;;2"
    },
    {
      "cells": [
        "testtoolbot@yopmail.com",
        "Welcome123",
        "invalid"
      ],
      "line": 14,
      "id": "b.login-page-feature;validating-login-page;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 7247771800,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Validating Login Page",
  "description": "",
  "id": "b.login-page-feature;validating-login-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "forgot your password link should be displayed",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "registration link should be displayed",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user enters \"testtoolbot19@yopmail.com\" and \"Welcome@123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "application should display expected result based on \"valid\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Login_Steps.user_is_on_login_page()"
});
formatter.result({
  "duration": 6235063600,
  "status": "passed"
});
formatter.match({
  "location": "Login_Steps.forgot_your_password_link_should_be_displayed()"
});
formatter.result({
  "duration": 178864500,
  "status": "passed"
});
formatter.match({
  "location": "Login_Steps.registration_link_should_be_displayed()"
});
formatter.result({
  "duration": 2051142200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "testtoolbot19@yopmail.com",
      "offset": 13
    },
    {
      "val": "Welcome@123",
      "offset": 45
    }
  ],
  "location": "Login_Steps.user_enters_credentials(String,String)"
});
formatter.result({
  "duration": 3270419600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "valid",
      "offset": 53
    }
  ],
  "location": "Login_Steps.user_gets_the_title_of_the_page(String)"
});
formatter.result({
  "duration": 5309926900,
  "status": "passed"
});
formatter.after({
  "duration": 9267682000,
  "status": "passed"
});
formatter.before({
  "duration": 3723239000,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Validating Login Page",
  "description": "",
  "id": "b.login-page-feature;validating-login-page;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "forgot your password link should be displayed",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "registration link should be displayed",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user enters \"testtoolbot@yopmail.com\" and \"Welcome123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "application should display expected result based on \"invalid\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Login_Steps.user_is_on_login_page()"
});
formatter.result({
  "duration": 6426203100,
  "status": "passed"
});
formatter.match({
  "location": "Login_Steps.forgot_your_password_link_should_be_displayed()"
});
formatter.result({
  "duration": 97632400,
  "status": "passed"
});
formatter.match({
  "location": "Login_Steps.registration_link_should_be_displayed()"
});
formatter.result({
  "duration": 2051114500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "testtoolbot@yopmail.com",
      "offset": 13
    },
    {
      "val": "Welcome123",
      "offset": 43
    }
  ],
  "location": "Login_Steps.user_enters_credentials(String,String)"
});
formatter.result({
  "duration": 3263232300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "invalid",
      "offset": 53
    }
  ],
  "location": "Login_Steps.user_gets_the_title_of_the_page(String)"
});
formatter.result({
  "duration": 627026500,
  "status": "passed"
});
formatter.after({
  "duration": 7314148000,
  "status": "passed"
});
formatter.uri("src/test/resources/features/03Adding_Client_Page.feature");
formatter.feature({
  "line": 1,
  "name": "C.Client page feature",
  "description": "",
  "id": "c.client-page-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Validating Client Page",
  "description": "",
  "id": "c.client-page-feature;validating-client-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I sign in with \"\u003cemail\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I navigate to client tab and click on add client button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I validate the fields in the client details tab",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I validate email by passing already used \"\u003cclientemailduplicate\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I validate email by passing invalid email \"\u003cclientfirstname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter the \"\u003cclienttitle\u003e\" , \"\u003cclientfirstname\u003e\" , \"\u003cclientlastname\u003e\" , \"\u003ctelephonenumber\u003e\" , \"\u003cmobilenumber\u003e\" , \"\u003cclientemail\u003e\" , \"\u003cnotes\u003e\" and click on sumbit button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I validate the fields in the client address tab",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I click on Add Address button and enter the \"\u003caddress1\u003e\" , \"\u003caddress2\u003e\" , \"\u003ctown\u003e\" , \"\u003ccounty\u003e\" , \"\u003cpostcode\u003e\" , \"\u003caddressnotes\u003e\" and click on save changes button",
  "keyword": "And "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "c.client-page-feature;validating-client-page;",
  "rows": [
    {
      "cells": [
        "email",
        "password",
        "clienttitle",
        "clientfirstname",
        "clientlastname",
        "clientemailduplicate",
        "clientemail",
        "telephonenumber",
        "mobilenumber",
        "notes",
        "address1",
        "address2",
        "town",
        "county",
        "postcode",
        "addressnotes"
      ],
      "line": 16,
      "id": "c.client-page-feature;validating-client-page;;1"
    },
    {
      "cells": [
        "testtoolbot8@yopmail.com",
        "Welcome@123",
        "Mr",
        "Richard",
        "Atkins",
        "asdf@gmail.com",
        "testtoolbot29@yopmail.com",
        "01823554741",
        "07414582645",
        "Autoamted notes",
        "167 Long View",
        "Little Ham",
        "Ham",
        "Somerset",
        "TA126GS",
        "Automated notes"
      ],
      "line": 17,
      "id": "c.client-page-feature;validating-client-page;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 10894554700,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Validating Client Page",
  "description": "",
  "id": "c.client-page-feature;validating-client-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I sign in with \"testtoolbot8@yopmail.com\" and \"Welcome@123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I navigate to client tab and click on add client button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I validate the fields in the client details tab",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I validate email by passing already used \"asdf@gmail.com\"",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I validate email by passing invalid email \"Richard\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter the \"Mr\" , \"Richard\" , \"Atkins\" , \"01823554741\" , \"07414582645\" , \"testtoolbot29@yopmail.com\" , \"Autoamted notes\" and click on sumbit button",
  "matchedColumns": [
    2,
    3,
    4,
    6,
    7,
    8,
    9
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I validate the fields in the client address tab",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I click on Add Address button and enter the \"167 Long View\" , \"Little Ham\" , \"Ham\" , \"Somerset\" , \"TA126GS\" , \"Automated notes\" and click on save changes button",
  "matchedColumns": [
    10,
    11,
    12,
    13,
    14,
    15
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Login_Steps.user_is_on_login_page()"
});
formatter.result({
  "duration": 6060110900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "testtoolbot8@yopmail.com",
      "offset": 16
    },
    {
      "val": "Welcome@123",
      "offset": 47
    }
  ],
  "location": "Adding_Client_Steps.i_sign_in_with_something_and_something(String,String)"
});
formatter.result({
  "duration": 3305283700,
  "status": "passed"
});
formatter.match({
  "location": "Adding_Client_Steps.i_navigate_to_client_tab_and_click_on_add_client_button()"
});
formatter.result({
  "duration": 11068472100,
  "status": "passed"
});
formatter.match({
  "location": "Adding_Client_Steps.i_validate_the_fields_in_the_client_details_tab()"
});
formatter.result({
  "duration": 167903300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "asdf@gmail.com",
      "offset": 42
    }
  ],
  "location": "Adding_Client_Steps.i_validate_email_by_passing_already_used_something(String)"
});
formatter.result({
  "duration": 4576608000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Richard",
      "offset": 43
    }
  ],
  "location": "Adding_Client_Steps.i_validate_email_by_passing_invalid_email_something(String)"
});
formatter.result({
  "duration": 4474374200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mr",
      "offset": 13
    },
    {
      "val": "Richard",
      "offset": 20
    },
    {
      "val": "Atkins",
      "offset": 32
    },
    {
      "val": "01823554741",
      "offset": 43
    },
    {
      "val": "07414582645",
      "offset": 59
    },
    {
      "val": "testtoolbot29@yopmail.com",
      "offset": 75
    },
    {
      "val": "Autoamted notes",
      "offset": 105
    }
  ],
  "location": "Adding_Client_Steps.i_enter_the_something_something_something_something_something_something_something_and_click_on_sumbit_button(String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 3139166600,
  "status": "passed"
});
formatter.match({
  "location": "Adding_Client_Steps.i_validate_the_fields_in_the_client_address_tab()"
});
formatter.result({
  "duration": 6316866500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "167 Long View",
      "offset": 45
    },
    {
      "val": "Little Ham",
      "offset": 63
    },
    {
      "val": "Ham",
      "offset": 78
    },
    {
      "val": "Somerset",
      "offset": 86
    },
    {
      "val": "TA126GS",
      "offset": 99
    },
    {
      "val": "Automated notes",
      "offset": 111
    }
  ],
  "location": "Adding_Client_Steps.i_click_on_add_address_button_and_enter_the_something_something_something_something_something_something_and_click_on_save_changes_button(String,String,String,String,String,String)"
});
formatter.result({
  "duration": 7029107400,
  "status": "passed"
});
formatter.after({
  "duration": 9262497900,
  "status": "passed"
});
formatter.uri("src/test/resources/features/04Labour_Page.feature");
formatter.feature({
  "line": 2,
  "name": "D.Labour page feature",
  "description": "",
  "id": "d.labour-page-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Validating Labour Page",
  "description": "",
  "id": "d.labour-page-feature;validating-labour-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I sign in with \"\u003cemail\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I validate the all fields in the Labour page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I navigate to labour and enter the \"\u003ccalloutcharge\u003e\" , \"\u003chourlyrate\u003e\" , \"\u003cdayrate\u003e\" , \"\u003cweekendcalloutcharge\u003e\" , \"\u003cweekendhourlyrate\u003e\" , \"\u003csaturdaydayrate\u003e\" , \"\u003csundaydayrate\u003e\" , \"\u003cemergencycalloutcharge\u003e\" and click on save button",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "d.labour-page-feature;validating-labour-page;",
  "rows": [
    {
      "cells": [
        "email",
        "password",
        "calloutcharge",
        "hourlyrate",
        "dayrate",
        "weekendcalloutcharge",
        "weekendhourlyrate",
        "saturdaydayrate",
        "sundaydayrate",
        "emergencycalloutcharge"
      ],
      "line": 12,
      "id": "d.labour-page-feature;validating-labour-page;;1"
    },
    {
      "cells": [
        "testtoolbot19@yopmail.com",
        "Welcome@123",
        "15",
        "10",
        "80",
        "20",
        "15",
        "150",
        "200",
        "250"
      ],
      "line": 13,
      "id": "d.labour-page-feature;validating-labour-page;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 8101992200,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Validating Labour Page",
  "description": "",
  "id": "d.labour-page-feature;validating-labour-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I sign in with \"testtoolbot19@yopmail.com\" and \"Welcome@123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I validate the all fields in the Labour page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I navigate to labour and enter the \"15\" , \"10\" , \"80\" , \"20\" , \"15\" , \"150\" , \"200\" , \"250\" and click on save button",
  "matchedColumns": [
    2,
    3,
    4,
    5,
    6,
    7,
    8,
    9
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Login_Steps.user_is_on_login_page()"
});
formatter.result({
  "duration": 5147680700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "testtoolbot19@yopmail.com",
      "offset": 16
    },
    {
      "val": "Welcome@123",
      "offset": 48
    }
  ],
  "location": "Adding_Client_Steps.i_sign_in_with_something_and_something(String,String)"
});
formatter.result({
  "duration": 3647583200,
  "status": "passed"
});
formatter.match({
  "location": "Add_Labour_Steps.i_validate_the_all_fields_in_the_labour_page()"
});
formatter.result({
  "duration": 15816679800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "15",
      "offset": 36
    },
    {
      "val": "10",
      "offset": 43
    },
    {
      "val": "80",
      "offset": 50
    },
    {
      "val": "20",
      "offset": 57
    },
    {
      "val": "15",
      "offset": 64
    },
    {
      "val": "150",
      "offset": 71
    },
    {
      "val": "200",
      "offset": 79
    },
    {
      "val": "250",
      "offset": 87
    }
  ],
  "location": "Add_Labour_Steps.i_navigate_to_labour_and_enter_the_something_something_something_something_something_something_something_something_and_click_on_save_button(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 15426934500,
  "status": "passed"
});
formatter.after({
  "duration": 8795005300,
  "status": "passed"
});
formatter.uri("src/test/resources/features/05Certificate_Page.feature");
formatter.feature({
  "line": 1,
  "name": "E.Certificate page feature",
  "description": "",
  "id": "e.certificate-page-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Validating Certificate Page",
  "description": "",
  "id": "e.certificate-page-feature;validating-certificate-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I sign in with \"\u003cemail\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I validate the fields in the certificate page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I Add Certificate \"\u003ccertificatename\u003e\" , \"\u003ccertificatenetprice\u003e\" , \"\u003ccertificategrossprice\u003e\" and click on save certificate button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I Add duplicate Certificate \"\u003ccertificatename\u003e\" , \"\u003ccertificatenetprice\u003e\" , \"\u003ccertificategrossprice\u003e\" and click on save certificate button",
  "keyword": "And "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "e.certificate-page-feature;validating-certificate-page;",
  "rows": [
    {
      "cells": [
        "email",
        "password",
        "",
        "certificatename",
        "certificatenetprice",
        "certificategrossprice"
      ],
      "line": 12,
      "id": "e.certificate-page-feature;validating-certificate-page;;1"
    },
    {
      "cells": [
        "testtoolbot19@yopmail.com",
        "Welcome@123",
        "",
        "Level 2357 NVQ",
        "48.50",
        "58.50"
      ],
      "line": 13,
      "id": "e.certificate-page-feature;validating-certificate-page;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 5812671400,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Validating Certificate Page",
  "description": "",
  "id": "e.certificate-page-feature;validating-certificate-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I sign in with \"testtoolbot19@yopmail.com\" and \"Welcome@123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I validate the fields in the certificate page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I Add Certificate \"Level 2357 NVQ\" , \"48.50\" , \"58.50\" and click on save certificate button",
  "matchedColumns": [
    3,
    4,
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I Add duplicate Certificate \"Level 2357 NVQ\" , \"48.50\" , \"58.50\" and click on save certificate button",
  "matchedColumns": [
    3,
    4,
    5
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Login_Steps.user_is_on_login_page()"
});
formatter.result({
  "duration": 6889536700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "testtoolbot19@yopmail.com",
      "offset": 16
    },
    {
      "val": "Welcome@123",
      "offset": 48
    }
  ],
  "location": "Adding_Client_Steps.i_sign_in_with_something_and_something(String,String)"
});
formatter.result({
  "duration": 3459920800,
  "status": "passed"
});
formatter.match({
  "location": "Certificate_Steps.i_validate_the_fields_in_the_certificate_page()"
});
formatter.result({
  "duration": 10269434900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Level 2357 NVQ",
      "offset": 19
    },
    {
      "val": "48.50",
      "offset": 38
    },
    {
      "val": "58.50",
      "offset": 48
    }
  ],
  "location": "Certificate_Steps.i_add_certificate_something_something_something_and_click_on_save_certificate_button(String,String,String)"
});
formatter.result({
  "duration": 6486412800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Level 2357 NVQ",
      "offset": 29
    },
    {
      "val": "48.50",
      "offset": 48
    },
    {
      "val": "58.50",
      "offset": 58
    }
  ],
  "location": "Certificate_Steps.i_add_duplicate_certificate_something_something_something_and_click_on_save_certificate_button(String,String,String)"
});
formatter.result({
  "duration": 16746779100,
  "status": "passed"
});
formatter.after({
  "duration": 9120532100,
  "status": "passed"
});
formatter.uri("src/test/resources/features/06Materials_Page.feature");
formatter.feature({
  "line": 1,
  "name": "F.Materials page feature",
  "description": "",
  "id": "f.materials-page-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Materials Page",
  "description": "",
  "id": "f.materials-page-feature;materials-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I sign in with \"\u003cemail\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I validate the fields in Category page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I navigate to category page and Add \"\u003cmaincategorytitle\u003e\" , \"\u003cselectmaincategory\u003e\" , \"\u003csubcategorytitle\u003e\" , \"\u003cretailertitle\u003e\" and click on save button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I validate the fields in Add Product",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I add product and select \"\u003cmaincategorytitle\u003e\" , \"\u003cselectmaincategory\u003e\" , \"\u003csubcategorytitle\u003e\" , \"\u003cretailertitle\u003e\" and \"\u003cproductsku\u003e\" , \"\u003cnetprice\u003e\" , \"\u003cgrossprice\u003e\" , \"\u003cpacksize\u003e\" , \"\u003cwebaddress\u003e\" , \"\u003cdescription\u003e\" and click on save button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I add duplicate product and select \"\u003cmaincategorytitle\u003e\" , \"\u003cselectmaincategory\u003e\" , \"\u003csubcategorytitle\u003e\" , \"\u003cretailertitle\u003e\" and \"\u003cproductsku\u003e\" , \"\u003cnetprice\u003e\" , \"\u003cgrossprice\u003e\" , \"\u003cpacksize\u003e\" , \"\u003cwebaddress\u003e\" , \"\u003cdescription\u003e\" and click on save button",
  "keyword": "And "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "f.materials-page-feature;materials-page;",
  "rows": [
    {
      "cells": [
        "email",
        "password",
        "maincategorytitle",
        "selectmaincategory",
        "subcategorytitle",
        "retailertitle",
        "productsku",
        "netprice",
        "grossprice",
        "packsize",
        "webaddress",
        "description"
      ],
      "line": 14,
      "id": "f.materials-page-feature;materials-page;;1"
    },
    {
      "cells": [
        "testtoolbot19@yopmail.com",
        "Welcome@123",
        "Electrical",
        "Electrical",
        "Accessories",
        "ToolStation",
        "5555",
        "58.29",
        "68.29",
        "25",
        "https://www.toolstation.com/axiom-metal-17th-edition-amendment-3-high-integrity-dual-rcd-10-mcbs-consumer-unit/p82853",
        "Axiom Metal 17th Edition Amendment 3 High Integrity Dual RCD + 10 MCBs Consumer Unit 12 Way"
      ],
      "line": 15,
      "id": "f.materials-page-feature;materials-page;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4129141400,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Materials Page",
  "description": "",
  "id": "f.materials-page-feature;materials-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I sign in with \"testtoolbot19@yopmail.com\" and \"Welcome@123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I validate the fields in Category page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I navigate to category page and Add \"Electrical\" , \"Electrical\" , \"Accessories\" , \"ToolStation\" and click on save button",
  "matchedColumns": [
    2,
    3,
    4,
    5
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I validate the fields in Add Product",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I add product and select \"Electrical\" , \"Electrical\" , \"Accessories\" , \"ToolStation\" and \"5555\" , \"58.29\" , \"68.29\" , \"25\" , \"https://www.toolstation.com/axiom-metal-17th-edition-amendment-3-high-integrity-dual-rcd-10-mcbs-consumer-unit/p82853\" , \"Axiom Metal 17th Edition Amendment 3 High Integrity Dual RCD + 10 MCBs Consumer Unit 12 Way\" and click on save button",
  "matchedColumns": [
    2,
    3,
    4,
    5,
    6,
    7,
    8,
    9,
    10,
    11
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I add duplicate product and select \"Electrical\" , \"Electrical\" , \"Accessories\" , \"ToolStation\" and \"5555\" , \"58.29\" , \"68.29\" , \"25\" , \"https://www.toolstation.com/axiom-metal-17th-edition-amendment-3-high-integrity-dual-rcd-10-mcbs-consumer-unit/p82853\" , \"Axiom Metal 17th Edition Amendment 3 High Integrity Dual RCD + 10 MCBs Consumer Unit 12 Way\" and click on save button",
  "matchedColumns": [
    2,
    3,
    4,
    5,
    6,
    7,
    8,
    9,
    10,
    11
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Login_Steps.user_is_on_login_page()"
});
formatter.result({
  "duration": 5809824600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "testtoolbot19@yopmail.com",
      "offset": 16
    },
    {
      "val": "Welcome@123",
      "offset": 48
    }
  ],
  "location": "Adding_Client_Steps.i_sign_in_with_something_and_something(String,String)"
});
formatter.result({
  "duration": 3287546500,
  "status": "passed"
});
formatter.match({
  "location": "Materials_Steps.i_validate_the_fields_in_category_page()"
});
formatter.result({
  "duration": 40865322600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Electrical",
      "offset": 37
    },
    {
      "val": "Electrical",
      "offset": 52
    },
    {
      "val": "Accessories",
      "offset": 67
    },
    {
      "val": "ToolStation",
      "offset": 83
    }
  ],
  "location": "Materials_Steps.i_navigate_to_category_page_and_add_something_something_something_something_and_click_on_save_button(String,String,String,String)"
});
formatter.result({
  "duration": 38912054700,
  "status": "passed"
});
formatter.match({
  "location": "Materials_Steps.i_validate_the_fields_in_add_product()"
});
formatter.result({
  "duration": 13550265900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Electrical",
      "offset": 26
    },
    {
      "val": "Electrical",
      "offset": 41
    },
    {
      "val": "Accessories",
      "offset": 56
    },
    {
      "val": "ToolStation",
      "offset": 72
    },
    {
      "val": "5555",
      "offset": 90
    },
    {
      "val": "58.29",
      "offset": 99
    },
    {
      "val": "68.29",
      "offset": 109
    },
    {
      "val": "25",
      "offset": 119
    },
    {
      "val": "https://www.toolstation.com/axiom-metal-17th-edition-amendment-3-high-integrity-dual-rcd-10-mcbs-consumer-unit/p82853",
      "offset": 126
    },
    {
      "val": "Axiom Metal 17th Edition Amendment 3 High Integrity Dual RCD + 10 MCBs Consumer Unit 12 Way",
      "offset": 248
    }
  ],
  "location": "Materials_Steps.i_add_product_and_select_something_something_something_something_and_something_something_something_something_something_something_and_click_on_save_button(String,String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 18988478700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Electrical",
      "offset": 36
    },
    {
      "val": "Electrical",
      "offset": 51
    },
    {
      "val": "Accessories",
      "offset": 66
    },
    {
      "val": "ToolStation",
      "offset": 82
    },
    {
      "val": "5555",
      "offset": 100
    },
    {
      "val": "58.29",
      "offset": 109
    },
    {
      "val": "68.29",
      "offset": 119
    },
    {
      "val": "25",
      "offset": 129
    },
    {
      "val": "https://www.toolstation.com/axiom-metal-17th-edition-amendment-3-high-integrity-dual-rcd-10-mcbs-consumer-unit/p82853",
      "offset": 136
    },
    {
      "val": "Axiom Metal 17th Edition Amendment 3 High Integrity Dual RCD + 10 MCBs Consumer Unit 12 Way",
      "offset": 258
    }
  ],
  "location": "Materials_Steps.i_add_duplicate_product_and_select_something_something_something_something_and_something_something_something_something_something_something_and_click_on_save_button(String,String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 27471099200,
  "status": "passed"
});
formatter.after({
  "duration": 8915111900,
  "status": "passed"
});
});