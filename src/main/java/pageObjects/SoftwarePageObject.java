package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class SoftwarePageObject extends Base {

	public SoftwarePageObject() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Software")
	private WebElement software;

	@FindBy(xpath = "//h2 [text()='Software']")
	private WebElement softwareTextName;

	@FindBy(xpath = "//p[text()='There are no products to list in this category.']                              ")
	private WebElement tableText;

	public void software() {
		software.click();
	}

	public void softwareTextName() {
		softwareTextName.getText();
	}

	public void tableText() {
		tableText.getText();
	}

}