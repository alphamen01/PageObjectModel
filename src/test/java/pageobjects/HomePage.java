package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    private String titleHomePage = "Conduit";

    private By titleSignIn = By.xpath("//a[@routerlink='/login']");

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
