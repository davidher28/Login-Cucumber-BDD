Feature: User Login
  As a registered user
  I want to log in to the application
  So that I can access my account

  Scenario: Successful login
    Given I am a registered user with username "david" and password "password123"
    When I log in with username "david" and password "password123"
    Then I should be logged in

  Scenario: Invalid login
    Given I am a registered user with username "david" and password "password123"
    When I log in with username "david" and password "incorrectpassword"
    Then I should see an error message
