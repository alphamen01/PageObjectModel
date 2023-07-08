package definedsteps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    private static ChromeDriver driver;
    private static int numberOfCase = 0;

    @Before
    public void SetUp(){
        numberOfCase ++;
        System.out.println("Se esta ejecutando el escenario nro: " + numberOfCase);
        System.setProperty("web-driver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://alphamen01.github.io/angular-realworld-example-app-testing-2023/");
        driver.manage().window().maximize();
    }

    @After
    public void TearDown(){
        System.out.println("El escenario nro: "+ numberOfCase + " se ejecuto correctamente.");
        driver.quit();
    }

    public static ChromeDriver getDriver(){
        return driver;
    }
}
