package stepDefinations;

import java.io.IOException;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LaptopsNoteBooksPageObject;
import utilities.Utilities;

public class LaptopsNoteBooksSteps extends Base {

	LaptopsNoteBooksPageObject laptop = new LaptopsNoteBooksPageObject();

	@Given("User is on Retail websitee")
	public void user_is_on_retail_websitee() {
		laptop.TextTestEnviroment();

		logger.info("User is on Retail website successfully");
	}

	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		laptop.clickLaptopsAndNotebooks();

		logger.info("User clicked on Laptop &NoteBook tab successfully");
	}

	@When("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
		laptop.ClickOnShowAllDropItemsLaptop();

		logger.info("User clicked on Show all Laptop &NoteBook option successfully");
	}

	@When("User click on MacBook  item")
	public void user_click_on_mac_book_item() {
		laptop.ClickOnMacBookName();
		logger.info("User clicked on MacBook  item successfully");

	}

	@When("User click add to Cart button this")
	public void user_click_add_to_cart_button_this() {
		laptop.ClickOnMacBookAddToCartQ();

		logger.info("User clicked add to Cart button this successfully");

	}

	@Then("User should see a message {string}")
	public void user_should_see_a_message(String string) {
		System.out.println("string from stepDefinition method: " + string);

		laptop.MessageAddSuccessMacBook(string);

		logger.info("User saw the message Success successfully");
	}

	@Then("User should see {string} showed to the cart")
	public void user_should_see_tem_s_showed_to_the_cart(String string) throws Exception {

		laptop.ItemShowedOnCart(string);
		logger.info("User Saw the information successfully");
	}

	@Then("User click on cart option")
	public void user_click_on_cart_option() {
		laptop.ClickOnCartTotal();
		logger.info("User clicked on cart option successfully");

	}

	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		laptop.ClickOnCartRemoveButton();
		logger.info("user clicked on red X button to remove the item from cart successfully");
	}

	@Then("item should be removed and cart should show {string}")
	public void item_should_be_removed_and_cart_should_show(String string) throws Exception {
		laptop.TextEmptyShoppingCart(string);
		logger.info("Item removed successfully");
		Utilities.takeScreenShot("Empty Shopping Cart");
	}

////------------------------------------------------------------------------------

	@When("User click on product comparison icon on ‘MacBook’")
	public void user_click_on_product_comparison_icon_on_mac_book() {
		laptop.clickOncompareThisProductButtonMackbook();

		logger.info("User clicked on product comparison icon on ‘MacBook successfully");
	}

	@When("User click on product comparison icon on ‘MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() {
		laptop.clicOnCompareThisProductButtonMackbookAir();
		logger.info("User clicked on product comparison icon on ‘MacBook Air successfully");
	}

	@Then("User should see a message3 {string}")
	public void user_should_see_a_message3(String string) throws Exception {
		laptop.getSuccessMessageMacBookAir(string);
		System.out.println("string from stepDefinition method: " + string);
		logger.info("User saw a success message successfully");
		Utilities.takeScreenShot("MacBooK Air Success Message");
	}

	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() throws InterruptedException {
		laptop.clickOnProductCompare();

		logger.info("User click on Product comparison link successfully");

	}

	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() throws IOException {
		laptop.getProductComprationList();
		logger.info("User should saw Product Comparison Chart");
		Utilities.takeScreenShot("MacBook&MacBookAir");

	}
//--------------------------------------------------------------------------------------

	@When("User click on heart icon to add ‘Sony VaIO’ laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list() {
		laptop.clickOnHeartSonyVAIO();

		logger.info("User clicked on heart icon to add ‘Sony VaIO’ laptop to wish list successfully");
	}

	@Then("User should get a message {string}")
	public void user_should_get_a_message(String string) throws Exception {
		laptop.textSuccessTextSonyVAIO(string);

		logger.info("User Saw Success message successfully");

		Utilities.takeScreenShot("SonyVAIO");
	}

//-----------------------------------------------------------------------------------------
	@When("User click on ‘MacBook Pro’ item")
	public void user_click_on_mac_book_pro_item() {

		laptop.clickOnMacBookProName();

		logger.info("User clicked on ‘MacBook Pro’ item Successfully");
	}

	@Then("User should see  {string} price tag is present on UI.")
	public void user_should_see_price_tag_is_present_on_ui(String string) throws IOException {

		logger.info("User saw price tag is present on UI successfully");
		Utilities.takeScreenShot("MacBook Pro Price");
	}

}
