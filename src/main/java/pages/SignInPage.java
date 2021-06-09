package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage{

    @FindBy(xpath = "//input[@name='Username']")
    private WebElement UsernameInput;
    @FindBy(xpath = "//input[@id='Password']")
    private WebElement PasswordInput;
    @FindBy(xpath = "//span[@id='EmailAddress-error']")
    private WebElement EmailAddressErrorPopUp;
    @FindBy(xpath = "//span[@id='Password-error']")
    private WebElement PasswordErrorPopUp;

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getUsernameInput() {return UsernameInput;}
    public void enterUsername (final String keyword) {
        UsernameInput.clear();
        UsernameInput.sendKeys(keyword, Keys.ENTER);
    }
    public void clickOnPasswordInput() {PasswordInput.click();}
    public WebElement getEmailAddressErrorPopUp() {return EmailAddressErrorPopUp;}
    public WebElement getPasswordErrorPopUp() {return PasswordErrorPopUp;}
    public boolean isEmailAddressErrorPopUpVisible() {return EmailAddressErrorPopUp.isDisplayed();}
    public boolean isPasswordErrorPopUpVisible() {return PasswordErrorPopUp.isDisplayed();}
}
