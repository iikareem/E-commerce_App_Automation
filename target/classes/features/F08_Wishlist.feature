@smoke
Feature:Wishlist
  Scenario: Logged user could add different products to Wishlist
    Given User login with his data
    When User clicks on Add tap to Wishlist
    Then success message is displayed
    And Add Done successful