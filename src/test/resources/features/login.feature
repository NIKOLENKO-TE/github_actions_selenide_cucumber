Feature: Login

  Background: Launch the browser and open home page
    Given User launches browser
    When User opens homepage ilcarro

  @Login
  Scenario: Success users login
    And User clicks on Login link
    And User enter valid data
    And User clicks on Yalla button
    Then User check the display of the message about successful login
    And User closes browser
