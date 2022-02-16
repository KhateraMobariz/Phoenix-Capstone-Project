package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class PhonesPDAsPageObject extends Base {

	public PhonesPDAsPageObject() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Phones & PDAs")
	private WebElement PhonesAndPDAs;

	@FindBy(linkText = "//h2[text()='Phones & PDAs']")
	private WebElement phonesAndPDAsName;

	@FindBy(linkText = "HTC Touch HD")
	private WebElement HTCTouchHDPhonesAndPDAs;

	@FindBy(xpath = "//p[contains(text(), 'HTC Touch')]")
	private WebElement hTcDecription;

	@FindBy(xpath = "(//*[@class='price'])[1]")
	private WebElement hTcPriceAndTax;

	@FindBy(xpath = "(//*[text()='Add to Cart'])[1]")
	private WebElement hTCAddtoCart;

	@FindBy(xpath = "(//*[@class='fa fa-heart'])[2]")
	private WebElement hTCWishList;

	@FindBy(xpath = "(//*[@class='fa fa-exchange'])[1]")
	private WebElement hTCCompareThisProduct;

	@FindBy(linkText = "iPhone")
	private WebElement iPhone;

	@FindBy(xpath = "//p[contains(text(), 'iPhone is a revolutionary')]")
	private WebElement iPhoneDecription;

	@FindBy(xpath = "(//*[@class='price'])[2]")
	private WebElement iPhonePriceAndTax;

	@FindBy(xpath = "(//*[text()='Add to Cart'])[2]")
	private WebElement iPhoneAddToCart;

	@FindBy(xpath = "(//*[@class='fa fa-heart'])[3]]")
	private WebElement iPhoneWishList;

	@FindBy(xpath = "(//*[@class='fa fa-exchange'])[2]")
	private WebElement iPhoneCompareThisProduct;

	@FindBy(linkText = "Palm Treo Pro")
	private WebElement palTreoPro;

	@FindBy(xpath = "//p[contains(text(), 'Redefine your workday')]")
	private WebElement palTreoProDescription;

	@FindBy(xpath = "(//*[@class='price'])[3]")
	private WebElement palPriceAndTax;

	@FindBy(xpath = "(//*[text()='Add to Cart'])[3]")
	private WebElement palAddToCart;

	@FindBy(xpath = "(//*[@class='fa fa-heart'])[4]")
	private WebElement palWishList;

	@FindBy(xpath = "(//*[@class='fa fa-exchange'])[3]")
	private WebElement palCompare;

	@FindBy(xpath = "//div[@class='col-sm-6 text-right']")
	private WebElement BottomText;

	public void PhonesAndPDAs() {
		PhonesAndPDAs.click();
	}

	public void getPhonesAndPDAsName() {
		phonesAndPDAsName.getText();
	}

	public void HTCTouchHDPhonesAndPDAs() {
		HTCTouchHDPhonesAndPDAs.click();
	}

	public void hTcDecription() {
		hTcDecription.getText();
	}

	public void hTcPriceAndTax() {
		hTcPriceAndTax.getText();
	}

	public void hTCAddtoCart() {
		hTCAddtoCart.click();
	}

	public void hTCWishList() {
		hTCWishList.click();
	}

	public void hTCCopareThisProduct() {
		hTCCompareThisProduct.click();
	}

	public void iPhone() {
		iPhone.click();
	}

	public void iPhoneDecription() {
		iPhoneDecription.getText();
	}

	public void iPhonePriceAndTax() {
		iPhonePriceAndTax.getText();
	}

	public void iPhoneAddToCart() {
		iPhoneAddToCart.click();
	}

	public void iPhoneWishList() {
		iPhoneWishList.click();
	}

	public void iPhoneCompareThisProduct() {
		iPhoneCompareThisProduct.click();
	}

	public void palTreoPro() {
		palTreoPro.click();
	}

	public void palTreoProDescription() {
		palTreoProDescription.getText();
	}

	public void palPriceAndTax() {
		palPriceAndTax.getText();
	}

	public void palAddToCart() {
		palAddToCart.click();
	}

	public void palWishList() {
		palWishList.click();
	}

	public void palCompare() {
		palCompare.click();
	}

	public void BottomText() {
		BottomText.getText();
	}
}
