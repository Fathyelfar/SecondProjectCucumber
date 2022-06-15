     @smoke
      Feature: testing follow us links functionality

      Background:
      Given User open the browser and log in

      Scenario: logged user able to click on facebook icon
        When  scroll down and click on facebook icon
        Then  switch the url to the childWindow and confirm it

        Scenario: logged user able to click on twitter icon
          When  scroll down and click on twitter icon
          Then  switch the url to the childWindow and confirm

        Scenario: logged user able to click on instagram icon
          When  scroll down and click on instagram icon
          Then  switch the url to the childWindow and confirm that

        Scenario: logged user able to click on linkedin icon
          When  scroll down and click on linkedin icon
          Then  switch the url to the childWindow then confirm







