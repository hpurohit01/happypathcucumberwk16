Feature: Happy path test

  As a user I should be able to complete positive path

  @regression
  Scenario: verify user is able to submit through the path
    Given I am on homepage
    When I click on next button
    And I enter first name "Max"
    And I enter last name "Murphy"
    And I click on next button on name page
    And I select file to upload
    And I click on next button on file upload page
    And I perform signature on signature page
    And I click on next button on signature page
    And I select date of birth
    And I click on next button on date of birth page
    And I select security question "Favorite school subject"
    And I enter answer of security question
    And I click on submit button on security question page
    Then I should see successful submission message "Your submission has been received!"