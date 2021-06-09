package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SmokeTests extends BaseTest {
    private static final long DEFAULT_WAITING_TIME = 90;

    private String EXPECTED_AMOUNT_OF_PRODUCTS_IN_CART = "1 item";
    private String EXPECTED_SEARCH = "saved-lists";
    private String EXPECTED_USERNAME = "user";

    @Test
    public void checkProductInformation() {
        getHomePage().clickOnShopWomenButton();
        getHomePage().waitVisibilityOfElement(DEFAULT_WAITING_TIME, getWomenPage().getShopGoingOutButton());
        getWomenPage().clickOnShopGoingOutButton();
        getWomenClothesPage().clickOnSortFilter();
        getWomenClothesPage().clickOnSortFilterPriceHighToLow();
        getWomenClothesPage().getProduct();
        getWomenClothesPage().clickOnProduct();
        getHomePage().waitVisibilityOfElement(DEFAULT_WAITING_TIME,getProductPage().getSizeSelectInput());
        assertTrue(getProductPage().isSizeSelectInputVisible());
    }

    @Test
    public void checkAmountProductsInSavedItems() {
        getHomePage().clickOnShopWomenButton();
        getHomePage().waitVisibilityOfElement(DEFAULT_WAITING_TIME, getWomenPage().getShopGoingOutButton());
        getWomenPage().clickOnShopGoingOutButton();
        getWomenClothesPage().clickOnLike();
        getWomenClothesPage().clickOnSortFilter();
        getWomenClothesPage().clickOnSortFilterPriceHighToLow();
        getWomenClothesPage().clickOnSavedItemsButton();
        getHomePage().waitVisibilityOfElement(DEFAULT_WAITING_TIME, getSavedItemsPage().getTextOfAmountProductsInCart());
        assertTrue(getDriver().getCurrentUrl().contains(EXPECTED_SEARCH));
        assertEquals(getSavedItemsPage().getTextOfAmountProductsInCart().getText(), EXPECTED_AMOUNT_OF_PRODUCTS_IN_CART);
    }

    @Test
    public void checkErrorsOnSignInPage() {
        getHomePage().clickOnMyAccountIconButton();
        getHomePage().getSignInButton();
        getHomePage().clickOnSignInButton();
        getHomePage().waitVisibilityOfElement(DEFAULT_WAITING_TIME, getSignInPage().getUsernameInput());
        getSignInPage().enterUsername(EXPECTED_USERNAME);
        getSignInPage().clickOnPasswordInput();
        getHomePage().waitVisibilityOfElement(DEFAULT_WAITING_TIME,getSignInPage().getEmailAddressErrorPopUp());
        getSignInPage().getEmailAddressErrorPopUp();
        assertTrue(getSignInPage().isEmailAddressErrorPopUpVisible());
        getSignInPage().getPasswordErrorPopUp();
        assertTrue(getSignInPage().isPasswordErrorPopUpVisible());
    }
}
