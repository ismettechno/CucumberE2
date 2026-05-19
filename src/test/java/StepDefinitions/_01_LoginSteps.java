package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _01_LoginSteps {

    @Given("Navigate to WebSite")
    public void navigate_to_web_site() {
         // siteyi aç
    }

    @When("Enter username and password and click login button")
    public void enter_username_and_password_and_click_login_button() {
        // username şifre gönder tıklat
    }

    @Then("User should login successfully")
    public void user_should_login_successfully() {
       // siteye girildiğinin kontrolünü yap
    }

}
