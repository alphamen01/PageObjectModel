package definedsteps;


import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;


public class StepDefinitions extends StepDefinitionsBase{



    @Given("El usuario se encuentra en la pagina Home de Conduit")
    public void el_usuario_se_encuentra_en_la_pagina_home_de_conduit() throws Throwable {

        Assertions.assertTrue(homePage.homePageIsDisplayed());
    }
    @When("Hace click sobre Sign In")
    public void hace_click_sobre_sign_in() throws Throwable{
        homePage.clickOnSignIn();
    }
    @Then("Debe de ingresar sus credenciales")
    public void debe_de_ingresar_sus_credenciales() throws Exception {
        loginPage.insertEmail();

        loginPage.insertPassword();
    }
    @And("Hace click en el boton Sign In")
    public void hace_click_en_el_boton_sign_in() throws Throwable{
        loginPage.clickButtonSignIn();

    }
    @And("nos redireccionara al Global Feed")
    public void nos_redireccionara_al_global_feed() throws Throwable{
        globalFeedPage.findGlobalFeed();
    }

    @Given("El usuario se encuentra en la pagina")
    public void el_usuario_se_encuentra_en_la_pagina() {

    }
}
