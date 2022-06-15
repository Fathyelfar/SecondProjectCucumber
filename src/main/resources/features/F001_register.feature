@smoke
Feature: test registration functionality

  Scenario: user register with valid data
    Given launch the browser
    When  click on sign up
    And   type valid email and valid password
    And   type first and last name and click on create and account button
    Then  user successfully register and the userText appears

