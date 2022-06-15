@smoke
Feature: test adding to cart functionality
  Scenario: Logged user could add different products to Shopping cart
    Given log in to the website
    When adding many products to the Cart
    Then remove button is displayed
