Feature: create dashboard Module and Add MapView widget

		@Login	
		Scenario: Login to Eco app
		Given User launch the browser
		When  User opens URL "https://staging.ecolibrium.io/" 
		And   User enters Username as "qa12" 
		And   User enters Password as "qa12" 
		And   Click on the Login 
		Then  Page Title should be "SmartSense"

 
 
 Scenario: Create dashboard and add Add MapView widget successfully
 Given User is on Smartsense page and add dashboard as a "tq12"
 When User Add widget as "Map View" then Verify after refresh preview widget is should be dispayed compulsory
 When Clone that dispayed "Map View" widget it gets clone and after delete that cloned widget gets delete
 Then Affter that delete created dashboard and user will get messg as "Dashboard Deleted"