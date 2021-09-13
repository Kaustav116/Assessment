Feature: Address Display in Application

  Scenario Outline: Testing validation of address in site
    Given Initialize the browser with Chrome again
    When Navigate to "https://www.marriott.com/default.mi" site again
    And Enter <CityName> of choice and Click on "Search" button
    Then Verify that address of 1st hotel displayed has correct city name
    And Close the browsers again
Examples:
|CityName |
|"Kolkata"|