package stepdefinations;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import drivers.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageclases.WidgetWithGraphType;

public class WidgetWithGraphTypeStep {

	public WebDriver driver = DriverFactory.getDriver();
	public WidgetWithGraphType grapTyp = new WidgetWithGraphType(DriverFactory.getDriver());


	@Given("User is on Smartsense page and add dashboard with name as {string}")
	public void user_is_on_smartsense_page_and_add_dashboard_with_name_as(String dashbordName) throws Exception {
		boolean createdNotifnDisplay =grapTyp.createNewDashboard(dashbordName);
		Assert.assertTrue(createdNotifnDisplay, "dashboard not created succefully");
	}

	@When("User Add widget with graph type as {string} then Verify after refresh preview widget is dispayed compulsory as per type")
	public void user_add_widget_with_graph_type_as_then_verify_after_refresh_preview_widget_is_dispayed_compulsory_as_per_type(String graphType) throws Exception {

		grapTyp.addWidgetWithGraphType(graphType);
		grapTyp.selectLocatnParameter();
		grapTyp.selectColour();
		grapTyp.clickOnRefreshPreview();
		boolean widgetDisplayed =grapTyp.verifyWidgetDisplayed();
		Assert.assertTrue(widgetDisplayed,"widget not display successfully");
	}

	@Then("After click on add widget verify user will get the messg as {string}")
	public void after_click_on_add_widget_verify_user_will_get_the_messg_as(String string) throws Exception {

		String notificatn =grapTyp.verifyWidgetaddSuccefully();
		Assert.assertEquals(notificatn, "Widget Added");

	}


	@When("User Add widget with graph type as {string} then Verify arc after refresh preview widget is dispayed compulsory as per type")
	public void user_add_widget_with_graph_type_as_then_verify_arc_after_refresh_preview_widget_is_dispayed_compulsory_as_per_type(String arcgrpType) throws Exception {
		grapTyp.addWidgetWithGraphType(arcgrpType);
		grapTyp.selectLocatnParameter();
		grapTyp.clickOnRefreshPreview();


	}

	@When("User Add widget with graph type as {string} and select tag  then Verify after refresh preview widget is dispayed compulsory as per type")
	public void user_add_widget_with_graph_type_as_and_select_tag_then_verify_after_refresh_preview_widget_is_dispayed_compulsory_as_per_type(String grapTypewithTag) throws Exception {

		grapTyp.addWidgetWithGraphType(grapTypewithTag);
		grapTyp.clickOnRefreshPreview();

	}

}
