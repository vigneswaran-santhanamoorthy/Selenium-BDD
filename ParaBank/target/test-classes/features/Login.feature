#Author: vigneswaransanthanamoorthy@gmail.com
#Feature: smoke and regression testing
@Login @regression
Feature: Functional testing of login page of paraBank

  @loginhappypath1 @regression
  Scenario Outline: Verify the login feature of parabank happypath All Fields 
    Given I enter paraBank homepage
    When I check the customer login links and buttons
    And I enter "<userid>" and "<password>" and click log in button
    #Then I check accounts overview page and balance
    #And I click the account number to see the account details
    
    Examples:
    | userid       | password     |
    | NTYQZYRB1234 | JHIHZGVV8085 |
    | RABFQCOD1234 | LFEFIKLT1142 |
    
