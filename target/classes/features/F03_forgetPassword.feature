@smoke
Feature: F03_forgetPassword | users could use forget password functionality to recover their accounts
  Scenario: users could use forget password functionality to recover their accounts
    Given Step 1 user go to login page
    And Step 2 user click on forget password
    When Step 3 user enter email address
    And Step 4 user click on recover button
    Then Step 5 message is displayed "Email with instructions has been sent to you"