package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.RegistrationPage;

public class RegistrationSteps {
	
	RegistrationPage registrationPage = new RegistrationPage();
	
	@Given("I enter paraBank homepage")
	public void i_enter_para_bank_homepage() {
		registrationPage.enterHomePage();
	}

	@When("I click register link")
	public void i_click_register_link() {
	    registrationPage.clickRegister();
	}

	@Then("I redirected to registration page")
	public void i_redirected_to_registration_page() {
	    registrationPage.verifyRegistrationPage();   
	}

	@When("I enter all fields")
	public void i_enter_all_fields() {
	    registrationPage.enterAllFields();
	    
	}

	@When("click register button")
	public void click_register_button() {
	    registrationPage.clickRegisterButton();
	}

	@Then("I see success page")
	public void i_see_success_page() {
		registrationPage.registerSuccesspage();
	    
	}
	
	@When("I enter mandatory fields")
	public void i_enter_mandatory_fields() {
		registrationPage.entermandatoryFields();
	}


}
