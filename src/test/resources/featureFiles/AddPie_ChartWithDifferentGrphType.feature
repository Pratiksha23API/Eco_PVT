Feature: Add widgets with different graph-Types

		@Login	
		Scenario: Login to Eco app
		Given User launch the browser
#		When  User opens URL "https://staging.ecolibrium.io/" 
		When  User opens URL "https://smartsense.ecolibrium.io/" 
		And   User enters Username as "qa12" 
		And   User enters Password as "qa12" 
		And   Click on the Login 
		Then  Page Title should be "SmartSense"
		
Scenario:  Create dashboard and add Pie_chart widget with different Graph-type
 Given User is on Smartsense page and add dashboard with name as "dash1"
 When User Add widget with graph type as "Pie Chart" then Verify after refresh preview widget is dispayed compulsory as per type
 Then After click on add widget verify user will get the messg as "Widget Added"
 When User Add widget with graph type as "Radial Chart" then Verify after refresh preview widget is dispayed compulsory as per type
 Then After click on add widget verify user will get the messg as "Widget Added"
 When User Add widget with graph type as "Arc Score" then Verify arc after refresh preview widget is dispayed compulsory as per type
 Then After click on add widget verify user will get the messg as "Widget Added"
 When User Add widget with graph type as "YoY Visualization" and select tag  then Verify after refresh preview widget is dispayed compulsory as per type
 Then After click on add widget verify user will get the messg as "Widget Added"


