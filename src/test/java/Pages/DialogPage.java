package Pages;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class DialogPage extends ParentPage{

    @FindBy(xpath = "//input[@id='input-email']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='input-password']")
    public WebElement password;

    @FindBy(xpath = "//*[@value='Login']")
    public WebElement btnLogin;

    @FindBy(xpath="//input[@type='radio' and @value='1']")
    public WebElement subYes;

    @FindBy(xpath="//*[@value='Continue']")
    public WebElement cntBtn;

    @FindBy(css="[class='alert alert-success alert-dismissible']")
    public WebElement msgLabel;

    public void verifyTitleContainsText(String text){
        wait.until(ExpectedConditions.titleContains(text));
        Assert.assertTrue(GWD.getDriver().getTitle().toLowerCase().contains(text.toLowerCase()), "Login olunamadı");
    }

    public void SuccessMessageValidation()
    {
        wait.until(ExpectedConditions.visibilityOf(msgLabel));
        Assert.assertTrue(msgLabel.getText().toLowerCase().contains("success"));
    }

}
