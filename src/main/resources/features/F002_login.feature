@smoke
Feature: test login functionality
  Background:
    Given open the browser

  Scenario: User could log in with valid email and password
    When click sign in and enter the registered email and password
    And  click sign in button
    Then textUser is displayed

   Scenario Outline:  user could log in with invalid credentials
     When sign in with invalid credentials "<username>" "<password>"
     And  click on sign in button
     Then Error message display
     Examples:
     |   username   |   password   |
     |   test       |   test       |
     |   test2      |   test2      |

