@smoke
Feature:Add to Shopping cart
  Scenario: Logged user could add different products to Shopping cart
    Given User has login with his valid email and password
    When User clicks on Add to Shopping cart
    Then Add ToShopping cart done successful