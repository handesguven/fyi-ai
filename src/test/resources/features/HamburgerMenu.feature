
Feature: Hamburger Menu Options Verification

  Scenario: Verify that the hamburger menu provides the correct user selection options
    Given the user navigates to main page
    When the user locates and clicks the Hamburger Menu
    Then the following menu options should be displayed:
      | Home             |
      | Help             |
      | About Us         |
      | The Team         |
      | Press            |
      | Terms Of Service |
      | Privacy Policy   |