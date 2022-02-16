package stepDefinations;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DesktopsPageObject;
import utilities.Utilities;

public class DesktopSteps extends Base {

	DesktopsPageObject desktop = new DesktopsPageObject();

	@Given("User is on Retail website")
	public void user_is_on_retail_website() throws IOException {
		desktop.textTestEnviroment();
		logger.info("Home page validated successfully");
		Utilities.takeScreenShot("Home Page");
	}

	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {

		desktop.clickOnDesktop();
		logger.info("User clicked on dessktop Successfully");

	}

	@And("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
		desktop.showAllDesktopPageItem();
		logger.info("User clicked on the show all desktop successfully");
	}

	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() throws IOException, InterruptedException {

		desktop.GetDesktopAllItemsListList();
		logger.info("User saw all items are present in Desktop page successfully");

		Utilities.takeScreenShot("Show all Desktop Page1");
		Utilities.scrolldownPage();
		Utilities.takeScreenShot("Show all Desktop Page2");

	}

	// ---------------------------------------------------------
	@When("User click  ADD TO CART option on ‘HP LP3065’ item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() {
		desktop.clickOntHPLpName();

		logger.info("User clicked on cart option successfully");
	}

	@When("User select quantity {int}")
	public void user_select_quantity(Integer int1) {
		// desktop.SelectHPLPDQTY();
		desktop.clearHPLPDQTY();
		desktop.sendKeysTohPLPDQTY();
		logger.info("User select on quantity successfully");
	}

	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		desktop.clickOnHPLPDQTYAddToCartQty();
		logger.info("User clicked add to Cart button successfully");
	}

	@Then("User should see a message1 {string}")
	public void user_should_see_a_message1(String string) throws InterruptedException, IOException {

		Thread.sleep(3000);
		desktop.pLPDQTYSuccsessText(string);
		logger.info("User saw the Success message successfully");
		Utilities.takeScreenShot("HPLP3065");
	}

	// canon-----------------------------------------------------------------------------

	@When("User click  ADD TO CART option on ‘Canon EOS 5D’ item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
		desktop.clickOnCanonEOSAddToCart();

		logger.info("User clicked ADD TO CART option on Canon successfully");
	}

	@When("User select color from dropdown ‘Red’")
	public void user_select_color_from_dropdown_red() throws InterruptedException {
		Thread.sleep(3000);
		desktop.selectOncanon();
		Thread.sleep(3000);
		logger.info("User selected color from dropdown ‘Red successfully");
	}

	@When("User select quantity {int} here")
	public void user_select_quantity_here(Integer int1) {
		desktop.deleteValue1Qty();
		desktop.SendKeyCanonSelectQty();

	}

	@When("User click add to Cart buttonn")
	public void user_click_add_to_cart_buttonn() {
		desktop.ClickOnCanonAddToCartQty();
		desktop.clickOnCanonEOSAddToCart();
		logger.info("User clicked add to Cart buttonn successfully");

	}

	@Then("User should see a message2 {string}")
	public void user_should_see_a_message2(String string) throws IOException {

		desktop.SuccessTextCanonAddToCart(string);
		try {
			Utilities.takeScreenShot("Canon EOS");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.info("User saw the Success message on Canon successfully");
		Utilities.takeScreenShot("Canon Success Message");

	}

//---------------------------------------------------------------------------------------------

	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
		desktop.clickOncanonEOSPName();

		logger.info("User clicked on Canon EOS 5D item successfully");
	}

	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		desktop.clickOnwriteReviewCanonEOS();
		logger.info("User clicked on write a review link successfully");
	}

	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(io.cucumber.datatable.DataTable dataTable) {

		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		desktop.sendKeyInputNameReviewCanonEOS(data.get(0).get("yourname"));
		desktop.sendKeyTextAreaReviewCanonEOS(data.get(0).get("yourReview"));

		desktop.ClickOnRatingValueFive();

		logger.info("user filled the review information with below information successfully");

	}

	@When("User click on Continue Button")
	public void user_click_on_continue_button() {
		desktop.ClickOnOnContinueButtonCanonEOS();

		logger.info("User clicked on Continue Button successfully");

	}

	@Then("User should see a message with {string}")
	public void user_should_see_a_message_with(String string) throws IOException {

		desktop.ThankForReviewMessage();
		logger.info("User saw the message successfully");
		Utilities.takeScreenShot("Success Message Of Review");

	}
}
