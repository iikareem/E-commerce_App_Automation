@smoke
Feature: Change currency

  Scenario:User could switch Tht currency to Euro €
    Given user log and Navigate to Home
    When  User select euro currency
    Then  products prices should be in €
