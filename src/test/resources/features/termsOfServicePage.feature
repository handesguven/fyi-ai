@wip
Feature: Verify Terms of Service Page Copyright Text

  Scenario: Verify that the Terms of Service page contains the correct copyright text
    Given the user navigates to main page
    When the user locates and clicks the Hamburger Menu
    And the user clicks the "Terms of Service" link
    Then the title of the page should be "Terms of Service"
    When the user scrolls to the bottom of the page
    Then the copyright text "©2024 FYI.FYI, Inc." should be displayed correctly
