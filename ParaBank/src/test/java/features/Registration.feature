#Author: vigneswaransanthanamoorthy@gmail.com
#Feature: smoke and regression testing
@registration @regression
Feature: Functional testing of registration page of paraBank

  @registerhappypath1 @regression
  Scenario: Verify the registration feature of parabank happypath All Fields 
    Given I enter paraBank homepage
    When I click register link
    Then I redirected to registration page
    When I enter all fields
    And click register button
    Then I see success page
    
  @registerhappypath2 @regression
  Scenario: Verify the registration feature of parabank happypath Mandatory
    Given I enter paraBank homepage
    When I click register link
    Then I redirected to registration page
    When I enter mandatory fields
    And click register button
    Then I see success page
