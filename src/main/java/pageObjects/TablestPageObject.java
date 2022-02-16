package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class TablestPageObject extends Base {

	public TablestPageObject() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(linkText = "Tablets")
	private WebElement tabletDropDown; 

	@FindBy(linkText = "Samsung Galaxy Tab 10.1")
	private WebElement printSamsungGalaxyTab10; 

	@FindBy(xpath = "//*[contains(text(), 'Samsung Galaxy Tab 10.1,')]")
	private WebElement tabletDescription; 

	@FindBy(xpath = "//p[@class='price']")
	private WebElement tabletPriceAndTax; 

	@FindBy(xpath = "//span[text()='Add to Cart']")
	private WebElement tabletAddToCart; 

	@FindBy(xpath = "//i[@class='fa fa-heart']")
	private WebElement tabletWishList; 

	@FindBy(xpath = "//i[@class='fa fa-exchange']")
	private WebElement tabletCompareButton;

	@FindBy(xpath = "	//div  [text()='Showing 1 to 1 of 1 (1 Pages)'] ")
	private WebElement getTextButtom;

	public void tabletDropDown() {
		tabletDropDown.click();
	}

	public void printSamsungGalaxyTab10() {
		printSamsungGalaxyTab10.click();
	}

	public void tabletDescription() {
		tabletDescription.getText();
	}

	public void tabletPriceAndTax() {
		tabletPriceAndTax.getText();
	}

	public void tabletAddToCart() {
		tabletAddToCart.click();
	}

	public void tabletWishList() {
		tabletWishList.click();
	}

	public void tabletCompareButton() {
		tabletCompareButton.click();
	}

	public void getTextButtom() {
		getTextButtom.getText();
	}
}