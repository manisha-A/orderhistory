Feature: Update Personal Information
  In order to keep my information up to date
  As a registered user
  I want to update my personal information

  Scenario: Updating First Name for my account
    Given the registered user "testuser" is logged in
    And user is on home page
    When user wants to buy t-shirt
    And user adds the item to cart and checkout
    And user confirms the address
    When user confirms the payment by check
    Then the order should complete
    And order reference should exist in My Orders
