package stepdefinations;

import org.openqa.selenium.WebDriver;

import drivers.DriverFactory;
import io.cucumber.java.en.Given;
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
	    temp.clickOnCheckBoxAndTemplateName(templateName);
	}



}
