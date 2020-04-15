
Feature: crossword website


 @acc01
  Scenario Outline: Validating the login functionality  
   Given I want to launch the website
   When website is launched
   Then Click on the login button
   Then login page is opened
   Then I enter "<email>" and "<password>"
   And The login button is clicked
		
	 Examples:
  |email|password|
  |harsha@gmail.com|harsha123|
  |dshgbdhjbk@gmail.com|hgavdsfugvsd234|
  
  @acc02
  Scenario Outline: Updating information of user in profile
    Given I want to launch the homepage
    When homepage is launched and i click on Myaccount button
    Then I click on update profile 
		And I update my details mobile number "<mobile number>" and landline "<landline>"
    And I click the update button
    And I recceive feedback that Your Profile is successfully updated 
    Examples: 
      | mobile number  | landline  |
      |     9754621456 | 52346789  |
      
   @acc03
	Scenario Outline: Tracking an order by order number
		Given I want to get into the homepage
		When homepage is launched and i click on track your order
		Then I enter product number "<product number>"
		And I click on track button
		And I receive feedback that Invalid order number or email 
		Examples:
		|product number|
		|698721987651|
		
		@acc04
		Scenario Outline: Raising an order related query in customercare 
		Given I want to launch website home page
		When I click on coustomercare 
		Then I click on order related query
		And I enter orderid "<orderid>" email "<email>" phone "<phone>" and query "<query>"
		And I click on next button
		Then I receive feedback that Successfully sent your query
		Examples:
		|orderid    |email					 |phone     |query													|
		|98754613232|harsha@gmail.com|7894561230|I have received damaged product|

	@acc05
	Scenario: Logging out from the website
		Given I want to launch the website page
		When Homepage is launched 
		And I click on logout button 
		Then I receive feedback that I am logged out
