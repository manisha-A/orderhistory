Feature: Order an item from product catalog
  In order to avoid store visit
  As a registered user
  I want to order an item online

  Scenario: Verify ordered item in order history
    Given the registered user "testuser" is logged in
    When the user views her personal information
    And user updates below information:
      |First name| theawesometester |
    Then user's first name is updated as "theawesometester"
