package web.steps;

import io.cucumber.java.ru.Дано;
import allure.AllureForScreenshot;
import web.data.WebDriverSingleton;

import java.io.FileNotFoundException;

public class GivenStep extends AbstractScenarioStep {

    AllureForScreenshot allureForScreenshot = new AllureForScreenshot();
    @Дано("открыта главная страница")
    public void openMainPage() throws InterruptedException, FileNotFoundException {
        adminPage.open();
        Thread.sleep(1000);
        allureForScreenshot.takeScreenshot(WebDriverSingleton.getDriver());
        Thread.sleep(1000);
    }
}
