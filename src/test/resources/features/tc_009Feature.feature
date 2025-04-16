Feature: Validate password change function

  Scenario: User changes password successfully
    Given I am logged in with valid credentials
    When I navigate to the 'Account Settings' section
    And I enter the current password and a new password
    And I press the 'Save Changes' button
    Then I should see a message 'Password updated successfully'