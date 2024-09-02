Feature: create dashboard Module and Add Anomaly Detection widget

		@Login	
		Scenario: Login to Eco app
		Given User launch the browser
		When  User opens URL "https://staging.ecolibrium.io/" 
		And   User enters Username as "qa12" 
		And   User enters Password as "qa12" 
		And   Click on the Login 
		Then  Page Title should be "SmartSense"

 
 
 Scenario: Create dashboard and add Add Anomaly Detection widget successfully
 Given User is on Smartsense page and add dashboard as a "QA21"
 When User Add widget as "Anomaly Detection" then Verify after refresh preview widget is should be dispayed compulsory
 When Clone that dispayed "Anomaly Detection" widget it gets clone and after delete that cloned widget gets delete
 When User edit dispayed anomaly widget it gets edited and able to save changes in "Anomaly Detection" widget
Then Affter that delete created dashboard and user will get messg as "Dashboard Deleted"