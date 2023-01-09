@smoke
Feature: F12_SuccessfulOrder | end to end order scenario
  Scenario: end to end order scenario
    Given Step 1 user go to login page
    And Step 2 user login with "valid" "test@example.com" and "P@ssw0rd"
    And Step 3 user press on login button
    Then Step 4 user login to the system successfully
    When user click on add to cart
    And user click on shopping cart
    And user click on accept terms
    And user click on checkout button
    And fill billing address data
    And choose shipping method
    And choose payment method
    And choose payment info
    And Confirm Order
    Then Order has been successfully processed