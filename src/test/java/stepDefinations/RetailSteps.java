package stepDefinations;

import java.io.IOException;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObjects.RetailPageObjects;
import utilities.Utilities;

public class RetailSteps extends Base {

	RetailPageObjects retail = new RetailPageObjects();

	@Given("User is on Retail website now")
	public void user_is_on_retail_website_now() throws IOException {
		retail.validateHomePage();
		logger.info("Homepage validated successfully");
		Utilities.takeScreenShot("Homepage");

	}

	@Given("User click on MyAccount")
	public void user_click_on_my_account() {
		retail.clickOnMyAccountButton();

		logger.info("My account button was clicked successfully");

	}

	@When("User click on Login")
	public void user_click_on_login() {
		retail.clickOnLoginButton();
		logger.info("Login button was clicked successfully");
	}

	@When("User enter username userName and password")
	public void user_enter_username_user_name_and_password() {
		retail.enterUserName();
		retail.enterPassword();
		logger.info("Username and Passwerd entered successfully");

	}

	@When("User click on Login button")
	public void user_click_on_login_button() {
		retail.clickOnLoginButtonMain();
		logger.info("Login button was clicked successfully");
	}

	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() throws IOException {
		retail.verifiedMyAccountDashboard();
		Utilities.takeScreenShot("My Account Dasboard");
		logger.info("User logged to MyAccount dashboard successfully");
	}

	@When("User click on Register for an Affiliate Account link")
	public void user_click_on_register_for_an_affiliate_account_link() {
		retail.ClickOnMyAccountButtonpage();
		retail.clickOnRegisterAffiliateAccount();
		logger.info("User clicked on ‘Register for an Affiliate Account’ link successfully");
	}

	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(io.cucumber.datatable.DataTable dataTable)
			throws InterruptedException {
		List<Map<String, String>> affiliateInputs = dataTable.asMaps(String.class, String.class);

		retail.sendkeysCompanyField(affiliateInputs.get(0).get("company"));
		retail.sendkeysWebsiteField(affiliateInputs.get(0).get("website"));
		retail.sendkeystaxIDField(affiliateInputs.get(0).get("taxID"));
		retail.clickonChequeRadioButton();
		retail.sendkeyPayPalEmail();

		logger.info("User filled affiliate information successfully ");
	}

	@When("User check on About us check box")
	public void user_check_on_about_us_check_box() {
		retail.clickOnCheckBoxButton();
		logger.info("User clicked on About Us Button successfully");
	}

	@When("User click on Continue button")
	public void user_click_on_continue_button() throws InterruptedException {
		retail.clickOnContinueButtonOfAfiliateAcc();
		logger.info("User clicked on Continue button successfuly");
	}

	@Then("User should see a success message")
	public void user_should_see_a_success_message() throws Exception {
		retail.createdAfiliateAccountSuccessMessage();
		logger.info("User saw a success message successfully");
	}

////--------------------------------------------------------------

	@When("User click on Edit your affiliate informationlink")
	public void user_click_on_edit_your_affiliate_informationlink() {
		retail.clickOnEditAffiliateAccount();
		logger.info("User clicked on ‘Edit your affiliate informationlink");

	}

	@When("user click on Bank Transfer radio buttonn")
	public void user_click_on_bank_transfer_radio_buttonn() throws InterruptedException {
		retail.clickOnBankRadioButtonEdit();

		logger.info("user clicked on Bank Transfer radio button successfully");
	}

	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		retail.senkeysBankNameField(data.get(0).get("bankName"));
		retail.sendkeysBankABAFiled(data.get(0).get("abaNumber"));
		retail.sendkeysSWIFTCodeFild(data.get(0).get("swiftCode"));
		retail.sendkeysAccountNameFiled(data.get(0).get("accountName"));
		retail.sendkeysAccountNumberField(data.get(0).get("accountNumber"));

		logger.info("User filled Bank information with below information successfully");

	}

	@Then("User click on Continue button on page")
	public void user_click_on_continue_button_on_page() throws IOException, InterruptedException {
		retail.clickOnContinueButton();
		logger.info("User clicked on Continue button on page successfully");
		Utilities.takeScreenShot("Continue Button");
	}

	@Then("User should see a success message on page")
	public void user_should_see_a_success_message_on_page() throws Exception {
		retail.textSuccessMessageChange();
		logger.info("User saw a success message on page successfully");
		Utilities.takeScreenShot("Success Message Of Changed");
	}
//--------------------------------------------------------------------

	@When("User click on Edit your account information link")
	public void user_click_on_edit_your_account_information_link() {
		retail.clickEditMyAccountInfo();
		logger.info("User clicked on ‘Edit your account information’ link successfully");
	}

	@When("User modify below information")
	public void user_modify_below_information(io.cucumber.datatable.DataTable dataTable) {

		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		retail.sendkeyEditFirstName(data.get(0).get("firstname"));
		retail.sendKeyEditMyLastName(data.get(0).get("lastName"));
		retail.sendkeyEditMyEmail(data.get(0).get("email"));
		retail.sendkeyEditMyTelephoneNum(data.get(0).get("telephone"));

		logger.info("User modified below information successfully");
	}

	@When("User click on continue buttonn")
	public void user_click_on_continue_buttonn() throws InterruptedException {
		retail.clickOnContinueButton();

		logger.info("User clicked on continue buttonn");
	}

	@Then("User should see a message ‘Success: Your account has been successfully updated.’")
	public void user_should_see_a_message_success_your_account_has_been_successfully_updated() throws Exception {
		retail.verifiedEditSuccessMessage();
		logger.info("User saw a message ‘Success: Your account has been successfully updated");
		Utilities.takeScreenShot("Update My Account");
	}

}
