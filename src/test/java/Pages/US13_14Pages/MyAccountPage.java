package Pages.US13_14Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
    public MyAccountPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//*[text()='Addresses'])[1]") public WebElement addressBtn;
    @FindBy(xpath = "//*[text()='Store Manager']") public WebElement storeManagerBtn;
}
