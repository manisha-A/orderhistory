Feature: Update Personal Information
  In order to keep my information up to date
  As a registered user
  I want to update my personal information

  Scenario: Verify ordered item in order history
    Given the registered user "cucumberjvm" is logged in
    And user is on home page
    When user wants to buy "t-shirt"
    And user adds the first item to cart and checkout
    And user confirms the address
    And user confirms shipping option
    When user confirms the payment by check
    Then the order should complete
    And order reference should exist in My Orders
