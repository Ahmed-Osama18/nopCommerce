@smoke
Feature: F04_Search | user could be able to search using product name
  Scenario Outline: user could be able to search using product name
    When user search using product <product_name> name
    Then user should be able to find items with product name
    Examples:
      |product_name  |
      |nike          |





