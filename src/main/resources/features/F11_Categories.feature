@smoke
Feature:different Categories
  Scenario:Logged user could select different Categories
    Given User has login with his valid email and pass
    When Select the Category
    Then Open the sub-Category
    And Open page done successful