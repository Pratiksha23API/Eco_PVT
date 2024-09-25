Feature: Create Service templates and Add widget

		@Login	
		Scenario: Login to Eco app
		Given User launch the browser
		When  User opens URL "https://smartsense.ecolibrium.io/" 
		And   User enters Username as "Mrinal.Patil" 
		And   User enters Password as "@Eco123456" 
		And   Click on the Login 
		Then  Page Title should be "SmartSense"

	Scenario: Create Service templates and Add,Clone & Delete different cloned widgets successfully
   Given User is on Smartsense page and Add service templates as "QADemo"
   And Click on checkBox and template whose name as "QADemo"
   When User click on options user will able to add widget as "Workplace Graph" and verify widget added successfully
   When User edit the dashboard user will clone and delete cloned widget successfully
   When User add new widget as "Workplace Overview" then verify widget added successfully
   When Clone dispayed "Workplace Overview" widget it gets clone and after delete that cloned widget it gets delete
   When User add new widget as "Weather Forecast" then verify widget added successfully
   When Clone dispayed "Weather Forecast" widget it gets clone and after delete that cloned widget it gets delete
   When User add new widget as "Parameter Tracking" then verify widget added successfully
   When User clone Parameter Tracking widget it gets clone and after delete that cloned widget succefully