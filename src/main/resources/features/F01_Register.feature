@smoke
Feature: Registartion
  Scenario:guest user could register with valid data successfully
    Given User at home page and click to register tab
    And User enter his valid data to complete register
    And User enter his valid data to Company section
    And User enter his valid Password
    And User clicks on register button
    Then The Registartion done successfully
