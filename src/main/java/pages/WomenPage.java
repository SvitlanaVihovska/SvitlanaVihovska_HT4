package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WomenPage extends BasePage{

    @FindBy(xpath = "//span[contains(text(),'SHOP GOING OUT')]")
    private WebElement ShopGoingOutButton;

    public WomenPage(WebDriver driver) {
        super(driver);
    }
    public WebElement getShopGoingOutButton() {return ShopGoingOutButton;}
    public void clickOnShopGoingOutButton() {
        ShopGoingOutButton.click();
    }
}
