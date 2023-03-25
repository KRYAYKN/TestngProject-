package Pages.US13_14Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id='username']") public WebElement emailBox;
    @FindBy(xpath = "//*[@id='password']") public WebElement passwordBox;
    @FindBy(xpath = "//*[@name='login']") public WebElement singInBtn2;

}
