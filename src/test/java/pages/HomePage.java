package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import static constants.Constants.*;

public class HomePage extends BasePage {
    int totalListMenu;
    List<WebElement> elements;

    public  void waitUntilBoutiqueImageIsLoaded(WebElement element) {
        moveScrollToElement(element);
        try {
            wait.until(ExpectedConditions.not(ExpectedConditions.attributeContains(element, "src", "https://cdn.dsmcdn.com/web/production/large_boutique_placeholder.png")));
        } catch (Exception  e) {
            System.out.println(element.getAttribute("alt")+ ": Butik Resmi yüklenemedi.");
        }
    }

    public void checkBoutiqueImageIsLoaded() {
        totalListMenu = findElements(By.xpath(navMenu)).size();

        for (int i=0; i<totalListMenu; i++) {
            clickElements(By.xpath(navMenu),i);
            elements =findElements(By.xpath(boutiqueImage));
            for (WebElement element : elements ) {
                waitUntilBoutiqueImageIsLoaded(element);
            }
        }
    }


}
