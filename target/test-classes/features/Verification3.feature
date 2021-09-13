Feature: Text Display in Application

  Scenario: Testing validation of text in site
    Given Initialize the browser with Chrome once again
    When Navigate to "https://www.marriott.com/default.mi" site once again
    And Click on "About Marriot Bonvoy" module and click on "Member Benefits" column
    Then Verify that "Mobile Check-In and Mobile Key" are present in Benefits page.
    And Close the browsers once again
