Feature: OrangeHrm login page

  @Sanity
  Scenario: In order to verify login to facebook
    Given user navigate to facebook website
    When user validates the homepage title
    Then user entered valid username
    And user entered valid password
    Then user shouldbe successfully logged in

  @Smoke
  Scenario: In order to verify login to facebook as Invalid user
    Given user navigate to facebook website
    When user validates the homepage title
    Then user entered invalid username
    And user entered invalid password
    Then user shouldnot successfully logged in

  @Sanity
  Scenario: In order to verify login to facebook as Valid and Invalid user
    Given user navigate to facebook website
    When user validates the homepage title
    Then user entered invalid username
    And user entered invalid password
    Then user shouldnot successfully logged in