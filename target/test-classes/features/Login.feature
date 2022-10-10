Feature: Login
  Author: Brian

  Background:
    Given User is on login page
    Then verify login button is present
    Then Verify user is on login page

    @Smoke
  Scenario: Verify user can sign in with valid credentials
    When User enters corresponding username
    And User enters corresponding password
    Then User clicks on login button
    Then Verify login is successful

  Scenario: Verify if user can press hit enter on keyboard to login after inputting all correct information
    When User enters corresponding username
    And User enters corresponding password and user hits enter
    Then Verify login is successful

  Scenario: Verify if password is encrypted
    When User enters corresponding password
    Then Verify password is encrypted

  Scenario: Verify login fails if user enters email in password field and password in email field
    When User enters corresponding username in password field
    And User enters corresponding password in username field
    Then User clicks on login button
    Then Verify login is unsuccessful

  Scenario Outline: Verify user is not able to login with invalid credentials
    When User enters invalid username "<invalidUsername>" and password "<invalidPassword>"
    Then User clicks on login button
    Then Verify login is unsuccessful
    Examples:
      | invalidUsername | invalidPassword |
      |                 | A123213         |
      | adjsaj          |                 |
      |                 |                 |
      | AAA             | dasd            |
      | @@@             | @!$@!$          |

  Scenario: Verify user can logout and then log back in
    When User enters corresponding username
    And User enters corresponding password
    Then User clicks on login button
    Then Verify login is successful
    And User click on display name
    And User clicks on logout button
    Then Verify logout is successful
    Then User clicks on login link
    When User enters corresponding username
    And User enters corresponding password
    Then User clicks on login button
    Then Verify login is successful


#  Scenario: Verify if user can login after changing password
#    When User enters corresponding username
#    And User enters corresponding password
#    Then User clicks on login button
#    Then Verify login is successful
#    And User click on display name
#    And User clicks on account settings
#    And User enters current password
#    And User enters new password
#    And User enters confirm new password
#    Then User clicks save changes
#    And User click on display name
#    Then User clicks on logout button
#    Then Verify logout is successful
#    Then User clicks on login link
#    And User enters corresponding username
#    And User enters new password
#    Then User clicks on login button
#    Then Verify login is successful