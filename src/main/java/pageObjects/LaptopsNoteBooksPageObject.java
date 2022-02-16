package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utilities;

public class LaptopsNoteBooksPageObject extends Base {

	public LaptopsNoteBooksPageObject() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement textTestEnviroment;

	@FindBy(xpath = "//*[@id=\"menu\"]/div[2]/ul/li[2]/a")
	private WebElement laptopsAndNotebooks;

	@FindBy(xpath = "//a[text()='Macs (0)']")
	private WebElement Macs;

	@FindBy(xpath = "//h2[text()='Macs']")
	private WebElement macs;

	@FindBy(xpath = "There are no products to list in this category.")
	private WebElement laptopsAndNotebooksText;

	@FindBy(xpath = "//a[text() = 'Windows (0)']")
	private WebElement windows;

	@FindBy(xpath = "//img[@class='img-responsive']")
	private WebElement windowsPicture;

	@FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement showAllDropItemsLaptop;

	@FindBy(linkText = "MacBook")
	private WebElement macBookName;

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement macBookAddToCartQty;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement messageAddSuccess;

	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement itemShowOnCart;

	@FindBy(xpath = "(//i[@class='fa fa-shopping-cart'])[4]")
	private WebElement macBookAddToCart;

	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement cartTotall;

	@FindBy(xpath = "//i[@class='fa fa-times']")
	private WebElement cartRemoveButton;

	@FindBy(xpath = "//*[@id=\"cart-total\"]")
	private WebElement textEmptyShoppingCart;

	@FindBy(xpath = "//button[contains(@onclick,'43')][3]")
	private WebElement compareThisProductButtonMackbook;

	@FindBy(xpath = "//button[contains(@onclick,'44')][3]")
	private WebElement compareThisProductButtonMackbookAir;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessageMacBookAir;

	@FindBy(linkText = "product comparison")
	private WebElement productCompare;

	@FindBy(xpath = "//h1[text()='Product Comparison']")
	private WebElement productComprationText2;

	@FindBy(xpath = "//div[@id='content']//a/strong")
	private List<WebElement> productComprationList;

	@FindBy(xpath = "//button[contains(@onclick,'46')][2]")
	private WebElement heartSonyVAIO;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement textSuccessTexttSonyVAIO;

	@FindBy(linkText = "MacBook Pro")
	private WebElement macBookProName;

	@FindBy(xpath = "//ul[@class='list-unstyled']//h2")
	private WebElement priceMacBookPro;

	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement laptopsAndNoteBooksTab;
	@FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptopsAndNotebooks;
	@FindBy(xpath = "//img[@alt='MacBook']")
	private WebElement macBookItem;
	@FindBy(xpath = "//button[text()='Add to Cart']")
	private WebElement addToCartButton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessage;
	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement cartTotal;
	@FindBy(xpath = "//table[@class='table table-striped']//tr//td//button")
	private WebElement removeButton;

	public void clickOnlaptopsAndNoteBooksTab() {
		Utilities.waitAndClickElement(laptopsAndNoteBooksTab);
	}

	public void clickOnlaptopsAndNoteBooksFromList() {
		Utilities.waitAndClickElement(showAllLaptopsAndNotebooks);
	}

	public void clickOnMacBookItem() {
		Utilities.waitAndClickElement(macBookItem);
	}

	public void clickOnAddToCartButton() {
		Utilities.waitAndClickElement(addToCartButton);
	}

	public void verifySuccessMessage(String strSuccessMessage) {
		String actualSuccessMssg = successMessage.getText();
		String strString = actualSuccessMssg.substring(0, 54);
		Assert.assertEquals(strSuccessMessage, strString);
	}

	public void verifyCartTotal(String strCartTotal) {
		String actualCartTotal = cartTotal.getText();
		Assert.assertEquals(strCartTotal, actualCartTotal);
	}

	public void clickOnCartOption() {
		Utilities.waitAndClickElement(cartTotal);
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickOnRemoveItemButton() {
		Utilities.waitAndClickElement(removeButton);
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyCartTotalAfterRemovingItem(String strCartTotalAfterRemove) {
		String actualCartTotal = cartTotal.getText();
		System.out.println("actual cart total after removing: =======" + actualCartTotal);
		Assert.assertEquals(strCartTotalAfterRemove, actualCartTotal);
		System.out.println(actualCartTotal);
	}

	public void TextTestEnviroment() {
		textTestEnviroment.getText();
	}

	public void clickLaptopsAndNotebooks() {

		laptopsAndNotebooks.click();
	}

	public void ClickOnShowAllDropItemsLaptop() {
		showAllDropItemsLaptop.click();
	}

	public void ClickOnMacBookName() {
		macBookName.click();
	}

	public void ClickOnMacBookAddToCartQ() {
		macBookAddToCartQty.click();
	}

	public void MessageAddSuccessMacBook(String strSuccessMessage) {

		String actualSuccessMssg = messageAddSuccess.getText();

		System.out.println(actualSuccessMssg);

		// String strString = actualSuccessMssg.substring(0, 54);
		// Assert.assertEquals(strSuccessMessage, strString);
	}

	public void ItemShowedOnCart(String strCartTotal) throws Exception {
		String actualCartTotal = itemShowOnCart.getText();
		Assert.assertEquals(strCartTotal, actualCartTotal);

	}

	public void ClickOnCartTotal() {
		Utilities.waitAndClickElement(cartTotal);

		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void ClickOnCartRemoveButton() {
		Utilities.waitAndClickElement(cartRemoveButton);
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

//	public void TextEmptyShoppingCart(String SucccessMss) throws Exception {
//		String actualText = textEmptyShoppingCart.getText();
//		
//		System.out.println( "actualext" + actualText);
//		String expectedText = "0 item(s) - 0.00€";
//		if (actualText.contains(expectedText)) {
//			logger.info("text verified!");
//		} else {
//			
//		throw new Exception("The cart not is empty!");
//		}
//		
//
//			}

	public void TextEmptyShoppingCart(String strCartTotalAfterRemove) {
		String actualCartTotal = textEmptyShoppingCart.getText();
		System.out.println("actual cart total after removing: =======" + actualCartTotal);
		Assert.assertEquals(strCartTotalAfterRemove, actualCartTotal);
		System.out.println(actualCartTotal);
	}

	public void clickOncompareThisProductButtonMackbook() {
		compareThisProductButtonMackbook.click();
	}

	public void clicOnCompareThisProductButtonMackbookAir() {
		Utilities.waitAndClickElement(compareThisProductButtonMackbookAir);

	}

	public void getSuccessMessageMacBookAir(String strSuccessMessageM) throws Exception {
		Thread.sleep(2000);

		String actualSuccessMssgMac = successMessageMacBookAir.getText();
		System.out.println(actualSuccessMssgMac);
		if (actualSuccessMssgMac.contains(strSuccessMessageM)) {
			System.out.println("Success!");
		} else {
			throw new Exception("Failed!");
		}
//			Thread.sleep(2000);
//			String strStringMac = actualSuccessMssgMac.substring(0, 62);
//			try {
//				Assert.assertEquals(strSuccessMessageM, strStringMac);
//			} catch (Exception e) {
//
//			}

	}

	public void clickOnProductCompare() throws InterruptedException {
		Thread.sleep(6000);
		productCompare.click();
	}

	public void clickOnProductComprationText() {
		productComprationText2.getText();
	}

	public void getProductComprationList() {

		List<WebElement> item = productComprationList;
		for (int i = 0; i < item.size(); i++) {
			String text = item.get(i).getText();
			logger.info(text);

		}

	}

	public void clickOnHeartSonyVAIO() {
		heartSonyVAIO.click();
	}

	public void textSuccessTextSonyVAIO(String successMssg) throws Exception {
		String actualText = textSuccessTexttSonyVAIO.getText();
		String expectedText = "You must login or create an account to save Sony VAIO to your wish list!";
		if (actualText.contains(expectedText)) {
			logger.info("Text verified!");
		} else {
			throw new Exception("Text does not much!");
		}
	}

	public void clickOnMacBookProName() {
		macBookProName.click();

	}

	public void textPriceMacBookPro(String successMssg) throws Exception {
		String actualText = priceMacBookPro.getText();
		String expected = "$2,000.00";
		if (actualText.contains(expected)) {
			logger.info("Price verified!");
		} else {
			throw new Exception("Price does not much!");
		}

	}

}
