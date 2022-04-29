package utilities;

import browserfactory.BaseTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Utility extends BaseTest {

    public void clickOnElement(By by) {
        WebElement element = driver.findElement(by);
        element.click();
    }

    /*
    This method will get text from element
     */
    public String getTestFromElement(By by) {
        return driver.findElement(by).getText();
    }

    /*
    This method will send text to element
     */
    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    /*
    select method
     */
    public void selectByVisibleTextFromDropDown(By by, String text) {
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        select.selectByVisibleText(text);
    }
    // mouseHover Method
    public void mouseHover (By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).build().perform();
    }

    public String alertText() {
        Alert alert = driver.switchTo().alert();
        return alert.getText();
    }
    public void alertHandle () {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    // List element
    public List<WebElement> listWebelementslist(By by) {
        return  driver.findElements(by);
    }
}
