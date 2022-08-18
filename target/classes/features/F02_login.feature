@smoke
Feature: Login
  Scenario:User could log in with valid email and password
    Given  User at home page and click login Tab
    When User enter his valid data
    And User click log in button
    Then Back to home page done
