@smoke
Feature: F09_AddToCart | Success message appears when clicking on add to cart button
  Scenario: success message appears in green background when user add item to cart
    When user click on add to cart
    Then added success message is displayed
    And background color is green