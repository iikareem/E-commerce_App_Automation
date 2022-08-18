@smoke
Feature: Reset Pasword
  Scenario:User could reset his/her password successfully
    Given User at  home page and click to log in
    And User clicks on forget password
    When User enter his email address
    And user click Recover Password Button
    Then The Success message is displayed
