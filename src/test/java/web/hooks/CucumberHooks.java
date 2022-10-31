package web.hooks;

import web.data.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHooks {

    @Before
    public void startUp(){
        WebDriverSingleton.getDriver();
    }


    @After
    public void tearDown(){
        WebDriverSingleton.closeDriver();
    }
}
