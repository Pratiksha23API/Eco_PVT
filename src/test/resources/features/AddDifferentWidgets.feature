Feature: create dashboard Module

		@Login	
		Scenario: Login to Eco app
		Given User launch the browser
		When  User opens URL "https://staging.ecolibrium.io/" 
		And   User enters Username as "qa12" 
		And   User enters Password as "qa12" 
		And   Click on the Login 
		Then  Page Title should be "SmartSense"

 Scenario: Create dashboard and add different widget successfully
 Given User is on Smartsense page and add dashboard as a "QA321"
 When User Add widget as "Table" then Verify after refresh preview widget is should be dispayed compulsory
 When Clone it that dispayed the widget it gets clone successfully after that delete that clone widget
  When User Add widget as "Table" add below parameters
  |L1 L2 Voltage 1|Total KW|Cooling Tower Water Conductivity A|
  And  below sensors then Verify after refresh preview widget is should be dispayed compulsory
|QA12|sensor 9|sensor 1|
 #Map View
 #List View
 #RunHours
 #Table