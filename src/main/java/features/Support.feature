Feature: Wire Support Page FAQ Search

  Scenario: In support web page relevant results should be displayed based on user FAQ search
    Given User launch chrome browser
    When User opens wire support page URL "https://support.wire.com/hc/en-us"
    Then Support page title should be present
    When Search a question with keyword "security"
    Then Search results should be displayed
    And Click on result link
    Then Article should be displayed
    When Search another question with keyword "payment"
    Then No Results found should be displayed
    And End the session

  Scenario: Verify support page elements are present
    Given User launch chrome browser
    When User opens wire support page URL "https://support.wire.com/hc/en-us"
    Then Support page title should be present
    Then Verify support page categories
    Then Click on header sign in link
    And End the session
