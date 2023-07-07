package definedsteps;


import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class StepDefinitions {

    private ChromeDriver driver;

    @Given("El usuario se encuentra en la pagina Home de Conduit")
    public void el_usuario_se_encuentra_en_la_pagina_home_de_conduit() {
        System.setProperty("web-driver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://alphamen01.github.io/angular-realworld-example-app-testing-2023/");
        driver.manage().window().maximize();

    }
    @When("Hace click sobre Sign In")
    public void hace_click_sobre_sign_in() {
        WebElement titleSignIn = driver.findElement(By.xpath("//a[@routerlink='/login']"));
        titleSignIn.click();
    }
    @Then("Debe de ingresar sus credenciales")
    public void debe_de_ingresar_sus_credenciales() {
        WebElement email = driver.findElement(By.xpath("//input[@formcontrolname='email']"));
        email.sendKeys("lesg.2233@gmail.com");

        WebElement password = driver.findElement(By.xpath("//input[@formcontrolname='password']"));
        password.sendKeys("LuisEnrique");

    }
    @And("Hace click en el boton Sign In")
    public void hace_click_en_el_boton_sign_in() {
        WebElement buttonSignIn = driver.findElement(By.xpath("//button[@type='submit']"));
        buttonSignIn.click();

    }
    @And("nos redireccionara al Global Feed")
    public void nos_redireccionara_al_global_feed() {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(driver -> driver.findElement(By.xpath("//a[text()=' Global Feed ']")));
    }
}
