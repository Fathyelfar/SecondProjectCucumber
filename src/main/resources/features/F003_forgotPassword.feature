@smoke
Feature: test resetPassword functionality
  Scenario: User could reset his/her password successfully
    Given launch the browser and click sign in
    When  click the link of forgot your password
    Then  success message appear
