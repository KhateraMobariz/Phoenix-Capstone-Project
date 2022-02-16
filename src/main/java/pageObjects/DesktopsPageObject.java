package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.Base;
import utilities.Utilities;

public class DesktopsPageObject extends Base {

	public DesktopsPageObject() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement textTestEnviroment;

	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktopDropdown;

	@FindBy(xpath = "//a[text()='PC (0)']")
	private WebElement pcbutton;

	@FindBy(xpath = "//h2[text()='PC']")
	private WebElement printPc;

	@FindBy(xpath = "//a[text()='Mac (1)']")
	private WebElement macDropdown;

	@FindBy(xpath = "//a[text()='iMac']")
	private WebElement printiMac;

	@FindBy(xpath = "//p[contains(text(), 'Just when you thought')]")
	private WebElement iMacTextJust;

	@FindBy(xpath = "//p[contains(text(), '122.00')]")
	private WebElement PriceAndTaxOMac;

	@FindBy(xpath = "//span[contains(text(), 'Add to Cart')]")
	private WebElement addToCartMac;

	@FindBy(xpath = "//button//i[@class='fa fa-heart']")
	private WebElement iMacWishList;

	@FindBy(xpath = "//button//i[@class='fa fa-exchange']")
	private WebElement iMacComareThisProduct;

	@FindBy(xpath = "//div[text()='Showing 1 to 1 of 1 (1 Pages)']")
	private WebElement iMacPageText;

	@FindBy(xpath = "//h2[text()='Mac']")
	private WebElement iMacMacTittle;

	@FindBy(xpath = "//i[@class='fa fa-th-list']")
	private WebElement iMacLis;

	@FindBy(xpath = "//i[@class='fa fa-th']")
	private WebElement iMacGrid;
	@FindBy(id = "compare-total")
	private WebElement iMacProductCompare;

	@FindBy(xpath = "///select[@id='input-sort']")
	private WebElement iMacSortBy;

	@FindBy(xpath = "//select[@id='input-limit']")
	private WebElement iMacShow;

	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDesktopPageItem;

	@FindBy(xpath = "(//a[text()='Desktops'])[2]")
	private WebElement printDesktopName;

	@FindBy(xpath = "//p[contains (text(), 'Example of category')]")
	private WebElement desktopCatagoryText;
	//
	@FindBy(xpath = "//select[@id = 'input-sort']")
	private WebElement defaultDropDown;

	@FindBy(xpath = "//select[@id = 'input-limit']")
	private WebElement showtDropDown;

	@FindBy(linkText = "Apple Cinema 30")
	private WebElement printAppleCinemsName;

	@FindBy(xpath = "//div[contains(text(),  'The 30-inch Apple Cinema')]")
	private WebElement appleCinemaDescription;

	@FindBy(xpath = "//p[@class='price'][1]")
	private WebElement appleCinemaPriceAndTax;

	@FindBy(xpath = "//span[text()='Add to Cart'][1]")
	private WebElement appleCinemaAddToCart;

	@FindBy(xpath = "//i[@class='fa fa-heart'])[2]")
	private WebElement appleCinemaWishList;

	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[1]")
	private WebElement appleCinemaCompareThisProduction;

	@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[2]/div/div[2]/div[1]/h4/a")
	private WebElement canonEOSPrintName;

	@FindBy(xpath = "//p[contains(text(),  'Canon')]")
	private WebElement canonEOSDescription;

	@FindBy(xpath = "//button[contains(@onclick,'30')][1]")
	private WebElement canonEOSAddToCart;

	@FindBy(xpath = "(//p[@class='price'])[2]")
	private WebElement canonEOSPriceAndTax;

	@FindBy(xpath = "(//i[@class='fa fa-heart'])[3]")
	private WebElement canonEOSWishList;
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[2]")
	private WebElement canonEOSCompareThisProduct;

	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[3]/div[1]/div[2]/div[2]/button[1]/span[1]")
	private WebElement printHPLpName;

	@FindBy(xpath = "//p[contains(text(),  'Stop your co-workers')]")
	private WebElement hPLPDecriptionText;

	@FindBy(xpath = "(//p[@class='price'])[3]")
	private WebElement hPLPDPriceAndTax;

	@FindBy(xpath = "(//span[text()='Add to Cart'])[3]")
	private WebElement hPLPAddtoCart;

	@FindBy(xpath = "(//i[@class='fa fa-heart'])[4]")
	private WebElement hPLPDWishList;

	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[3]")
	private WebElement hPLPCompatreThiProduct;

	@FindBy(linkText = ("HTC Touch HD"))
	private WebElement printHTCTouchHD;

	@FindBy(xpath = ("//p[contains(text(), 'HTC Touch')]"))
	private WebElement TextDescriptionHTCTouchHD;

	@FindBy(xpath = ("(//p[@class ='price'])[4]"))
	private WebElement priceAndTaxHTCTouchHD;

	@FindBy(xpath = ("(//i[@class ='fa fa-shopping-cart'])[6]"))
	private WebElement hTCTouchHDAddToCart;

	@FindBy(xpath = ("(//i[@class ='fa fa-heart'])[5]"))
	private WebElement hTCTouchHDWishList;

	@FindBy(xpath = ("(//i[@class ='fa fa-exchange'])[4]"))
	private WebElement hTCTouchHDCompareThisProduct;

	@FindBy(linkText = ("iPhone"))
	private WebElement printiPhone;

	@FindBy(xpath = ("//p[contains(text(), 'iPhone is a revolutionary')]"))
	private WebElement DescriptionTextiPhone;

	@FindBy(xpath = ("(//p[@class='price'])[5]"))
	private WebElement iPhonePriceAndTax;

	@FindBy(xpath = ("(//i[@class='fa fa-shopping-cart'])[7]"))
	private WebElement iPhoneAddToCart;

	@FindBy(xpath = ("(//i[@class='fa fa-heart'])[6]"))
	private WebElement iPhoneWhishList;

	@FindBy(xpath = ("(//i[@class='fa fa-exchange'])[5]"))
	private WebElement iPhoneCompareThisProduct;

	@FindBy(linkText = ("iPod Classic"))
	private WebElement printiPodClassic;

	@FindBy(xpath = ("(//p[@class='price'])[6]"))
	private WebElement iPodClassicPriceAndTax;

	@FindBy(xpath = ("//p[contains(text(), 'iPhone is a revolutionary')]"))
	private WebElement iPodClassicTextDescription;

	@FindBy(xpath = ("(//i[@class='fa fa-shopping-cart'])[8]"))
	private WebElement iPodClassicAddToCart;

	@FindBy(xpath = ("(//i[@class='fa fa-heart'])[7]"))
	private WebElement iPodClassicWishToList;

	@FindBy(xpath = ("(//i[@class='fa fa-exchange'])[6]"))
	private WebElement iPodClassicCompareThisProduct;

	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement macBook;

	@FindBy(xpath = "//p[contains(text(),'Intel Core 2')]")
	private WebElement descriptionMacBook;

	@FindBy(xpath = "(//p[@class='price'])[7]")
	private WebElement priceMacBook;

	@FindBy(xpath = "(//span[text()='Add to Cart'])[7]")
	private WebElement addToCartMacBook;

	@FindBy(xpath = "(//i[@class='fa fa-heart'])[8]")
	private WebElement wishListMacBook;

	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[7]")
	private WebElement compareThisProdMacBook;

	@FindBy(xpath = "//a[text()='MacBook Air']")
	private WebElement macBookAir;

	@FindBy(xpath = "//p[contains(text(),'MacBook Air')]")
	private WebElement descriptionMacBookAir;

	@FindBy(xpath = "(//p[@class='price'])[8]")
	private WebElement priceMacBookAir;

	@FindBy(xpath = "(//span[text()='Add to Cart'])[8]")
	private WebElement addToCartMacBookAir;

	@FindBy(xpath = "(//i[@class='fa fa-heart'])[9]")
	private WebElement wishListMacBookAir;

	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[8]")
	private WebElement compareThisProdMacBookAir;

	@FindBy(xpath = "//a[text()='Palm Treo Pro']")
	private WebElement palmTreoPro;

	@FindBy(xpath = "//p[contains(text(),'Redefine your')]")
	private WebElement descriptionPalmTreoPro;

	@FindBy(xpath = "(//p[@class='price'])[9]")
	private WebElement pricePalmTreoPro;

	@FindBy(xpath = "(//span[text()='Add to Cart'])[9]")
	private WebElement addToCartPalmTreoPro;

	@FindBy(xpath = "(//i[@class='fa fa-heart'])[10]")
	private WebElement wishListPalmTreoPro;

	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[9]")
	private WebElement compareThisProdPalmTreoPro;

	@FindBy(xpath = "//a[text()='Product 8']")
	private WebElement product8;

	@FindBy(xpath = "//p[contains(text(),'Product 8')]")
	private WebElement descriptionProduct8;

	@FindBy(xpath = "(//p[@class='price'])[10]")
	private WebElement priceProduct8;

	@FindBy(xpath = "(//span[text()='Add to Cart'])[10]")
	private WebElement addToCartProduct8;

	@FindBy(xpath = "(//i[@class='fa fa-heart'])[11]")
	private WebElement wishListProduct8;

	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[10]")
	private WebElement compareThisProduct8;

	@FindBy(xpath = "//a[text()='Samsung SyncMaster 941BW']")
	private WebElement samsungSynMaster;

	@FindBy(xpath = "//p[contains(text(),'Imagine the advantages')]")
	private WebElement descriptionSamsungSynMaster;

	@FindBy(xpath = "(//p[@class='price'])[11]")
	private WebElement priceSamsungSynMaster;

	@FindBy(xpath = "(//span[text()='Add to Cart'])[11]")
	private WebElement addToCartSamsungSynMaster;

	@FindBy(xpath = "(//i[@class='fa fa-heart'])[12]")
	private WebElement wishListSamsungSynMaster;

	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[11]")
	private WebElement compareSamsungSynMaster;

	@FindBy(xpath = "//a[text()='Sony VAIO']")
	private WebElement SonyVAIO;

	@FindBy(xpath = "//p[contains(text(),'Unprecedented power')]")
	private WebElement descriptionSonyVAIO;

	@FindBy(xpath = "(//p[@class='price'])[12]")
	private WebElement priceSonyVAIO;

	@FindBy(xpath = "(//span[text()='Add to Cart'])[12]")
	private WebElement addToCartSonyVAIO;

	@FindBy(xpath = "(//i[@class='fa fa-heart'])[13]")
	private WebElement wishListSonyVAIO;

	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[12]")
	private WebElement compareSonyVAIO;

	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement selectHPLPDQTY;

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement hPLPDQTYAddToCartQty;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement hPLPDQTYSuccsessText;

	@FindBy(xpath = "//select[@class='form-control']")
	private WebElement selectOncanon;

	@FindBy(xpath = "	//input[@id='input-quantity']")
	private WebElement canonSelectQty;

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement canonAddToCartQty;

	@FindBy(xpath = "//*[@id=\"product-product\"]/div[1]")
	private WebElement successTextCanonAddToCart;

	@FindBy(xpath = "//input[@id='input-quantity']")

	private WebElement deletValue1Qty;

	@FindBy(xpath = "//a[text()='Write a review']")
	private WebElement writeReviewCanonEOS;

	@FindBy(xpath = "//input[@id='input-name']")
	private WebElement inputNameReviewCanonEOS;

	@FindBy(xpath = "//textarea[@id='input-review']")
	private WebElement textAreaReviewCanonEOS;

	@FindBy(xpath = "//button[@id='button-review']")
	private WebElement continueButtonCanonEOS;

	@FindBy(xpath = "(//label[@class='control-label'])[3]")
	private WebElement radioButtonRating;

	@FindBy(xpath = "//div[4]//div[1]//input[1]")
	private WebElement ratingValueOne;

	@FindBy(xpath = "//div[4]//div[1]//input[2]")
	private WebElement ratingValueTwo;

	@FindBy(xpath = "//div[4]//div[1]//input[3]")
	private WebElement ratingValueThree;

	@FindBy(xpath = "//div[4]//div[1]//input[4]")
	private WebElement ratingValueFour;

	@FindBy(xpath = "//div[4]//div[1]//input[5]")
	private WebElement ratingValueFive;

	@FindBy(xpath = "//button[text()='Continue']")
	private WebElement continueButton;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement thankForReviewMessage;

	@FindBy(tagName = "a")
	private List<WebElement> desktopAllItemsList;

	public void textTestEnviroment() {
		String text = textTestEnviroment.getText();
		System.out.println(text);
	}

	public void clickOnDesktop() {
		desktopDropdown.click();
	}

	public void clickPcButton() {
		pcbutton.click();
	}

	public void getText() {
		printPc.getText();
	}

	public void clickMac() {
		macDropdown.click();
	}

	public void clickIMac() {
		printiMac.click();
	}

	public void iMacTextJust() {
		iMacTextJust.getText();
	}

	public void PriceAndTaxOMac() {
		PriceAndTaxOMac.getText();
	}

	public void addToCartMac() {
		addToCartMac.click();
	}

	public void iMacWishList() {
		iMacWishList.click();
	}

	public void iMacComareThisProduct() {
		iMacComareThisProduct.click();
	}

	public void iMacPageText() {
		iMacPageText.getText();
	}

	public void iMacMacTittle() {
		iMacMacTittle.getText();
	}

	public void iMacLis() {
		iMacLis.click();
	}

	public void iMacGrid() {
		iMacGrid.click();
	}

	public void iMacProductCompare() {
		iMacProductCompare.click();
	}

	public void MacSortBy() {
		iMacSortBy.click();
	}

	public void iMacShow() {
		iMacShow.click();
	}

	public void showAllDesktopPageItem() {
		showAllDesktopPageItem.click();
	}

	public void clickOntHPLpName() {
		printHPLpName.click();
	}

	public void clickOnhPLPAddtoCart() {
		hPLPAddtoCart.click();
	}

	public void SelectHPLPDQTY() {
		selectHPLPDQTY.click();
	}

	public void clearHPLPDQTY() {
		selectHPLPDQTY.clear();
	}

	public void sendKeysTohPLPDQTY() {
		selectHPLPDQTY.sendKeys("1");
	}

	public void clickOnHPLPDQTYAddToCartQty() {
		hPLPDQTYAddToCartQty.click();
	}

	public void pLPDQTYSuccsessText(String strSuccessMessage) throws InterruptedException {
		String text = hPLPDQTYSuccsessText.getText();
		Thread.sleep(3000);
		String strString = text.substring(0, 56);
		try {
			Assert.assertEquals(strSuccessMessage, strString);
		} catch (Exception e) {

		}

	}

	public void clickOnCanonEOSAddToCart() {
		Utilities.waitAndClickElement(canonEOSAddToCart);
	}

	public void selectOncanon() throws InterruptedException {
		Thread.sleep(3000);
		Select select = new Select(selectOncanon);
		select.selectByIndex(1);
	}

	public void SendKeyCanonSelectQty() {
		canonSelectQty.sendKeys("1");
	}

	public void ClickOnCanonAddToCartQty() {

		Utilities.waitAndClickElement(canonAddToCartQty);
		try {
			Thread.sleep(3000);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public void SuccessTextCanonAddToCart(String strSuccessMessage) {
		String actualSuccessMssg = successTextCanonAddToCart.getText();

		System.out.println("actualSuccessMssg to see" + actualSuccessMssg);
		String strString = actualSuccessMssg.substring(0, 66);
		try {
			Assert.assertEquals(strSuccessMessage, strString);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void deleteValue1Qty() {
		deletValue1Qty.clear();
	}

	public void clickOncanonEOSPName() {
		Utilities.waitAndClickElement(canonEOSPrintName);

		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void clickOnwriteReviewCanonEOS() {
		writeReviewCanonEOS.click();
	}

	public void sendKeyInputNameReviewCanonEOS(String name) {
		inputNameReviewCanonEOS.sendKeys(name);

	}

	public void sendKeyTextAreaReviewCanonEOS(String review) {
		textAreaReviewCanonEOS.sendKeys(review);
	}

	public void ClickOnOnContinueButtonCanonEOS() {
		continueButtonCanonEOS.click();
	}

	public void ClickOnRatingValueOne() {
		ratingValueOne.click();
	}

	public void ClickOnRatingValuetwo() {
		ratingValueTwo.click();

	}

	public void ClickOnRatingValueThree() {
		ratingValueThree.click();

	}

	public void ClickOnRatingValueFour() {
		ratingValueFour.click();
	}

	public void ClickOnRatingValueFive() {
		ratingValueFive.click();
		;

	}

	public void clickOnContinueButton() {
		continueButton.click();
	}

	public void ThankForReviewMessage() {

		String actualStrReviewMessage = thankForReviewMessage.getText();
		String expectedReviewMessage = "Thank you for your review. It has been submitted to the webmaster for approval.";
		Assert.assertEquals(actualStrReviewMessage, expectedReviewMessage);

	}

	public void GetDesktopAllItemsListList() throws InterruptedException {
		List<WebElement> list = desktopAllItemsList;
		System.out.println(list.size() + " size of element prsent in UI:");
		Thread.sleep(3000);
		for (int i = 0; i < list.size(); i++) {
			// String text = list.get(i).getText();
			// System.out.println(text);
			Assert.assertTrue(list.size() != 0);

		}

	}
}
