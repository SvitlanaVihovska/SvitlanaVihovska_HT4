package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

@FindBy(xpath = "//span[contains(text(),'SHOP WOMEN')]")
private WebElement ShopWomenButton;
@FindBy(xpath = "//button[@data-testid='myAccountIcon']")
private WebElement MyAccountIconButton;
@FindBy(xpath = "//a[contains(text(),'Sign In')]")
private WebElement SignInButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnMyAccountIconButton() {MyAccountIconButton.click();}
    public void clickOnShopWomenButton() {((JavascriptExecutor) driver).executeScript("arguments[0].click()", ShopWomenButton);}
    public WebElement getSignInButton() {
        return SignInButton;
    }
    public void clickOnSignInButton() {((JavascriptExecutor) driver).executeScript("arguments[0].click()", SignInButton);}
}
