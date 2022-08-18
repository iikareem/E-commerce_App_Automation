@smoke
Feature: search
  Scenario:Logged User could search for any product
     Given  Log in successful
     And User enter any product in search field
     When User click on search button
     Then Search has done successful