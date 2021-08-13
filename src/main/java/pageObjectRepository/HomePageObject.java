package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class HomePageObject extends Base {

	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@name='search']")
	private WebElement searchBar;
	
	@FindBy(xpath = "//button[@xpath='1']")
	private WebElement searchButton;
	
	public void enterItem(String iphone) {
		WebDriverUtility.enterValue(searchBar, iphone);
	}
	public void clickOnSearchButton() {
		WebDriverUtility.clickOnElement(searchButton);
}
}
