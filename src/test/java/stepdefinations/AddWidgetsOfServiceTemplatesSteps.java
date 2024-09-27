package stepdefinations;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import drivers.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageclases.AddWidgetsOfServiceTemplates;

public class AddWidgetsOfServiceTemplatesSteps {

	public WebDriver driver = DriverFactory.getDriver();
	public AddWidgetsOfServiceTemplates temp = new AddWidgetsOfServiceTemplates(DriverFactory.getDriver());

	@Given("User is on Smartsense page and Add service templates as {string}")
	public void user_is_on_smartsense_page_and_add_service_templates_as(String serviceName) throws Exception {
		temp.createServiceTemplates(serviceName);
	}

	@Given("Click on checkBox and template whose name as {string}")
	public void click_on_check_box_and_template_whose_name_as(String templateName) throws Exception {
		boolean tempDisplay=temp.clickOnCheckBoxAndTemplateName(templateName);
		Assert.assertTrue(tempDisplay);
	}

	@When("User click on options user will able to add widget as {string} and verify widget added successfully")
	public void user_click_on_options_user_will_able_to_add_widget_as_and_verify_widget_added_successfully(String widgetName) throws Exception {
		String addNotification =temp.addWidgetOfTemplateService(widgetName);
		Assert.assertEquals(addNotification, "Widget Added");
	}

	@When("User edit the dashboard user will clone and delete cloned widget successfully")
	public void user_edit_the_dashboard_user_will_clone_and_delete_cloned_widget_successfully() throws Exception {
		temp.EditDashbordThenCloneAndDeleteClonedWorkplaceGraphWidget();
	}

	@When("User add new widget as {string} then verify widget added successfully")
	public void user_add_new_widget_as_then_verify_widget_added_successfully(String widgetName) throws Exception {
		String addNotification =temp.addWidgetOfTemplateService(widgetName);
		Assert.assertEquals(addNotification, "Widget Added");
	}

	@When("Clone dispayed {string} widget it gets clone and after delete that cloned widget it gets delete")
	public void clone_dispayed_widget_it_gets_clone_and_after_delete_that_cloned_widget_it_gets_delete(String widgetName) throws Exception {
		String deleteNotification =temp.copyAndDeleteCopiedWidget(widgetName);
		Assert.assertEquals(deleteNotification, "Widget Deleted");

	}

	@When("User clone Parameter Tracking widget it gets clone and after delete that cloned widget succefully")
	public void user_clone_parameter_tracking_widget_it_gets_clone_and_after_delete_that_cloned_widget_succefully() throws Exception {
		String deleteNotification =temp.copyAndDeleteCopiedParameterTrackingWidget();
		Assert.assertEquals(deleteNotification, "Widget Deleted");
	}
	
	







}
