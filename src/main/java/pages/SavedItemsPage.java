package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SavedItemsPage extends BasePage{
    @FindBy(xpath = "//main//div[(contains(@class,'itemCount'))]")
    private WebElement amountOfProductsInCart;

    public SavedItemsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getTextOfAmountProductsInCart() {
        return amountOfProductsInCart;
    }
}
