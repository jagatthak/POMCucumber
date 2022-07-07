package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class MyStepDefs {

    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationSuccessPage registrationSuccessPage = new RegistrationSuccessPage();
    LoadProp loadprop = new LoadProp();

    @Given("user is on registration page")
    public void user_is_on_registration_page() {
        // Write code here that turns the phrase above into concrete actions
       homePage.ClickOnRegisterButton();
        //user should verify Register Page Url
       registrationPage.UserShouldVerifyRegisterUrl();
       }
    @When("user enters required registration details")
    public void user_enters_required_registration_details() {
        // Write code here that turns the phrase above into concrete actions
        registrationPage.UserEntersAllRegistrationDetails();

    }
    @When("user clicks on register submit button")
    public void user_clicks_on_register_submit_button() {
        // Write code here that turns the phrase above into concrete actions
        registrationPage.UserShouldClickOnRegisterButton();
    }
    @Then("user should be able to register successfully")
    public void user_should_be_able_to_register_successfully() {
        // Write code here that turns the phrase above into concrete actions
        registrationSuccessPage.UserShouldRegisterSuccessfully();
    }
    @Then("user should be logged in")
    public void user_should_be_logged_in() {
        // Write code here that turns the phrase above into concrete actions
        registrationSuccessPage.UserShouldClickOnContinueButton();
    }

    @Given("User is on homepage")
    public void user_is_on_homepage() {
        // Write code here that turns the phrase above into concrete actions
        Utils.verifyCurrentURL(loadprop.getProperty("urlHomePage"));
    }
    @When("User clicks on {string} link from top header menu")
    public void user_clicks_on_link_from_top_header_menu(String category_name) {
        // Write code here that turns the phrase above into concrete actions
        homePage.clickoncategorylink(category_name);
    }
    @Then("User should be able to navigate successfully to {string} page")
    public void user_should_be_able_to_navigate_successfully_to_page(String category_url ) {
        // Write code here that turns the phrase above into concrete actions
        Utils.verifyCurrentURL(category_url);
    }

}
