Feature: OrangeHrm login page

  @Smoke
  Scenario Outline: Login with valid username and password
    Given I launch the chrome browser
    When when enter the URL "https://opensource-demo.orangehrmlive.com/"
    And Enter valid username "<username>" and valid password "<password>"
    Then click on Login button
    And close browser

    Examples:
      | username    | password    |
      | Admin       | admin123    |
      | kavit       | kavit123    |
      | sanjay      | sanjay123   |