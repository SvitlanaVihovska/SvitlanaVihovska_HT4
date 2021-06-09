package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WomenClothesPage extends BasePage{

    @FindBy(xpath = "//div[contains(text(),'Sort')]")
    private WebElement SortFilter;
    @FindBy(xpath = "//li[contains(text(),'Price high to low')]")
    private WebElement SortFilterPriceHighToLow;
    @FindBy(xpath = "//div[@data-auto-id='productTileDescription']")
    private List<WebElement> ListOfProducts;
    @FindBy(xpath = "//button[@aria-label='Save for later']")
    private List<WebElement> ListOfLikes;
    @FindBy(xpath = "//a[@aria-label='Saved Items']")
    private WebElement SavedItemsButton;

    public WomenClothesPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnSortFilter() {SortFilter.click();}
    public void clickOnSortFilterPriceHighToLow() {SortFilterPriceHighToLow.click();}
    public WebElement getProduct() {return ListOfProducts.get(0);}
    public void clickOnProduct() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", getProduct());
    }
    public WebElement getLikes() {return ListOfLikes.get(0);}
    public void clickOnLike() {((JavascriptExecutor) driver).executeScript("arguments[0].click()", getLikes());}
    public void clickOnSavedItemsButton() {SavedItemsButton.click();}
}
