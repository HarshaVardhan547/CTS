
Feature: crossword website
@acc01
Scenario: To Register in the website
   	Given I launched website
   	And I click on the my account button
   	When I enter my name
   	And I enter my email
   	And I enter my password
   	And I re_enter my password
   	And I enter my date of birth
   	And I click on my gender
	  And I click on submit button
  
 @acc02
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
  |joyhi@gmail.com|jothi123|
  @acc03
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
      |7845613255      |     578946|
      |9547861356			 |     957462|
   @acc04
	Scenario Outline: Tracking an order by order number
		Given I want to get into the homepage
		When homepage is launched and i click on track your order
		Then I enter product number "<product number>"
		And I click on track button
		And I receive feedback that Invalid order number or email 
		Examples:
		|product number|
		|698721987651|
		|784651354795|
		|987546215464|
		|861513531864|
		
		@acc05
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
		|41235478985|harsha@gmail.com|9531489562|I havent received my product yet|
		|78465132564|harsha@gmail.com|8794561532|i want to return my product|

  @acc06
    Scenario: Selecting a Book    
    Given I logged on the Website
    When I click on books
    Then I select required book 
    
  @acc07
     Scenario: Open Mycart     
     Given I logged on to the Website
     When I clicked on mycart
     Then I select continue shopping 
        
  @acc08
      Scenario: Checking faq in Help     
      Given I am logged in to the website
      When I have clicked on to the Help
      Then I click on faqs that i want
@acc09
Scenario: To open Stationary page
      Given I logged in to the website
      When I click on Stationary button
      Then I landed on stationary page
      
  @acc10
  Scenario: To open my wishlist page
      Given I logged into the website
      When  I clicked on the my wishlist option
      And If my wishlist page is empty 
      Then I have to click the continue shopping option
   
	@acc11
	Scenario: Logging out from the website
		Given I want to launch the website page
		When Homepage is launched 
		And I click on logout button 
		Then I receive feedback that I am logged out
