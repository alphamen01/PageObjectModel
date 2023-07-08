package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GlobalFeedPage extends BasePage {

    private By globafeed = By.xpath("//a[text()=' Global Feed ']");

    public By getGlobafeed() {
        return globafeed;
    }

    public GlobalFeedPage(WebDriver driver){
        super(driver);
    }

    public void findGlobalFeed() throws Exception {
        this.findElement(globafeed);
    }
}
