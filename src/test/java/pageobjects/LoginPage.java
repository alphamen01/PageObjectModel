package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    private By email = By.xpath("//input[@formcontrolname='email']");

    private By password = By.xpath("//input[@formcontrolname='password']");

    private By buttonSignIn = By.xpath("//button[@type='submit']");

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
