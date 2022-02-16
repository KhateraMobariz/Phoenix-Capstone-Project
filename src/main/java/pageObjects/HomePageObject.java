package pageObjects;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utilities;

public class HomePageObject extends Base {

	// in this class we are storing our pageobjects/attributes/locator
	// we will implement the PageFactory.initElements to initialize our page objects
	// PageFactory is coming form selenium
	// once we get the loctor for our elements, we use the @FindBy annotation from
	// selenium
	// store our pageobjects and we can write a get method to access our pageobject
	// in stepDefinition class
	// we will store our elements as private webelement, so that we can only access
	// them through get method

	public HomePageObject() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement textTestEnviroment2;

	@FindBy(xpath = "//span[text()='Currency']")
	private WebElement currency;

	@FindBy(xpath = "//span[text()='123456789']")
	private WebElement phone;

	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccount;

	@FindBy(xpath = "//span[text()='Wish List (0)']")
	private WebElement wishList;

	@FindBy(xpath = "//span[text()='Shopping Cart']")
	private WebElement shoppingCart;

	@FindBy(xpath = "//span[text()='Checkout']")
	private WebElement checkout;

	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']'")
	private WebElement textTestEnviroment;

	@FindBy(xpath = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
	private WebElement searchBarClickButton;

	@FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
	private WebElement searchButton;

	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktop;

	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement laptopsAndNotebooks;

	@FindBy(xpath = "//a[text()='Components']")
	private WebElement components;

	@FindBy(xpath = "//a[text()='Tablets']")
	private WebElement tablets;

	@FindBy(xpath = "//a[text()='Software']")
	private WebElement software;

	@FindBy(xpath = "//a[text()='Phones & PDAs']")
	WebElement phonesAbdPads;

	@FindBy(xpath = "//a[text()='Cameras']")
	WebElement cameras;

	@FindBy(xpath = "//a[text()='MP3 Players']")
	private WebElement mP3AndPlayers;

	@FindBy(xpath = "//a[text()='Featured']")
	private WebElement featured;

	@FindBy(linkText = "MacBook")
	WebElement mackbok;

	@FindBy(xpath = "(//*[text()='Add to Cart'])[1]")
	private WebElement addToCartMacBook;

	@FindBy(xpath = "//p[contains(text(), 'Intel Core 2 Duo processor')]")
	private WebElement decribtionOfMackBook;

	@FindBy(xpath = "//p[contains(text(), '$602')]")
	private WebElement priceAndTaxForMacBook;

	@FindBy(xpath = "(//*[@class='fa fa-heart'])[2]")
	private WebElement AddToWishList;

	@FindBy(xpath = "//*[@class='fa fa-exchange'])[2]")
	private WebElement compareThisProduct;

	@FindBy(xpath = "//a[text()='iPhone']")
	private WebElement iPhone;

	@FindBy(xpath = "//p[contains(text(), 'iPhone is a revolutionary')]")
	private WebElement getTextDecription;

	@FindBy(xpath = "//p[contains(text(), '$123')]")
	private WebElement priceAndTax;

	@FindBy(xpath = "(//*[text()='Add to Cart'])[2]i")
	private WebElement shoppingCartIphone;

	@FindBy(xpath = "(//*[@class='fa fa-heart'])[2]")
	private WebElement wishListHeartIphone;

	@FindBy(xpath = "//*[@id=\"(//*[@class='fa fa-exchange'])[2]")
	private WebElement compareThisProductIPhone;

	@FindBy(xpath = "//a[text()='Apple Cinema 30\"']")
	private WebElement AppleCinemaIPhone;

	@FindBy(xpath = "//p[contains(text(),'	The 30-inch ')]")
	private WebElement descriptionOfTheCinema;

	@FindBy(xpath = "//span[contains(text(), '$110')]")
	private WebElement priceTheCinema;

	@FindBy(xpath = "(//*[@class='price'])[3]")
	private WebElement newAndOldPriceAndTaxOfTheCinema;

	@FindBy(xpath = "(//*[text()='Add to Cart'])[3]")
	private WebElement shoppingCartAppleCinema;

	@FindBy(xpath = "(//*[@class='fa fa-heart'])[3]")
	private WebElement wishListCartOfCinema;

	@FindBy(xpath = "(//*[@class='fa fa-exchange'])[3]")
	private WebElement compareThisProductOfTheCinema;

	@FindBy(xpath = "(//*[@class='price'])[4]")
	private WebElement priceAndTaxOfcanonEOS5D;

	@FindBy(xpath = "//a[text()='Canon EOS 5D']")
	private WebElement canonEOS5D;

	@FindBy(xpath = "//p[contains(text(), 'Canon')]")
	private WebElement textOfCanonEOS5D;

	@FindBy(xpath = "(//*[@class='fa fa-shopping-cart'])[6]")
	private WebElement AddTheShoppingCartOnCanon;

	@FindBy(xpath = "(//*[@type='button'])[19]")
	private WebElement AddtoWishListOnCanon;

	@FindBy(xpath = "(//*[@class='fa fa-exchange'])[4]")
	private WebElement compareOfThisProductCanon;

	@FindBy(xpath = "//h5[text()='Information']")
	private WebElement information;

	@FindBy(linkText = "About Us")
	private WebElement aboutUs;

	@FindBy(linkText = "Delivery Information")
	private WebElement deliveryInformation;

	@FindBy(linkText = "Privacy Policy")
	private WebElement privacyPolicy;

	@FindBy(linkText = "Terms & Conditions")
	private WebElement termsAndConditions;

	@FindBy(xpath = "//h5[text()='Customer Service']")
	private WebElement customerService;

	@FindBy(linkText = "Contact Us")
	private WebElement contactUs;

	@FindBy(linkText = "Returns")
	private WebElement returns;

	@FindBy(linkText = "Site Map")
	private WebElement siteMap;

	@FindBy(xpath = "//h5[text()='Extras']")
	private WebElement extras;

	@FindBy(linkText = "Brands")
	private WebElement brands;

	@FindBy(linkText = "Gift Certificates")
	private WebElement giftCertificates;

	@FindBy(linkText = "Affiliate")
	private WebElement affiliate;

	@FindBy(linkText = "Specials")
	private WebElement specials;

	@FindBy(xpath = "//h5[contains(text(), 'My')]")
	private WebElement myAccountFooter;

	@FindBy(linkText = "My Account")
	private WebElement myAccountt;

	@FindBy(linkText = "Order History")
	private WebElement orderHistory;

	@FindBy(linkText = "Wish List")
	private WebElement wishListFooter;

	@FindBy(linkText = "Newsletter")
	private WebElement newsletterFooter;

	@FindBy(xpath = "//p[contains(text(), 'Powered By')]")
	private WebElement poweredOpenCart;

	@FindBy(xpath = "//button[@name='EUR']")
	private WebElement euroButtonCurrency;

	@FindBy(xpath = "//button[@name='GBP']")
	private WebElement gPBButtonCurrency;

	@FindBy(xpath = "//button[@name='USD']")
	private WebElement USDButtonCurrency;

	@FindBy(xpath = "//*[@id=\"form-currency\"]/div/button/strong")
	private WebElement euroTextCurrency;

	@FindBy(xpath = "//p[text()='Your shopping cart is empty!']")
	private WebElement textShoppingCartIsEmpty;

	@FindBy(xpath = " //span[@id='cart-total']")
	private WebElement shoppingCartHome;

	// strong[@xpath='1']

	public void homepage() {
		textTestEnviroment2.click();
	}

	public void clickOnCurrency() {
		currency.click();
	}

	public void clickTextPhone() {
		phone.getText();
	}

	public void clickMyAccount() {
		myAccount.click();
	}

	public void clickWishList() {
		wishList.click();
	}

	public void clickShoppingCart() {
		shoppingCart.click();
	}

	public void clickCheckout() {
		checkout.click();
	}

	public void textTestEnviroment() {

		WebElement text = textTestEnviroment;
		System.out.println(text.getText());
	}

	public void searchBarClickButton() {
		searchBarClickButton.click();
	}

	public void clickSearchButton() {
		searchButton.click();
	}

	public void clickDesktop() {
		desktop.click();
	}

	public void clickOnLaptopsAndNotebooks() {
		laptopsAndNotebooks.click();
	}

	public void clickOnComponents() {
		components.click();
	}

	public void clickOnTablets() {
		tablets.click();
	}

	public void clickOnSoftware() {
		software.click();
	}

	public void cilckOnPhonesAndPads() {
		phonesAbdPads.click();
	}

	public void clickOnCameras() {
		cameras.click();
		cameras.click();
	}

	public void clickMP3Players() {
		mP3AndPlayers.click();
	}

	public void getTextFeatured() {
		featured.getText();

	}

	public void clickOnMacbook() {
		mackbok.click();
	}

	public void decribtionOfMackBook() {
		decribtionOfMackBook.getText();
	}

	public void priceAndTaxForMacBook() {
		priceAndTaxForMacBook.getText();
	}

	public void addToCartMacBook() {
		addToCartMacBook.click();
	}

	public void AddToWishListMac() {
		AddToWishList.click();
	}

	public void clickOncompareThisProduct() {
		compareThisProduct.click();
	}

	public void clickOniPhone() {
		iPhone.click();
	}

	public void getTextDecriptionIphone() {
		getTextDecription.getText();
	}

	public void priceAndTax() {
		priceAndTax.getText();
	}

	public void clickOnShoppingCartIphone() {
		shoppingCartIphone.click();
	}

	public void clickOnwishListHeartIphone() {
		wishListHeartIphone.click();
	}

	public void clickOnCompareThisProductIPhone() {
		compareThisProductIPhone.click();
	}

	public void clickOnAppleCinemaIPhone() {
		AppleCinemaIPhone.click();
	}

	public void getTextAppleCinemaIPhone() {
		AppleCinemaIPhone.getText();
	}

	public void getTextOfPriceTheCinema() {
		priceTheCinema.getText();
	}

	public void getTextOfnewAndOldPriceAndTaxOfTheCinema() {
		newAndOldPriceAndTaxOfTheCinema.getText();
	}

	public void clickOnshoppingCartAppleCinema() {
		shoppingCartAppleCinema.click();
	}

	public void clickOnWishListCartOfCinema() {
		wishListCartOfCinema.click();
	}

	public void clickOncompareThisProductOfTheCinema() {
		compareThisProductOfTheCinema.click();
	}

	public void clickONcanonEOS5D() {
		canonEOS5D.click();
	}

	public void getTextDscriptionOfCanonEOS5D() {
		textOfCanonEOS5D.getText();
	}

	public void getTextOfPriceAndTaxOfcanonEOS5D() {
		priceAndTaxOfcanonEOS5D.getText();
	}

	public void clickTOAddTheShoppingCart() {
		AddTheShoppingCartOnCanon.click();
	}

	public void AddtoWishListOnCanon() {
		AddtoWishListOnCanon.click();
	}

	public void clickCompareOfThisProductCanon() {
		compareOfThisProductCanon.click();
	}

	public void getTextOninformationFooter() {
		information.getText();
	}

	public void clickOnAboutUs() {
		aboutUs.click();
	}

	public void clickOnDeliveryInformation() {
		deliveryInformation.click();
	}

	public void clickOnprivacyPolicy() {

		privacyPolicy.click();
	}

	public void clickOntermsAndConditions() {
		termsAndConditions.click();
	}

	public void getTextcustomerService() {
		customerService.getText();
	}

	public void clickOncontactUs() {
		contactUs.click();
	}

	public void clickOnReturns() {
		returns.click();
	}

	public void clickOnsiteMap() {
		siteMap.click();
	}

	public void getTextExtras() {
		extras.getText();
	}

	public void clicOnBrands() {
		brands.click();
	}

	public void clickOnGiftCertificates() {
		giftCertificates.click();
	}

	public void clickOnAffiliate() {
		affiliate.click();
	}

	public void clickOnspecials() {
		specials.click();
	}

	public void getTextMyAccount() {
		myAccountFooter.click();
	}

	public void clickOnmyAccountt() {
		myAccountt.click();
	}

	public void clickOnorderHistory() {
		orderHistory.click();
	}

	public void clickOnwishListFooter() {
		wishListFooter.click();
	}

	public void clickOnNewsletterFooter() {
		newsletterFooter.click();
	}

	public void getTextPoweredOpenCart() {
		poweredOpenCart.getText();
	}

	public void clickOnEuroButtonCurrency() {

		euroButtonCurrency.click();
	}

	@FindBy(xpath = "//span[text()='Currency']")
	private WebElement currencyButton;

	@FindBy(xpath = "//ul[@class='dropdown-menu']//li[1]")
	private WebElement currencyList;

	@FindBy(xpath = "//form//div//button[@data-toggle='dropdown']//strong")
	private WebElement euroCurrency;

	public void textShoppingCartIsEmpty() {

		String actualText = textShoppingCartIsEmpty.getText();
		String emptyCartMss = "Your shopping cart is empty!";
		System.out.println(actualText);
		Assert.assertEquals(emptyCartMss, actualText);

	}

	public void clickOnShoppingCartHome() {
		shoppingCartHome.click();
	}

	public void clickOnCurrencyDropdown() {
		Utilities.waitAndClickElement(currencyButton);
	}

	public void selectCurrencyFromDropdown() {
		List<WebElement> currencyDropdown = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li"));
		for (int i = 1; i < currencyDropdown.size(); i++) {
			WebElement currencyList = driver.findElement(By.xpath("//ul[@class='dropdown-menu']//li[" + i + "]"));
			String strCurrency = currencyList.getText();
			if (strCurrency.equalsIgnoreCase("$ US Dollar")) {
				Utilities.waitAndClickElement(currencyList);
			} else {
				System.out.println("Your currency was not found in the list");
			}
		}
	}

	public void verifyCurrencyEuro() {
		String actualStrEuroCurrency = euroCurrency.getText();
		String expectedStrEuroCurrency = "$";
		Assert.assertEquals(expectedStrEuroCurrency, actualStrEuroCurrency);
	}

}
