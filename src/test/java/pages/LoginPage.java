package pages;

import base.BasePage;
import org.openqa.selenium.By;

import static constants.Constants.*;

public class LoginPage extends BasePage {
    public void login() {
        clickElement(By.className(closeModal));
        clickElement(By.xpath(goLogin));
        sendKeys(By.id(userName),"eticarettest2020@gmail.com");
        sendKeys(By.id(password),"test123");
        clickElement(By.xpath(loginBtn));
        isVisibleElement(By.xpath(myAccount));
    }
}
