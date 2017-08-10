Feature: Order an item from product catalog
  In order to avoid store visit
  As a registered user
  I want to order an item online

  Scenario: Updating First Name for my account
    Given the registered user "cucumberjvm" is logged in
    When the user views her personal information
    And user updates below information:
      |First name| Theawesometester |
    Then user's first name is updated as "Theawesometester"
