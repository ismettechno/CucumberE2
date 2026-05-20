package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogPage {

    public DialogPage() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath = "")
    public WebElement username;

    @FindBy(xpath = "")
    public WebElement password;

    @FindBy(xpath = "")
    public WebElement btnLogin;

    public void mySendKeys(WebElement e, String text)
    {
        //beklemesi
        //scroll
        //clear
        //sendKeys
    }

    public void myClick(WebElement e)
    {
        //beklemesi
        //scroll
        //click
    }


}
