
Feature: Navigation to Submit Request Page via Help Menu

  Scenario: Verify that the "Contact Support" button redirects the user to the "Submit Request" page
    Given the user navigates to main page
    When the user locates and clicks the Hamburger Menu
    And the user clicks on the "Help" button
    Then the Help page should be displayed
    When the user clicks on the Contact Support button
    Then the user should be redirected to the Submit Request page
    And the Submit Request form should be displayed