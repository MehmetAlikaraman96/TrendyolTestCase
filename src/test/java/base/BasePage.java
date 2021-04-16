package base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;
import java.util.Random;

public class BasePage extends BaseTest{


    protected WebElement findElement(By by) {
       return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }
    protected List<WebElement> findElements(By by) {
        return driver.findElements(by);
    }
    protected void clickElement(By by) {
     findElement(by).click();
    }
    protected void clickElements(By by, int index) {
     findElements(by).get(index).click();
    }
    protected void sendKeys(By by,String text) {
        findElement(by).sendKeys(text);
    }
    protected void isVisibleElement(By by){
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }
    protected void moveScrollToElement(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",element );
    }
    public void clickRandomInList(List<WebElement> listElement){
        Random rnd = new Random();
        int index = rnd.nextInt(listElement.size());
        moveScrollToElement(listElement.get(index));
        isClickableElement(listElement.get(index));
        listElement.get(index).click();
    }
    protected void isClickableElement(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

}
