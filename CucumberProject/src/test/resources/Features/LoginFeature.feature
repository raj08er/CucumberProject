Feature: Test The Login Functionlity Of OrangeHRM

  Scenario: Test The Valid Login
  
    Given User Is On LoginPage
    When User Enters Username and Password
    And Click On Login button
    Then User Should Land On The HomePage

@Smoke    
  Scenario: Test The Valid Login
  
    Given User Is On LoginPage
    When User Enters Username and Password
    And Click On Login button
    Then User Should Land On The HomePage
    