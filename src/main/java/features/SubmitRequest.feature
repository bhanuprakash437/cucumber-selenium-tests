Feature: Wire Submit a request page using contact form

  Scenario: User should be able to select issue and submit a request
    Given User launch chrome browser
    When User opens wire support page URL "https://support.wire.com/hc/en-us"
    Then Support page title should be present
    When Click on header menu submit request link
    Then Submit request page should be displayed
    When Select an issue from dropdown menu
    Then Provide all the data in input fields
    And Upload a file
    Then Verify file is uploaded
    And Click on submit request button
    And End the session

  Scenario: Verify search FAQ functionality in submit request page
    Given User launch chrome browser
    When User opens wire support page URL "https://support.wire.com/hc/en-us"
    Then Support page title should be present
    When Click on header menu submit request link
    Then Submit request page should be displayed
    Then Search a question with keyword "product"
    Then Relevant search results should be displayed
    And End the session
