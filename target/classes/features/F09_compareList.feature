@smoke
Feature:compare list
  Scenario: Logged user could add different products to compare list
    Given User log-in with his valid information
    When User click on Add to compare-list
    Then Add to compare list done successful