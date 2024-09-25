Feature: create dashboard Module and Add RunHours widget

		@Login	
		Scenario: Login to Eco app
		Given User launch the browser
#		When  User opens URL "https://staging.ecolibrium.io/" 
		When  User opens URL "https://smartsense.ecolibrium.io/" 
		And   User enters Username as "qa12" 
		And   User enters Password as "qa12" 
		And   Click on the Login 
		Then  Page Title should be "SmartSense"

 
 
 Scenario: Create dashboard and add Add RunHours widget successfully
 Given User is on Smartsense page and add dashboard as a "dash"
 When User Add widget as "RunHours" then Verify after refresh preview widget is should be dispayed compulsory
 When Clone that dispayed "RunHours" widget it gets clone and after delete that cloned widget gets delete
 Then Affter that delete created dashboard and user will get messg as "Dashboard Deleted"