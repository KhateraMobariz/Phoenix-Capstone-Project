package stepDefinations;

import java.io.IOException;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObjects.HomePageObject;
import utilities.Utilities;

public class HomePageSteps extends Base {
	HomePageObject home = new HomePageObject();

	@When("User click on Currency")
	public void user_click_on_currency() {
		home.clickOnCurrency();
		logger.info("User clicked on Currency");
	}

	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		home.selectCurrencyFromDropdown();
		logger.info("User Chose Euro from dropdown");
	}

	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() throws InterruptedException, IOException {

		home.verifyCurrencyEuro();
		logger.info("currency value changed to Euro");
		Utilities.takeScreenShot("Currency");

	}

	// ----------------------------------------------------

	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
		home.clickOnShoppingCartHome();
		logger.info("User clicked on shopping cart");
	}

	@Then("“Your shopping cart is empty!” message should display")
	public void your_shopping_cart_is_empty_message_should_display() throws IOException {
		home.textShoppingCartIsEmpty();

		logger.info("Cart Is Empty!");

		Utilities.takeScreenShot("Empty Shopping Cart");

	}
}
