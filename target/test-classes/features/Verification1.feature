Feature: Text Display in Application

  Scenario: Testing validation of text in List
    Given Initialize the browser with Chrome
    When Navigate to "https://www.marriott.com/default.mi" site
    Then Click on "Our Brands" module and verify that "JW Marriot" is listed in list
    And Close the browsers
