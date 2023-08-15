Feature: Fee Functionality

  Background:
    Given Navigate to Campus
    And Enter username and password
    And Click on Login Button
    And Navigate to Fees page


  @Smoke
  Scenario: Create a Fee
    And Click on add button
    And Fill the add fee form
      | Batch 8 Fee |
      | b8          |
      | bt8         |
      | 54          |
    When Click on save button
    Then Success message should be displayed
