package definedsteps;

import browsermanager.DriverManager;
import browsermanager.DriverManagerFactory;
import browsermanager.DriverType;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;


public class Hooks {

    private static WebDriver driver;
    private static int numberOfCase = 0;

    private DriverManager driverManager;

    @Before
    public void SetUp(){
        numberOfCase ++;
        System.out.println("Se esta ejecutando el escenario nro: " + numberOfCase);
        driverManager = DriverManagerFactory.getManager(DriverType.FIREFOX);
        driver = driverManager.getDriver();
        driver.get("https://alphamen01.github.io/angular-realworld-example-app-testing-2023/");
        driver.manage().window().maximize();
    }

    @After
    public void TearDown(){
        System.out.println("El escenario nro: "+ numberOfCase + " se ejecuto correctamente.");
        driverManager.quitDriver();
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
