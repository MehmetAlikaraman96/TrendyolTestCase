package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.BasketPage;
import pages.BoutiquePage;
import pages.HomePage;
import pages.LoginPage;

public class TestCase extends BaseTest {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    BoutiquePage boutiquePage = new BoutiquePage();
    BasketPage basketPage = new BasketPage();

    @Test
    public void testCaseTrendyol() {
        loginPage.login();
        homePage.checkBoutiqueImageIsLoaded();
        boutiquePage.checkProductImage();
        basketPage.controlBasket();
    }
}
