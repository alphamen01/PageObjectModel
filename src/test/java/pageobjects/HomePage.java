package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    private String titleHomePage = "Conduit";

    @FindBy(xpath = "//a[@routerlink='/login']")
    private WebElement titleSignIn;

    /*
    public String getTitleHomePage() {
        return titleHomePage;
    }

    public By getTitleSignIn() {
        return titleSignIn;
    }*/

    public HomePage(WebDriver driver){
        super(driver);
    }

    public  boolean homePageIsDisplayed() throws Exception{
        return this.getTitle().equals(titleHomePage);
    }

    public void clickOnSignIn() throws Exception {
        this.click(titleSignIn);
    }
}
