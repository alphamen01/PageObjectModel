package pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    private WebDriver driver;
    private WebDriverWait wait;


    public BasePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void click(WebElement element) throws Exception {
        try {
            element.click();
        }catch (Exception ex){
            throw new Exception("No se pudo clickear sobre el elemento: " + element);
        }
    }

    public String getTitle() throws Exception {
        try {
            return driver.getTitle();
        }catch (Exception ex){
            throw new Exception("No se pudo obtener el titulo del driver");
        }
    }

    public void insertKeys(WebElement element, String inputtext) throws Exception {
        try {
            element.sendKeys(inputtext);
        }catch (Exception ex){
            throw new Exception("No se pudo insertar el texto en el elemento: " + element);
        }
    }

    public void findElement(WebElement element) throws Exception {
        try {
            wait.until(driver -> element);
        }catch (Exception ex){
            throw new Exception("No se pudo localizar el elemento: " + element);
        }
    }
}
