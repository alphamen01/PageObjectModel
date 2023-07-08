package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GlobalFeedPage extends BasePage {

    @FindBy(xpath = "//a[text()=' Global Feed ']")
    private WebElement globafeed;

    /*public By getGlobafeed() {
        return globafeed;
    }*/

    public GlobalFeedPage(WebDriver driver){
        super(driver);
    }

    public void findGlobalFeed() throws Exception {
        this.findElement(globafeed);
    }
}
