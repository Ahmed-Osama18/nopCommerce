@smoke
Feature: F11_ProductComparison | Success message appears when clicking on compare button
  Scenario: success message appears in green background when user click on item compare
    When user click on compare button
    Then comparison success message is displayed
    And background color is green