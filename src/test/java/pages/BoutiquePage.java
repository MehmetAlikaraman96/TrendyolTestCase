package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import static constants.Constants.*;

public class BoutiquePage extends BasePage {
    public  void waitUntilBoutiqueProductImageLoaded(WebElement element) {
        moveScrollToElement(element);
        try {
            wait.until(ExpectedConditions.not(ExpectedConditions.attributeContains(element, "src", "/Content/images/defaultThumb.jpg")));
        } catch (Exception  e) {
            System.out.println(element.getAttribute("alt")+ ": Ürün Resmi yüklenemedi.");
        }
    }
    public void checkProductImage() {
        clickRandomInList(findElements(By.xpath(navMenu)));
        clickRandomInList(findElements(By.xpath(boutiqueImage)));
        List <WebElement> elements = findElements(By.xpath(productImage));
        for (WebElement element : elements ) {
            waitUntilBoutiqueProductImageLoaded(element);
        }
        clickRandomInList(elements);
        clickElement(By.xpath(addBasket));
    }
}
