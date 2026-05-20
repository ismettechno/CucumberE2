package StepDefinitions;

import Pages.DialogPage;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _01_LoginSteps {
    DialogPage dp=new DialogPage();

    @Given("Navigate to WebSite")
    public void navigateToWebSite() {
        //sitenin açılacağı yer
        GWD.getDriver().get("https://opencart.abstracta.us/index.php?route=account/login");
    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        dp.mySendKeys(dp.username,"ismet");
        dp.mySendKeys(dp.password,"1234");
        dp.myClick(dp.btnLogin);
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        //girildiğini validate et
    }

}
