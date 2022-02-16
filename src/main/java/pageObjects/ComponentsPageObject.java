package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class ComponentsPageObject extends Base {

	public ComponentsPageObject() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Components']") 
	private WebElement componentsDropDown;

	@FindBy(xpath = "//a[contains (text(), 'Mice and Trackballs')]") 
	private WebElement miceAndTrackballsDropDown;

	@FindBy(xpath = "//a[text()='Mice and Trackballs']") 
	private WebElement textMiceAndTrackballs;

	@FindBy(xpath = "//p[contains(text(), 'There are')]") 
	private WebElement getTextmiceAndTrackball;

	@FindBy(xpath = "//li//li//a[contains(text(), 'Monitors')]") 
	private WebElement monitorsDropdown;

	@FindBy(xpath = "//h2[text()='Monitors']")
	private WebElement getTextmonitors; 

	@FindBy(xpath = "//h3[text()='Refine Search']")
	private WebElement refineSearch; 

	@FindBy(xpath = "//div//a[contains(text(), 'test 1 ')]") 
	private WebElement test1;

	@FindBy(xpath = "//div//a[contains(text(), 'test 2 ')]")
	private WebElement test2;

	@FindBy(xpath = "//a[contains(text(), 'Apple Cinema 30')]") 
	private WebElement AppleCinema30;

	@FindBy(xpath = "//p[contains(text(), 'The 30-inch')]") 
	private WebElement textOfappleCinema30;

	@FindBy(xpath = "//span[@class='price-new']")
	private WebElement appleCinemaPriceNew;

	@FindBy(xpath = "//span[@class='price-old']")
	private WebElement appleCinemaPriceOld;

	@FindBy(xpath = "//span[text()='Ex Tax: $90.00']")
	private WebElement getTextTax;

	@FindBy(xpath = "(//span[text()='Add to Cart'])[1]")
	private WebElement addToCartAppleCinema30;

	@FindBy(xpath = "(//i[@class='fa fa-heart'])[2]")
	private WebElement addTWishListAppleCinema30;

	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[1]")
	private WebElement compareThisProductAppleCinema30;

	@FindBy(xpath = "//a[text()='Samsung SyncMaster 941BW']")
	private WebElement getTextsamsung;

	@FindBy(xpath = "//p[contains(text(), 'Imagine the advantages')]")
	private WebElement getTextDescriptionsamsung;

	@FindBy(xpath = "//p[contains(text(), '242.00')]")
	private WebElement getTextPriceOfSamsung;

	@FindBy(className = "Ex Tax: $200.00")
	private WebElement getTextOfTaxOfSamsung;

	@FindBy(xpath = "(//span[text()='Add to Cart'])[2]")
	private WebElement addCartSamsungSyn; 

	@FindBy(xpath = "(//i[@class='fa fa-heart'])[3]")
	private WebElement wishListCartSamsungSyn; 

	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[2]")
	private WebElement compareCartSamsungSyn; // .click

	@FindBy(xpath = "//div[text()='Showing 1 to 2 of 2 (1 Pages)']")
	private WebElement textPageCartSamsungSyn; 

	@FindBy(linkText = "Printers (0)") 
	private WebElement printerDropDown;

	@FindBy(xpath = "//div//h2[text()='Printers']")
	private WebElement printTextPrinte; 

	@FindBy(xpath = "//p[contains(text(), 'There are no product')]")
	private WebElement getTextPrinter; 

	@FindBy(linkText = "Scanners (0)")
	private WebElement scannerDropDown; 

	@FindBy(xpath = "//h2[text()='Scanners']")
	private WebElement ScannerName; 

	@FindBy(xpath = "//p[contains(text(), 'There are no product')]")
	private WebElement getTextScanner; 

	
	public void componentsDropDown() {
		componentsDropDown.click();
	}

	public void miceAndTrackballs() {
		miceAndTrackballsDropDown.click();
	}

	public void textMiceAndTrackballs() {
		textMiceAndTrackballs.getText();
	}

	public void getTextmiceAndTrackball() {
		getTextmiceAndTrackball.getText();
	}

	public void monitorsDropdown() {
		monitorsDropdown.click();
	}

	public void getTextmonitor() {
		getTextmonitors.getText();
	}

	public void refineSearch() {
		refineSearch.getText();
	}

	public void test1() {
		test1.click();
	}

	public void test2() {
		test2.click();
	}

	public void AppleCinema30() {
		AppleCinema30.click();
	}

	public void textOfappleCinema30() {
		textOfappleCinema30.getText();
	}

	public void appleCinemaPriceNew() {
		appleCinemaPriceNew.getText();
	}

	public void appleCinemaPriceOld() {
		appleCinemaPriceOld.getText();
	}

	public void getTextTax() {
		getTextTax.getText();
	}

	public void addToCartAppleCinema30() {
		addToCartAppleCinema30.click();
	}

	public void addTWishListAppleCinema30() {
		addTWishListAppleCinema30.click();
	}

	public void compareThisProductAppleCinema30() {
		compareThisProductAppleCinema30.click();
	}

	public void getTextsamsung() {
		getTextsamsung.click();
	}

	public void getTextDescriptionsamsung() {
		getTextDescriptionsamsung.getText();
	}

	public void getTextPriceOfSamsung() {
		getTextPriceOfSamsung.getText();
	}

	public void getTextOfTaxOfSamsunga() {
		getTextOfTaxOfSamsung.getText();
	}

	public void addCartSamsungSyn() {
		addCartSamsungSyn.click();
	}

	public void wishListCartSamsungSyn() {
		wishListCartSamsungSyn.click();
	}

	public void compareCartSamsungSyna() {
		compareCartSamsungSyn.click();
	}

	public void textPageCartSamsungSyn() {
		textPageCartSamsungSyn.getText();
	}

	public void printer() {
		printerDropDown.click();
	}

	public void printTextPrinterName() {
		printTextPrinte.getText();
	}

	public void getTextPrinter() {
		getTextPrinter.getText();
	}

	public void scannerDropDowna() {
		scannerDropDown.click();
	}

	public void getTextScannerName() {
		ScannerName.getText();
	}

	public void getTextScanner() {
		getTextScanner.getText();
	}
//
}
