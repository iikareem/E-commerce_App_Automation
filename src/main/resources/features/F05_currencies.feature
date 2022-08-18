@smoke
Feature: User could search home page products using Euro currency

  Scenario:User could switch Tht currency to Euro €
    Given user log and Navigate to Home
    When  User select euro currency
    Then  user can find euro currency € displayed in Home Page