@test
Feature: Registration

  Scenario: As a user, I should be able to register successfully
  so that, I can us all the user features on demoNopcommerce website.

    Given user is on registration page
    When user enters required registration details
    And user clicks on register submit button
    Then user should be able to register successfully
    And user should be logged in

