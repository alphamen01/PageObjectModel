package definedsteps;

import org.openqa.selenium.WebDriver;
import pageobjects.GlobalFeedPage;
import pageobjects.HomePage;
import pageobjects.LoginPage;

public class StepDefinitionsBase {

    protected WebDriver driver = Hooks.getDriver();
    protected HomePage homePage = new HomePage(driver);
    protected LoginPage loginPage = new LoginPage(driver);
    protected GlobalFeedPage globalFeedPage = new GlobalFeedPage(driver);

}
