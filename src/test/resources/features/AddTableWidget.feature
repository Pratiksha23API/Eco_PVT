Feature: create dashboard Module and Add Table widget

		@Login	
		Scenario: Login to Eco app
		Given User launch the browser
		When  User opens URL "https://staging.ecolibrium.io/" 
		And   User enters Username as "qa12" 
		And   User enters Password as "qa12" 
		And   Click on the Login 
		Then  Page Title should be "SmartSense"

 
 
 Scenario: Create dashboard and add Add Table widget successfully
 Given User is on Smartsense page and add dashboard as a "teat"
 When User Add widget as "Table" and add below parameters
 |L2 Current 1|
 And  add below sensors then Verify after refresh preview widget is should be dispayed compulsory
 |QA12|Accenture Test 1|
 When Clone that dispayed "Table" widget it gets clone and after delete that cloned widget gets delete
 When User edit that dispayed table widget it gets edited and able to save changes in "Table" widget
 Then Affter that delete created dashboard and user will get messg as "Dashboard Deleted"