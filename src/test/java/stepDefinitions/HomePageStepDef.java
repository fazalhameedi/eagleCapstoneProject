package stepDefinitions;

import core.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.WebDriverUtility;
import pageObjectRepository.HomePageObject;
public class HomePageStepDef extends Base{

	HomePageObject search = new HomePageObject();
	
//	@Given("^User is on Retail Website$")
//	public void user_is_on_Retail_Website() {
//		openBrowser();
	//	Logger.info("Retail Website is opened");
	//	WebDriverUtility.screenShot();
//	}

	@When("^User type '(.+)' on searchbar$")
	public void user_Type_On_Searchbar(String item) {
	search.enterItem(item);
	Logger.info("User Entered Item");
	}
	
	@And("^User click on search icon$")
	public void user_click_on_Search_icon() {
	search.clickOnSearchButton();
	Logger.info("User Clicked on search button");
	}

	@Then("^User should see available iphones$")
	public void user_should_see_available_iphones() {
		WebDriverUtility.wait(5000);
		WebDriverUtility.screenShot();
		Logger.info("User can see available iphones");
}
}
