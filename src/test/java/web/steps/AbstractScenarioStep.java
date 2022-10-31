package web.steps;

import web.data.*;
import web.page.*;
import org.openqa.selenium.WebDriver;

public class AbstractScenarioStep {

    public StartAdminPage adminPage;
    public CakeAddPage cakeAddPage;

    protected AbstractScenarioStep(){

        WebDriver driver = WebDriverSingleton.getDriver();
        adminPage = new StartAdminPage(driver);
        cakeAddPage = new CakeAddPage(driver);
    }
}
