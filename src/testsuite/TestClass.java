package testsuite;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

import java.util.List;

public class TestClass extends Utility {

    String baseUrl = "https://www.amazon.co.uk/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @Test
    public void dellLaptonOnSearch() {
        //click on search tab
        clickOnElement(By.xpath("//input[@name='field-keywords']"));
        // click on cookies
        clickOnElement(By.xpath("//input[@class='a-button-input celwidget']"));
        //send text to the search bar
        sendTextToElement(By.xpath("//input[@name='field-keywords']"),"Dell Laptop");
        // click on search button
        clickOnElement(By.xpath("//input[@class='nav-input nav-progressive-attribute' and @value='Go']"));
        //2.1 click on the checkbox brand dell on the left side
        clickOnElement(By.xpath("//ul[@aria-labelledby='p_89-title']//li[@aria-label='Dell']//i[@class='a-icon a-icon-checkbox']"));

        //4.1 Verify that the 30(may be different) products ar displayed on the page
        List<WebElement> delllist = listWebelementslist(By.xpath("//div[@class='s-main-slot s-result-list s-search-results sg-row']//a/span[contains(text(),'Dell')]"));
        System.out.println(delllist.size());
        for (WebElement a: delllist) {
            String a1 = a.getText();

            System.out.println(a1);
        }

        // 6.1 close the browser
        closeBrowser();

    }
}
