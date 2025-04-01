Feature: feature to test google search functionality

  Scenario: Validate google search is working

    Given browser is open
    And user is on google search
    When user enter a text in search box
    And hits enter
    Then user navigated to search results