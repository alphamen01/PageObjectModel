package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    @FindBy(xpath = "//input[@formcontrolname='email']")
    private WebElement email;

    @FindBy(xpath = "//input[@formcontrolname='password']")
    private WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement buttonSignIn;

    private String emailc = "lesg.2233@gmail.com";
    private String passwordc = "LuisEnrique";

    /*public By getButtonSignIn() {
        return buttonSignIn;
    }

    public By getEmail() {
        return email;
    }

    public By getPassword() {
        return password;
    }*/

    public LoginPage(WebDriver driver){
        super(driver);
    }

    public void clickButtonSignIn() throws Exception {
        this.click(buttonSignIn);
    }

    public void insertEmail() throws Exception {
        this.insertKeys(email,emailc);
    }

    public void insertPassword() throws Exception {
        this.insertKeys(password,passwordc);
    }
}
