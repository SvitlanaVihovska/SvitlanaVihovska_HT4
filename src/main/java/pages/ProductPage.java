package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{

    @FindBy(xpath = "//select[@data-id='sizeSelect']")
    private WebElement SizeSelectInput;

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSizeSelectInput() {
       return SizeSelectInput;
    }
    public boolean isSizeSelectInputVisible() {return SizeSelectInput.isDisplayed();}
}
