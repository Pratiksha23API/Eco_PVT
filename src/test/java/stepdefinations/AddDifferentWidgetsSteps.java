package stepdefinations;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import drivers.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageclases.AddDifferentWidgets;

public class AddDifferentWidgetsSteps {
	
	public WebDriver driver = DriverFactory.getDriver();
	public AddDifferentWidgets widgets = new AddDifferentWidgets(DriverFactory.getDriver());
	
	@Given("User is on Smartsense page and add dashboard as a {string}")
	public void user_is_on_smartsense_page_and_add_dashboard_as_a(String dashboardName) throws Exception {

		boolean created =widgets.createNewDashboard(dashboardName);
		Assert.assertTrue(created, "dashboard is not created ");
	
	}

	@When("User Add widget as {string} then Verify after refresh preview widget is should be dispayed compulsory")
	public void user_add_widget_as_then_verify_after_refresh_preview_widget_is_should_be_dispayed_compulsory(String widgetName) throws Exception {

//	   widgets.addTable(widgetName);
	}

	@When("Clone it that dispayed the widget it gets clone successfully after that delete that clone widget")
	public void clone_it_that_dispayed_the_widget_it_gets_clone_successfully_after_that_delete_that_clone_widget() {
	}
	
	
	@When("User Add widget as {string} add below parameters")
	public void user_add_widget_as_add_below_parameters(String widgetTable, io.cucumber.datatable.DataTable dataTable) throws Exception {
		
	  widgets.addTable(widgetTable);
	  widgets.selectParametersforTableWidget(dataTable);
	}

	@When("below sensors then Verify after refresh preview widget is should be dispayed compulsory")
	public void below_sensors_then_verify_after_refresh_preview_widget_is_should_be_dispayed_compulsory(io.cucumber.datatable.DataTable dataTable) throws Exception {
		  widgets.selectSensorsforTableWidget(dataTable);
	
	}



}
