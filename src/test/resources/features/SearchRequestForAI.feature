
Feature: Search Functionality on Submit Request Page

  Scenario: Verify Navigation and Search Results on the Submit Request Page
    Given the user navigates to main page
    When the user locates and clicks the Hamburger Menu
    And the user clicks on the "Help" button
    Then the Help page should be displayed
    When the user clicks on the Contact Support button
    Then the user should be redirected to the Submit Request page
    And the Submit Request form should be displayed
    When the user locates the search field on the Submit Request page
    When the user enters "AI" in the search field and presses the Enter key
    Then the search results should return exactly "15" articles