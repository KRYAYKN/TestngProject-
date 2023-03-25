package Pages.US13_14Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='login inline-type']") public WebElement singInBtn1;
    @FindBy(xpath = "(//*[@href='https://hubcomfy.com/my-account-2/'])[1]") public WebElement myAccountBtn;

}

