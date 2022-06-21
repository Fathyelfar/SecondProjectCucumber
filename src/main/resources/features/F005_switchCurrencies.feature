@smoke
Feature: test for switch currencies
  Scenario: Logged User could switch between currencies US-Euro
    When  click on the dropdown menu next to country at the top left
    And   click on the dropdown menu next to country at the top right
    And   change the currency by selecting radio button
    Then  currency change it successfully