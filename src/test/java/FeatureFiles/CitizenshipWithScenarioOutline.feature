Feature: Citizenship Functionality

  Scenario Outline:

    Background:
      Given Navigate to Campus
      And Enter username and password
      And Click on Login Button

  Scenario Outline: Create a Citizenship
    And Navigate to Citizenship page
    And Click on add button
    Then Enter "<CitizenshipName>" as citizenship name and "<CitizenshipShortName>" as short name
    When Click on save button
    Then Success message should be displayed

    Examples: Data for Create a Citizenship scenario
      |CitizenshipName|CitizenshipShortName|
      |USA1           |U1                  |
      |USA2           |U2                  |
      |USA3           |U3                  |
      |USA4           |U4                  |

  Scenario Outline: Delete a Citizenship
    And Search for the citizenship with the name "<CitizenshipName>" and shortname "<CitizenshipShortName>"
    When Delete citizenship
    Then Success message should be displayed
    Examples: Data for Delete Citizenship scenario
      |CitizenshipName|CitizenshipShortName|
      |USA1           |U1                  |
      |USA2           |U2                  |
      |USA3           |U3                  |
      |USA4           |U4                  |