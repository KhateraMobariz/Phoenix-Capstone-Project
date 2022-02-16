package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class Mp3PlayersPageObject extends Base {

	public Mp3PlayersPageObject() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "MP3 Players")
	private WebElement mP3Players;

	@FindBy(linkText = "test 11 (0)")
	private WebElement test11Dropdown;

	@FindBy(xpath = "//h2[text()='test 11']")
	private WebElement printText11;

	@FindBy(xpath = "//p[contains(text(), 'There are no products')]")
	private WebElement getText11;

	@FindBy(linkText = "test 12 (0)")
	private WebElement test12Dropdown;

	@FindBy(xpath = "//h2[text()='test 12']")
	private WebElement printText12;

	@FindBy(linkText = "test 15 (0)")
	private WebElement test15Dropdown;

	@FindBy(xpath = "//h2[text()='test 15']")
	private WebElement printText15;

	@FindBy(linkText = "test 17 (0)")
	private WebElement test17Dropdown;

	@FindBy(xpath = "//h2[text()='test 17']")
	private WebElement printText17;

	@FindBy(linkText = "test 18 (0)")
	private WebElement test18Dropdown;

	@FindBy(xpath = "//h2[text()='test 18']")
	private WebElement printText18;

	@FindBy(linkText = "test 19 (0)")
	private WebElement test19Dropdown;

	@FindBy(xpath = "//h2[text()='test 19']")
	private WebElement printText19;

	@FindBy(linkText = "test 20 (0)")
	private WebElement test20Dropdown;

	@FindBy(xpath = "test 20")
	private WebElement printText20;

	@FindBy(linkText = "test 21 (0)")
	private WebElement test21Dropdown;

	@FindBy(xpath = "//h2[text()='test 21']")
	private WebElement printText21;

	@FindBy(linkText = "test 22 (0))")
	private WebElement test22Dropdown;

	@FindBy(xpath = "//h2[text()='test 22']")
	private WebElement printText22;

	@FindBy(linkText = "test 23 (0))")
	private WebElement test23Dropdown;

	@FindBy(xpath = "///h2[text()='test 23']")
	private WebElement printText23;

	@FindBy(linkText = "test 24 (0)")
	private WebElement test24Dropdown;

	@FindBy(xpath = "//h2[text()='test 24']")
	private WebElement printText24;

	@FindBy(linkText = "test 4 (0)")
	private WebElement dropdowntest4;

	@FindBy(xpath = "//h2[text()='test 4']")
	private WebElement printTextTest4;

	@FindBy(linkText = "test 5 (0)")
	private WebElement dropdowntest5;

	@FindBy(xpath = "//h2[text()='test 5']")
	private WebElement printTextTest5;

	@FindBy(linkText = "test 6 (0)")
	private WebElement dropdowntest6;

	@FindBy(xpath = "//h2[text()='test 6']")
	private WebElement printTextTest6;

	@FindBy(linkText = "test 7 (0)")
	private WebElement dropdowntest7;

	@FindBy(xpath = "//h2[text()='test 7']")
	private WebElement printTextTest7;

	@FindBy(linkText = "test 8 (0)")
	private WebElement dropdownTest8;

	@FindBy(xpath = "//h2[text()='test 8']")
	private WebElement printTextTest8;

	@FindBy(linkText = "test 9 (0)")
	private WebElement dropdownTest9;

	@FindBy(xpath = "//h2[text()='test 9']")
	private WebElement printTextTest9;

	public void mP3Players() {
		mP3Players.click();
	}

	public void test11Dropdown() {
		test11Dropdown.click();
	}

	public void printText11() {
		printText11.getText();
	}

	public void test12Dropdown() {
		test12Dropdown.click();
	}

	public void printText12() {
		printText12.getText();
	}

	public void test15Dropdown() {
		test15Dropdown.click();
	}

	public void printText15() {
		printText15.getText();
	}

	public void test17Dropdown() {
		test17Dropdown.click();
	}

	public void printText17() {
		printText17.getText();
	}

	public void test18Dropdown() {
		test18Dropdown.click();
	}

	public void printText18() {
		printText18.getText();
	}

	public void test19Dropdown() {
		test19Dropdown.click();
	}

	public void printText19() {
		printText19.getText();
	}

	public void test20Dropdown() {
		test20Dropdown.click();
	}

	public void printText20() {
		printText20.getText();
	}

	public void test21Dropdown() {
		test21Dropdown.click();
	}

	public void printText21() {
		printText21.getText();
	}

	public void test22Dropdown() {
		test22Dropdown.click();
	}

	public void printText22() {
		printText22.getText();
	}

	public void test23Dropdown() {
		test23Dropdown.click();
	}

	public void printText23() {
		printText23.getText();
	}

	public void test24Dropdown() {
		test24Dropdown.click();
	}

	public void printText24() {
		printText24.getText();
	}

	public void test4Dropdown() {
		test24Dropdown.click();
	}

	public void printText4() {
		printTextTest4.getText();
	}

	public void test5Dropdown() {
		dropdowntest5.click();
	}

	public void printText5() {
		printTextTest5.getText();
	}

	public void test6Dropdown() {
		dropdowntest6.click();
	}

	public void printText6() {
		printTextTest6.getText();
	}

	public void test7Dropdown() {
		dropdowntest7.click();
	}

	public void printText7() {
		printTextTest7.getText();
	}

	public void test8Dropdown() {
		dropdownTest8.click();
	}

	public void printText8() {
		printTextTest8.getText();
	}

	public void test9Dropdown() {
		dropdownTest9.click();
	}

	public void printText9() {
		printTextTest9.getText();
	}
}
