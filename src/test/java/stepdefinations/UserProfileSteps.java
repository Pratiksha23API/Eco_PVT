package stepdefinations;

import java.util.ArrayList;
import java.util.List;
import org.testng.Assert;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.PublicEncryptionKey;
import org.openqa.selenium.WebDriver;
import drivers.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import net.bytebuddy.asm.Advice.This;
import pageclases.UserProfile;

public class UserProfileSteps {

	public WebDriver driver = DriverFactory.getDriver();
	public UserProfile uP = new UserProfile(DriverFactory.getDriver());
	public List<String> details = new ArrayList<String>();
	public List<String> editedDetails = new ArrayList<String>();

	@When("User click on the user profile button")
	public void user_click_on_the_user_profile_button() {
		uP.clickOnMyProfileButton();

	}

	@Then("User cliks on user name button")
	public void user_cliks_on_user_name_button() {
		uP.clickOnuserNameButton();
	}

	@Then("User wait for {int} seconds")
	public void user_wait_for_seconds(Integer time) {
		try {
			Thread.sleep(time * 1000);
		} catch (Exception e) {

		}
	}

	@Then("User cliks on Edit profile details button")
	public void User_cliks_on_Edit_profile_details_button() {
		uP.User_cliks_on_Edit_profile_details_button();
	}

	@And("Get user {string} details")
	public void Get_user_details(String type) {
		if (type.equalsIgnoreCase("Edited")) {
			editedDetails = uP.Get_user_details();
			System.out.println(editedDetails);
		} else {
			details = uP.Get_user_details();
			System.out.println(details);
		}
	}

	@And("User Update Name As {string}")
	public void UserEntersUserName(String name) {
		uP.UserEntersUserName(name);
	}

	@And("User Update Email As {string}")
	public void UserEntersUserEmail(String email) {
		uP.UserEntersUserEmail(email);
	}

	@And("User Update Contact Number As {string}")
	public void UserEntersUserContactNumber(String number) {
		uP.UserEntersUserContactNumber(number);
	}

	@Then("User clicks on Number Format dropdown")
	public void userCliksOnNumbaerFormatDropdown() {
		uP.userCliksOnNumbaerFormatDropdown();
	}

	@And("User verify {string} bellow options should be displayed")
	public void numberFormatDropdownShouldBeDisplayedWithBelowOptions(String dropdown, DataTable table) {
		List<String> expectedOptions = table.asList();
		System.out.println("Expected options are : - " + expectedOptions);
		List actualOptions = uP.verifyNumberFormatDropdown(dropdown);
		Assert.assertEquals(expectedOptions, actualOptions);
	}
	
//missing step	//
	//
	@Then("User click on numberformat and selects {string} value from dropdown")
	public void user_click_on_numberformat_and_selects_value_from_dropdown(String numFormatValue) throws Exception {
       uP.selectValueFromNumberFormatDrpDown(numFormatValue);
	}

	@Then("User click on delivery mode and selects {string} velue from dropdown")
	public void user_click_on_delivery_mode_and_selects_velue_from_dropdown(String deliveryModeValue) throws Exception {
	uP.selectValueFromDeliveryModeDrpDown(deliveryModeValue);
	
	}

	@Then("User click on dashboard layout and selects {string} velue from dropdown")
	public void user_click_on_dashboard_layout_and_selects_velue_from_dropdown(String DashValue) {
	uP.selectValueFromDashBoardLayoutDrpDown(DashValue);
	}

	
	//

	@Then("User clicks on Delivery Mode dropdown")
	public void userCliksOnDeliveryModeDropdown() {
		uP.userCliksOnDeliveryModeDropdown();
	}

	@Then("User clicks on Dashboard Layout dropdown")
	public void userCliksOnDashboardLayoutDropdown() {
		uP.userCliksOnDashboardLayoutDropdown();
	}

	@And("User selects {string} velue from dropdown")
	public void userSelectsVelueFromDropdown(String value) {
		uP.userSelectsVelueFromDropdown(value);
	}

	@Then("User clicks on update profile details button")
	public void userClicksOnUpdateProfileDetailsButton() throws Exception {
		uP.userClicksOnUpdateProfileDetailsButton();
	}

	@And("User verify Edited details should be displayed as bellow")
	public void userVerifyEditedDetials(DataTable table) {
		List<String> expectedOptions = table.asList();
		System.out.println("Expected options are : - " + expectedOptions);
		Assert.assertEquals(expectedOptions, this.editedDetails);
	}
	@Then("User update edited fields") 
	public void userUpdateEditedFields () {
		uP.UserEntersUserName(details.get(0));
		uP.UserEntersUserContactNumber(details.get(2));
		uP.userCliksOnNumbaerFormatDropdown();
		uP.userSelectsVelueFromDropdown(details.get(3));
		uP.userCliksOnDeliveryModeDropdown();
		uP.userSelectsVelueFromDropdown(details.get(4));
		uP.userCliksOnDashboardLayoutDropdown();
		uP.userSelectsVelueFromDropdown(details.get(5));
	}
	
	@When("User try  to edit name as {string} without space Then verify user should get notification as {string}")
	public void user_try_to_edit_name_as_without_space_then_verify_user_should_get_notification_as(String name, String notification) throws Exception {
		uP.UserEntersUserName(name);
		uP.userClicksOnUpdateProfileDetailsButton();
		String messg =uP.getNotification();
		Assert.assertEquals(messg, notification);
	}
	
	@When("user enter name as per requirement i.e with one space as {string} it update successfully")
	public void user_enter_name_as_per_requirement_i_e_with_one_space_as_it_update_successfully(String name) throws Exception {
		uP.UserEntersUserName(name);
		uP.userClicksOnUpdateProfileDetailsButton();
	}
	
	@When("user try to edit contatNumber with less than {int} digit as {string} Then verify user should get notification as {string}")
	public void user_try_to_edit_contat_number_with_less_than_digit_as_then_verify_user_should_get_notification_as(Integer digit, String number, String notification) throws Exception {
		uP.UserEntersUserContactNumber(number);	
		uP.userClicksOnUpdateProfileDetailsButton();
		String messg =uP.getNotification();
		Assert.assertEquals(messg, notification);	
	}
	
	@When("user enter contactNumber as per requirement i.e with ten digit  as {string} it update successfully")
	public void user_enter_contact_number_as_per_requirement_i_e_with_ten_digit_as_it_update_successfully(String contactNum) throws Exception {
		uP.UserEntersUserContactNumber(contactNum);	
		uP.userClicksOnUpdateProfileDetailsButton();
	}


}
