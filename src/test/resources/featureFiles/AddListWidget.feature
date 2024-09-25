Feature: create dashboard Module and Add ListView widget

		@Login	
		Scenario: Login to Eco app
		Given User launch the browser
		When  User opens URL "https://staging.ecolibrium.io/" 
		And   User enters Username as "qa12" 
		And   User enters Password as "qa12" 
		And   Click on the Login 
		Then  Page Title should be "SmartSense"

 
 
 Scenario: Create dashboard and add Add ListView widget successfully
 Given User is on Smartsense page and add dashboard as a "tq13"
 When User Add widget as "List View" then Verify after refresh preview widget is should be dispayed compulsory
 Then Affter that delete created dashboard and user will get messg as "Dashboard Deleted"