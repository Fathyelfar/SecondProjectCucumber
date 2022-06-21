@smoke
Feature: test search functionality
 Background:
   Given user logged into the website

  Scenario: Logged User could search for any product
    When  click in the search field and searched by the word mobiles
    Then  relative results appears confirm the url

  Scenario: Logged User could search by product name and model number
    When  click in the search field by product name then model number
    Then  relative results appears confirm url
