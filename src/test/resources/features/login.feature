Feature: Login

  @positive
  Scenario: Successful login
    Given User is on HomePage
    When User clicks on Login icon
#    Then User verifies Login form is displayed
    And User enters valid data
    And User clicks on Anmelden button
    And User clicks on User icon
    Then User verifies his name


  @negative
  Scenario: Login wint wrong password
    Given User is on HomePage
    When User clicks on Login icon
    And User enters wrong Login and valid password
      | email   | password   |
      | <email> | <password> |
    And User clicks on Anmelden button
    Then User verifies his wrong email

    Examples:
      | email               | paswword  |
      | Cheburek@@gmail.com | Cheb123!! |
      | cHEBUREK@gmail.com  | Cheb123!! |
      | Cheburek@gmqil.com  | Cheb123!! |
