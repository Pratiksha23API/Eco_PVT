Feature: Test Activity Module

  @Login
  Scenario: Validate Activity created and viewed successfully
    Given User launch the browser
    #When User opens URL "https://staging.ecolibrium.io/"
    When User opens URL "https://smartsense.ecolibrium.io/"
    And User enters Username as "Mrinal.Patil"
    And User enters Password as "@Eco123456"
    And Click on the Login
    Then Page Title should be "SmartSense"
    Then User Click On Activity Menu
    When User Click on Add New Activity button
    And User enter "ActivTe" in Activity Name text field
    And User select "Planned" value from Activity Type dropdown
    And User select "NS-6" value from Sensor Name dropdown
    And User select "Default Action" value from Standard Name dropdown
    And User select "All Assset" value from Item Name dropdown
    And User select "Default Action" value from Action Taken dropdown
    And User enter "Test Description" value in Description Text field
    And User select "25" for Date of Activity Planned
    And User enter "Test Result" value in Observation Result Text field
    And User select "25" for Date of Activity Executed
    And click on Create Activity button
    
    Then click on Activity Menu
    And click on Logs button
    Then Click on Activity created on log page
    And Edit Activity Name with "UpdateActivity" on log page
    And Click on Update Activity on log page
    Then Click on Activity updated on log page
    And Verify Activity Name "UpdateActivity" updated on log page
    
    Then click on Activity Menu Again
    And click on Summary button
    Then click on export button for download summary
   # And verify excel file downloaded of summary
   Then Verify  downloaded file is avaliable in project folder with "EventActivitySummaryReport.xlsx" name
  