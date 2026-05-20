package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _01_LoginSteps {

    @Given("Navigate to WebSite")
    public void navigateToWebSite() {
        //sitenin açılacağı yer
        GWD.getDriver().get("https://opencart.abstracta.us/index.php?route=account/login");
    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        //username password gönder login e tıklat
       //pomSayfa.username.SendKeys("username");
       // pomSayfa.password.SendKeys("password");
       // pomSayfa.LoginButton.Click();
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        //girildiğini validate et
    }

}
