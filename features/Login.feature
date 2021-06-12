Feature: Login
  @sanity
  Scenario: Login successful with valid credentials
  Given User Launch Browser
  And opens URL "https://demo.opencart.com/"
  When User navigate to MyAccount Menu
  And click on Login
  And User enters Email as "pavanoltraining@gmail.com" and Password as "test123"
  And Click on Login button
  Then User navigates to MyAccount Page
