package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utilities;

public class RetailPageObjects extends Base {

	// in this class we are storing our pageobjects/attributes/locator
	// we will implement the PageFactory.initElements to initialize our page objects
	// PageFactory is coming form selenium
	// once we get the loctor for our elements, we use the @FindBy annotation from
	// selenium
	// store our pageobjects and we can write a get method to access our pageobject
	// in stepDefinition class
	// we will store our elements as private webelement, so that we can only access
	// them through get method

	public RetailPageObjects() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement textToValildate;

	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccountButton;

	@FindBy(xpath = "//a[text()='Login']")
	private WebElement loginButton;

	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement userNameFiled;

	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement passwordField;

	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginButtonMain;

	@FindBy(xpath = "//div[@id='content']//h2[1]")
	private WebElement myAccountDashboard;
	// div[@id='account-account']"

	@FindBy(xpath = "//*[@id=\"content\"]/ul[3]/li/a")
	private WebElement registerAffiliateAccount;

	@FindBy(xpath = "//input[@id='input-company']")
	private WebElement companyField;

	@FindBy(xpath = "//input[@id='input-website']")
	private WebElement websiteField;

	@FindBy(xpath = "//input[@id='input-tax']")
	private WebElement taxIDField;

	@FindBy(xpath = "//input[@value='cheque']")
	private WebElement chequeRadio;

	@FindBy(xpath = "//label[normalize-space()='PayPal']")
	private WebElement payPalRadio;

	@FindBy(xpath = "//input[@value='bank']")
	private WebElement bankRadio;

	@FindBy(xpath = "//input[@id='input-paypal']")
	private WebElement inputPayPalEmailAccount;

	@FindBy(xpath = "//label[normalize-space()='Cheque']")
	private WebElement paymentMethodRadioButtonCheque;

	@FindBy(xpath = "//input[@id='input-cheque']")
	private WebElement chequePayeeBox;

	@FindBy(xpath = "//body/div[@id='account-affiliate']/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
	private WebElement checkBoxButton;

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButton;

	@FindBy(xpath = "//input[@value='Continue']")
	
	////input[@type='submit']
	//*[@id=\"content\"]/form/div/div/input[2]
	private WebElement continueButtonOfAfiliateAcc;

	public void clickOnContinueButtonOfAfiliateAcc() {
		continueButtonOfAfiliateAcc.click();
		try {
			Thread.sleep(3000);

		} catch (Exception e) {
			// TODO: handle exception

			e.printStackTrace();
		}
	}

	@FindBy(xpath = "//input[@id='input-cheque']")
	private WebElement chequPayeeBox;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")//*[@id=\"account-account\"]/div[1]
	//*[@id="content"]/form/div/div/input
	private WebElement createdAfiliateAccountSuccessMss;

	@FindBy(xpath = "//*[@id=\"content\"]/ul[3]/li[1]/a")
	private WebElement editAffiliateAccount;

	@FindBy(xpath = "//input[@id='input-bank-name']")
	private WebElement bankNameField;

	@FindBy(xpath = "//input[@id='input-bank-branch-number']")
	private WebElement bankABAFiled;

	@FindBy(xpath = "//input[@id='input-bank-swift-code']")
	private WebElement sWIFTCodeFiled;

	@FindBy(xpath = "//input[@id='input-bank-account-name']")
	private WebElement accountNameFiled;

	@FindBy(xpath = "//input[@id='input-bank-account-number']")
	private WebElement accountNumberField;

	@FindBy(xpath = "//*[@id=\"account-account\"]/div[1]")
	private WebElement successMessage;

	@FindBy(linkText = "Edit your account information")
	private WebElement editMyAccountInfo;

	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement editMyFirstName;

	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement editMyLastName;

	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement editMyEmail;

	@FindBy(xpath = "//input[@id='input-telephone']")
	private WebElement editMyTelephoneNum;

	@FindBy(xpath = "//div//div[@class='alert alert-success alert-dismissible']")
	private WebElement editSuccessMessage;

	@FindBy(xpath = "//li//a[text()='Register'][1]")
	private WebElement register;
	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement firstNameField;
	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement lastNameField;
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement emailField;
	@FindBy(xpath = "//input[@id='input-telephone']")
	private WebElement telephoneField;
	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement passwordFieldd;
	@FindBy(xpath = "//input[@id='input-confirm']")
	private WebElement confirmPasswordField;
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement agreeToTermsCheckBox;
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButtonn;
	@FindBy(xpath = "//aside[@id='column-right']//a[text()='My Account']")
	private WebElement myAccountButtonpage;

	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccountButtonnn;

	@FindBy(xpath = "//li//a[contains(text(),'Logout')][1]")
	private WebElement myAccountLogoutButton;

	@FindBy(xpath = "//input[@name='agree']")
	private WebElement myAccountAgreeButton;

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement myAccountContineButton;

	public void validateHomePage() {
		String text = textToValildate.getText();
		if (text.equalsIgnoreCase("TEST ENVIRONMENT")) {
			logger.info("Text verified!");
		} else {
			logger.info("Text does not match!");
		}
	}

	public void clickOnMyAccountButton() {
		myAccountButton.click();
	}

	public void clickOnLoginButton() {
		loginButton.click();
	}

	public void enterUserName() {
		userNameFiled.sendKeys("mm113@gmail.com");
	}

	public void enterPassword() {
		passwordField.sendKeys("12345");
	}

	public void clickOnLoginButtonMain() {
		loginButtonMain.click();
	}

	public void verifiedMyAccountDashboard() {
		myAccountDashboard.getText();

	}

	public void clickOnRegisterAffiliateAccount() {
		registerAffiliateAccount.click();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void sendkeysCompanyField(String company) {
		companyField.clear();
		companyField.sendKeys(company);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void sendkeysWebsiteField(String website) {
		websiteField.clear();
		websiteField.sendKeys(website);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void sendkeystaxIDField(String taxID) {
		taxIDField.clear();
		taxIDField.sendKeys(taxID);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void clickonChequeRadioButton() {
		Utilities.waitAndClickElement(chequeRadio);

	}

	public void clickOnPayPalRadioButton() throws InterruptedException {

		payPalRadio.click();

		Thread.sleep(2000);
	}

	public void clickOnBankRadioButton() throws InterruptedException {
		bankRadio.click();

		Thread.sleep(2000);
	}

	public void sendkeyPayPalEmail() {
		chequePayeeBox.clear();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {

		}
		chequePayeeBox.sendKeys("pam");
	}

	public void clickOnCheckBoxButton() {
		checkBoxButton.click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickOnContinueButton() throws InterruptedException {

		Thread.sleep(3000);
		Utilities.waitAndClickElement(continueButton);
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void createdAfiliateAccountSuccessMessage() throws Exception {
		String expectedText = "Success: Your account has been successfully updated.";
		String actualText = createdAfiliateAccountSuccessMss.getText();
		try {
			Assert.assertEquals(expectedText, actualText);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickOnEditAffiliateAccount() {
		editAffiliateAccount.click();
	}

	public void clickOnBankRadioButtonEdit() {
		bankRadio.click();
	}

	public void senkeysBankNameField(String bankName) {
		bankNameField.clear();
		bankNameField.sendKeys(bankName);

	}

	public void sendkeysBankABAFiled(String abaNumber) {
		bankABAFiled.clear();
		bankABAFiled.sendKeys(abaNumber);

	}

	public void sendkeysSWIFTCodeFild(String swiftCode) {
		sWIFTCodeFiled.clear();
		sWIFTCodeFiled.sendKeys(swiftCode);

	}

	public void sendkeysAccountNameFiled(String accountName) {
		accountNameFiled.clear();
		accountNameFiled.sendKeys(accountName);
	}

	public void sendkeysAccountNumberField(String accountNumber) {
		accountNumberField.clear();
		accountNumberField.sendKeys(accountNumber);
	}

	public void textSuccessMessageChange() throws Exception {
		String spectedText = "Success: Your account has been successfully updated.";
		String actualText = successMessage.getText();

		try {
			Assert.assertEquals(spectedText, actualText);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickEditMyAccountInfo() {
		editMyAccountInfo.click();
	}

	public void sendkeyEditFirstName(String firstname) {
		editMyFirstName.clear();
		editMyFirstName.sendKeys(firstname);
	}

	public void sendKeyEditMyLastName(String lastName) {
		editMyLastName.clear();
		editMyLastName.sendKeys(lastName);
	}

	public void sendkeyEditMyEmail(String email) {
		editMyEmail.clear();
		editMyEmail.sendKeys(email);
	}

	public void sendkeyEditMyTelephoneNum(String telephone) {
		editMyTelephoneNum.clear();
		editMyTelephoneNum.sendKeys(telephone);
	}

	public void verifiedEditSuccessMessage() throws Exception {

		String expectedMssg = "Success: Your account has been successfully updated.";
		String actulaMssg = editSuccessMessage.getText();
		try {
			Assert.assertEquals(expectedMssg, actulaMssg);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void ClickOnMyAccountButtonpage() {

		Utilities.waitAndClickElement(myAccountButtonpage);
	}

	public void clickOnRegister() {

		register.click();
	}

	public void enterFirstName(String firstname) {
		firstNameField.sendKeys(firstname);
	}

	public void enterLastName(String lastname) {
		lastNameField.sendKeys(lastname);
	}

	public void enterEmail(String email) {
		emailField.sendKeys(email);
	}

	public void enterTelephoneNumber(String phonenumber) {
		telephoneField.sendKeys(phonenumber);
	}

	public void enterPassword(String password) {
		passwordField.sendKeys(password);
	}

	public void enterConfirmPassword(String confirmPassword) {
		confirmPasswordField.sendKeys(confirmPassword);
	}

	public void confirmTermsCheckBox() {
		agreeToTermsCheckBox.click();
	}

	public void clickOnContinueButtonMyAcc() {
		continueButtonn.click();
	}

	public void clickOnMyAccountButtonnn() {

		Utilities.waitAndClickElement(myAccountButtonnn);
	}

	public void clickOnMyAccountLogoutButton() {

		try {
			Thread.sleep(3000);

		} catch (Exception e) {

			myAccountLogoutButton.click();
		}
	}

	public void clickOnMyAccountAgreeButton() {
		Utilities.waitAndClickElement(myAccountAgreeButton);
	}

	public void clickOnMyAccountContineButton() {
		Utilities.waitAndClickElement(myAccountContineButton);
	}
}
