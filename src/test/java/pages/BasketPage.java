package pages;

import base.BasePage;
import org.openqa.selenium.By;

import static constants.Constants.*;

public class BasketPage extends BasePage {
public void controlBasket(){
    clickElement(By.xpath(myBasket));
    isVisibleElement(By.cssSelector(productItem));
}
}
