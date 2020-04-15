$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/harsha vardhan/Desktop/selenium/CROSSWORD/src/test/resources/Features/CrossWord.feature");
formatter.feature({
  "line": 2,
  "name": "crossword website",
  "description": "",
  "id": "crossword-website",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#@acc01"
    },
    {
      "line": 4,
      "value": "#Scenario: To Register in the website"
    },
    {
      "line": 5,
      "value": "#\tGiven I launched website"
    },
    {
      "line": 6,
      "value": "#\tAnd I click on the my account button"
    },
    {
      "line": 7,
      "value": "#\tWhen I enter my name"
    },
    {
      "line": 8,
      "value": "#\tAnd I enter my email"
    },
    {
      "line": 9,
      "value": "#\tAnd I enter my password"
    },
    {
      "line": 10,
      "value": "#\tAnd I re_enter my password"
    },
    {
      "line": 11,
      "value": "#\tAnd I enter my date of birth"
    },
    {
      "line": 12,
      "value": "#\tAnd I click on my gender"
    },
    {
      "line": 13,
      "value": "#\t  And I click on submit button"
    },
    {
      "line": 14,
      "value": "#"
    },
    {
      "line": 15,
      "value": "#@acc02"
    },
    {
      "line": 16,
      "value": "#Scenario Outline: Validating the login functionality"
    },
    {
      "line": 17,
      "value": "#Given I want to launch the website"
    },
    {
      "line": 18,
      "value": "#When website is launched"
    },
    {
      "line": 19,
      "value": "#Then Click on the login button"
    },
    {
      "line": 20,
      "value": "#Then login page is opened"
    },
    {
      "line": 21,
      "value": "#Then I enter \"\u003cemail\u003e\" and \"\u003cpassword\u003e\""
    },
    {
      "line": 22,
      "value": "#And The login button is clicked"
    },
    {
      "line": 23,
      "value": "#"
    },
    {
      "line": 24,
      "value": "#\t Examples:"
    },
    {
      "line": 25,
      "value": "#|email|password|"
    },
    {
      "line": 26,
      "value": "#|harsha@gmail.com|harsha123|"
    },
    {
      "line": 27,
      "value": "#|dshgbdhjbk@gmail.com|hgavdsfugvsd234|"
    },
    {
      "line": 28,
      "value": "#|joyhi@gmail.com|jothi123|"
    },
    {
      "line": 29,
      "value": "#@acc03"
    },
    {
      "line": 30,
      "value": "#Scenario Outline: Updating information of user in profile"
    },
    {
      "line": 31,
      "value": "#Given I want to launch the homepage"
    },
    {
      "line": 32,
      "value": "#When homepage is launched and i click on Myaccount button"
    },
    {
      "line": 33,
      "value": "#Then I click on update profile"
    },
    {
      "line": 34,
      "value": "#\t\tAnd I update my details mobile number \"\u003cmobile number\u003e\" and landline \"\u003clandline\u003e\""
    },
    {
      "line": 35,
      "value": "#And I click the update button"
    },
    {
      "line": 36,
      "value": "#And I recceive feedback that Your Profile is successfully updated"
    },
    {
      "line": 37,
      "value": "#Examples:"
    },
    {
      "line": 38,
      "value": "#| mobile number  | landline  |"
    },
    {
      "line": 39,
      "value": "#|     9754621456 | 52346789  |"
    },
    {
      "line": 40,
      "value": "#|7845613255      |     578946|"
    },
    {
      "line": 41,
      "value": "#|9547861356\t\t\t |     957462|"
    },
    {
      "line": 42,
      "value": "#@acc04"
    },
    {
      "line": 43,
      "value": "#\tScenario Outline: Tracking an order by order number"
    },
    {
      "line": 44,
      "value": "#\t\tGiven I want to get into the homepage"
    },
    {
      "line": 45,
      "value": "#\t\tWhen homepage is launched and i click on track your order"
    },
    {
      "line": 46,
      "value": "#\t\tThen I enter product number \"\u003cproduct number\u003e\""
    },
    {
      "line": 47,
      "value": "#\t\tAnd I click on track button"
    },
    {
      "line": 48,
      "value": "#\t\tAnd I receive feedback that Invalid order number or email"
    },
    {
      "line": 49,
      "value": "#\t\tExamples:"
    },
    {
      "line": 50,
      "value": "#\t\t|product number|"
    },
    {
      "line": 51,
      "value": "#\t\t|698721987651|"
    },
    {
      "line": 52,
      "value": "#\t\t|784651354795|"
    },
    {
      "line": 53,
      "value": "#\t\t|987546215464|"
    },
    {
      "line": 54,
      "value": "#\t\t|861513531864|"
    },
    {
      "line": 55,
      "value": "#"
    },
    {
      "line": 56,
      "value": "#\t\t@acc05"
    },
    {
      "line": 57,
      "value": "#\t\tScenario Outline: Raising an order related query in customercare"
    },
    {
      "line": 58,
      "value": "#\t\tGiven I want to launch website home page"
    },
    {
      "line": 59,
      "value": "#\t\tWhen I click on coustomercare"
    },
    {
      "line": 60,
      "value": "#\t\tThen I click on order related query"
    },
    {
      "line": 61,
      "value": "#\t\tAnd I enter orderid \"\u003corderid\u003e\" email \"\u003cemail\u003e\" phone \"\u003cphone\u003e\" and query \"\u003cquery\u003e\""
    },
    {
      "line": 62,
      "value": "#\t\tAnd I click on next button"
    },
    {
      "line": 63,
      "value": "#\t\tThen I receive feedback that Successfully sent your query"
    },
    {
      "line": 64,
      "value": "#\t\tExamples:"
    },
    {
      "line": 65,
      "value": "#\t\t|orderid    |email\t\t\t\t\t |phone     |query\t\t\t\t\t\t\t\t\t\t\t\t\t|"
    },
    {
      "line": 66,
      "value": "#\t\t|98754613232|harsha@gmail.com|7894561230|I have received damaged product|"
    },
    {
      "line": 67,
      "value": "#\t\t|41235478985|harsha@gmail.com|9531489562|I havent received my product yet|"
    },
    {
      "line": 68,
      "value": "#\t\t|78465132564|harsha@gmail.com|8794561532|i want to return my product|"
    },
    {
      "line": 69,
      "value": "#"
    },
    {
      "line": 70,
      "value": "#@acc06"
    },
    {
      "line": 71,
      "value": "#Scenario: Selecting a Book"
    },
    {
      "line": 72,
      "value": "#Given I logged on the Website"
    },
    {
      "line": 73,
      "value": "#When I click on books"
    },
    {
      "line": 74,
      "value": "#Then I select required book"
    },
    {
      "line": 75,
      "value": "#"
    },
    {
      "line": 76,
      "value": "#@acc07"
    },
    {
      "line": 77,
      "value": "#Scenario: Open Mycart"
    },
    {
      "line": 78,
      "value": "#Given I logged on to the Website"
    },
    {
      "line": 79,
      "value": "#When I clicked on mycart"
    },
    {
      "line": 80,
      "value": "#Then I select continue shopping"
    },
    {
      "line": 81,
      "value": "#"
    },
    {
      "line": 82,
      "value": "#@acc08"
    },
    {
      "line": 83,
      "value": "#Scenario: Checking faq in Help"
    },
    {
      "line": 84,
      "value": "#Given I am logged in to the website"
    },
    {
      "line": 85,
      "value": "#When I have clicked on to the Help"
    },
    {
      "line": 86,
      "value": "#Then I click on faqs that i want"
    },
    {
      "line": 87,
      "value": "#@acc09"
    },
    {
      "line": 88,
      "value": "#Scenario: To open Stationary page"
    },
    {
      "line": 89,
      "value": "#Given I logged in to the website"
    },
    {
      "line": 90,
      "value": "#When I click on Stationary button"
    },
    {
      "line": 91,
      "value": "#Then I landed on stationary page"
    },
    {
      "line": 92,
      "value": "#"
    },
    {
      "line": 93,
      "value": "#@acc10"
    },
    {
      "line": 94,
      "value": "#Scenario: To open my wishlist page"
    },
    {
      "line": 95,
      "value": "#Given I logged into the website"
    },
    {
      "line": 96,
      "value": "#When  I clicked on the my wishlist option"
    },
    {
      "line": 97,
      "value": "#And If my wishlist page is empty"
    },
    {
      "line": 98,
      "value": "#Then I have to click the continue shopping option"
    },
    {
      "line": 99,
      "value": "#"
    }
  ],
  "line": 101,
  "name": "Logging out from the website",
  "description": "",
  "id": "crossword-website;logging-out-from-the-website",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 100,
      "name": "@acc11"
    }
  ]
});
formatter.step({
  "line": 102,
  "name": "I want to launch the website page \"\u003cuname\u003e\" and \"\u003cpwd\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 103,
  "name": "Homepage is launched",
  "keyword": "When "
});
formatter.step({
  "line": 104,
  "name": "I click on logout button",
  "keyword": "And "
});
formatter.step({
  "line": 105,
  "name": "I receive feedback that I am logged out",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "LogoutStepDef.homepage_is_launched()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LogoutStepDef.i_click_on_logout_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LogoutStepDef.i_receive_feedback_that_I_am_logged_out()"
});
formatter.result({
  "status": "skipped"
});
});