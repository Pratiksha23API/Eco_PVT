package stepdefinations;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import drivers.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageclases.AddDifferentWidgets;

public class AddDifferentWidgetsSteps {

	public WebDriver driver = DriverFactory.getDriver();
	public AddDifferentWidgets widgets = new AddDifferentWidgets(DriverFactory.getDriver());


	@Given("User is on Smartsense page and add dashboard as a {string}")
	public void user_is_on_smartsense_page_and_add_dashboard_as_a(String dashboardName) throws Exception {

		String created =widgets.createNewDashboard(dashboardName);
		Assert.assertEquals(created, "Dashboard created");

	}

	@When("User Add widget as {string} then Verify after refresh preview widget is should be dispayed compulsory")
	public void user_add_widget_as_then_verify_after_refresh_preview_widget_is_should_be_dispayed_compulsory(String widgetName) throws Exception {

		String addNotification =widgets.addWidget(widgetName);
		Assert.assertEquals(addNotification, "Widget Added");
	}

	@When("Clone that dispayed {string} widget it gets clone and after delete that cloned widget gets delete")
	public void clone_that_dispayed_widget_it_gets_clone_and_after_delete_that_cloned_widget_gets_delete(String widgetName) throws Exception {
		String deleteNotification =widgets.copyAndDeleteCopiedWidget(widgetName);
		Assert.assertEquals(deleteNotification, "Widget Deleted");

	}

	@When("User edit dispayed anomaly widget it gets edited and able to save changes in {string} widget")
	public void user_edit_dispayed_anomaly_widget_it_gets_edited_and_able_to_save_changes_in_widget(String widgetName) throws Exception {
		String updatedNotification=widgets.editAnomlyWidgetAndSaveChanges(widgetName);
		Assert.assertEquals(updatedNotification, "Widget Updated");
	}

	@When("User Add widget as {string} and add below parameters")
	public void user_add_widget_as_and_add_below_parameters(String widgetTable, io.cucumber.datatable.DataTable dataTable) throws Exception {
		widgets.addTable(widgetTable);
		widgets.selectParametersforTableWidget(dataTable);
		
	}
	//
	@When("add below sensors then Verify after refresh preview widget is should be dispayed compulsory")
	public void add_below_sensors_then_verify_after_refresh_preview_widget_is_should_be_dispayed_compulsory(io.cucumber.datatable.DataTable dataTable) throws Exception {
		//
		widgets.selectSensorsforTableWidget(dataTable);
		String noticicatn=widgets.clickOnRefreshAndAddWidget();
		Assert.assertEquals(noticicatn, "Widget Added");
	}



	@When("User edit that dispayed table widget it gets edited and able to save changes in {string} widget")
	public void user_edit_that_dispayed_table_widget_it_gets_edited_and_able_to_save_changes_in_widget(String widgetName) throws Exception {
		String updateTableWidget=widgets.editTableWidget(widgetName);
		Assert.assertEquals(updateTableWidget, "Widget Updated");
	}

	@Then("Affter that delete created dashboard and user will get messg as {string}")
	public void affter_that_delete_created_dashboard_and_user_will_get_messg_as(String deleteMessg) throws Exception {
		String deleteNotfn = widgets.deleteCreatedDashboard();
		boolean isPresent = deleteNotfn.contains(deleteMessg);
		Assert.assertTrue(isPresent);
	}





}
