Feature: Navigation to protected page without login

  Scenario: User tries to access a protected page without being logged in
    Given I am a user who has not logged in
    When I try to navigate to the protected page URL
    Then I should be redirected to the login page