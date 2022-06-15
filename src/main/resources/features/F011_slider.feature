@smoke
Feature: test sliders functionality
  Background:
    Given user logged in the browser

  Scenario: logged user able to click on first slider
    When  click on first slider
    Then  confirm the user direct to the correct url

  Scenario: logged user able to click on second slider
    When  click on second slider
    Then  confirm the user navigate to the correct url