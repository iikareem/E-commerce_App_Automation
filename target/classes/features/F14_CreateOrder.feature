@smoke
Feature:Create Order
  Scenario:Create successful Order
    Given User log in with valid email
    And User click on Add items to Shopping cart
    And Navigate to shopping cart
    And Agree with the terms of service
    When User click checkout button
    And User enter valid data to Billing address section
    And User enter valid data to Shipping method section
    And User enter valid data to Payment method section
    And Payment Information Section
    Then User Confirm Order
    And The order done successful
