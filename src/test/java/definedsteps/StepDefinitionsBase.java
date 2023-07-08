package definedsteps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.GlobalFeedPage;
import pageobjects.HomePage;
import pageobjects.LoginPage;

public class StepDefinitionsBase {

    protected WebDriver driver = Hooks.getDriver();
    protected HomePage homePage = PageFactory.initElements(driver,HomePage.class);
    protected LoginPage loginPage = PageFactory.initElements(driver,LoginPage.class);
    protected GlobalFeedPage globalFeedPage = PageFactory.initElements(driver,GlobalFeedPage.class);

}
