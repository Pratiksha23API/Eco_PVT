package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

				
				
		
		features = {"src\\test\\resources\\features\\AddDifferentWidgets.feature"},
//features= {"C:\\Users\\LENOVO\\git\\repository2\\Eco_PVT_LTD\\src\\test\\resources\\features\\AddWidgetsWithGraphType.feature"},
		glue= {"stepdefinations"},
		dryRun= true,
		monochrome=true,
		//				tags={"@tag2" "@Login"},
		//		plugin = {"pretty"}

		plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)

public class SmartSenseRunner extends AbstractTestNGCucumberTests
{
	/* This class will be Empty*/

}
