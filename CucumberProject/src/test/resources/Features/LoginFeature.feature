Feature: Test The Login Functionlity Of OrangeHRM

# Scenario: Test The Valid Login        
# Parameterization without Example Keyword  
#    Given User Is On LoginPage
#    When user enters "admin" and "admin123"
#    And Click On Login button
#    Then User Should Land On The HomePage

#  Scenario Outline: Test The Valid Login
# Data driven testing in cucumber using Scenario Outline  
#    Given User Is On LoginPage
#    When user enters <username> and <password>
#    And Click On Login button
#    Then User Should Land On The HomePage
#Examples:
#|username|password |   
#|admin   |admin123 |
#|admin1  |admin1234| 

 Scenario: Test The Valid Login using DataTable       
# Parameterization using Data Table  
    Given User Is On LoginPage
    When user enters credentials using DataTable
    |admin   |admin123 |
    And Click On Login button
    Then User Should Land On The HomePage
