Feature: User validations on new TESTME application
Background: TestMe Launching
Given  TESTME app is launched zz 

Scenario: User verification for the registration in TESTME

And User acccessing registration link in app
When User providing valid data for all requires fields
Then User verifying registration statussss


Scenario Outline: Login validation
When User clicks on login link 
Then user enters the valid username "<un>"
And user the enters the valid password "<pd>"
Then user submits the application
And verifies the login statuswss

    Examples: 
      | un      | pd          |
      | lalitha | password123 |
  
  
  Scenario: Searching for a product
  When User clicks on search button 
  Then Enters four characters of a product
  And User searches for a product
  Then checks for availablity for ordering 
  
  Scenario: The one where user orders aproduct  without adding any item to cart
  #Given Alex has regitered in to Testmeapp
  #When Alex search for a particular product like headphone
  When Try to proced to payment without addding any item in the cart
  #Then Testme doesnt display the cart icon
  
 
  
      