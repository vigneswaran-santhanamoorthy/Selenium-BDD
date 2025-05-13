package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

public class LoginSteps {
	
	LoginPage loginPage = new LoginPage();
	
	
	@When("I check the customer login links and buttons")
	public void i_check_the_customer_login_links_and_buttons() {
	    loginPage.loginchecks();
	}

	@When("I enter {string} and {string} and click log in button")
	public void i_enter_and_and_click_log_in_button(String username, String password) {
		loginPage.login(username, password);
	}

	@Then("I check accounts overview page and balance")
	public void i_check_accounts_overview_page_and_balance() {
	   
	}

	@Then("I click the account number to see the account details")
	public void i_click_the_account_number_to_see_the_account_details() {
	   
	}

}
