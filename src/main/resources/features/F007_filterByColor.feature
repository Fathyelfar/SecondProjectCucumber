@smoke
Feature: test filter by color functionality
  Scenario: Logged user could filter with color
    Given user logged in the website
    When  select any category in the header
    And   filter by color
    Then  confirm the url is correct