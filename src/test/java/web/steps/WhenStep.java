package web.steps;

import io.cucumber.java.ru.Когда;
import allure.AllureForScreenshot;
import org.openqa.selenium.WebElement;
import web.data.WebDriverSingleton;

import java.io.FileNotFoundException;


public class WhenStep extends AbstractScenarioStep{

    AllureForScreenshot allureForScreenshot = new AllureForScreenshot();

    @Когда("пользователь нажимает {string}")
    public void clickAddButton(String button) throws InterruptedException, FileNotFoundException {
        adminPage.openAddCakePage();
        Thread.sleep(1000);
        allureForScreenshot.takeScreenshot(WebDriverSingleton.getDriver());
    }

    @Когда("прописывает {string} в \"Названии\"")
    public void fillCakeName(String element) throws InterruptedException, FileNotFoundException {
        cakeAddPage.inputTitle(element);
        Thread.sleep(1000);
        allureForScreenshot.takeScreenshot(WebDriverSingleton.getDriver());
    }

    @Когда("добавляет фото")
    public void addPhotoFile()throws InterruptedException, FileNotFoundException {
        cakeAddPage.addPhoto();
        Thread.sleep(1000);
        allureForScreenshot.takeScreenshot(WebDriverSingleton.getDriver());
    }

    @Когда("прописывает {string} в \"Описании\"")
    public void fillCakeDescr(String element) throws InterruptedException, FileNotFoundException {
        cakeAddPage.inputDescription(element);
        Thread.sleep(1000);
        allureForScreenshot.takeScreenshot(WebDriverSingleton.getDriver());
    }

    @Когда("выбирает повод: {string}")
    public void chooseReason(String condition){
        switch (condition) {
            case "birthdayReason":
                cakeAddPage.selectCheckbox(cakeAddPage.birthdayReason);
                break;
            case "christeningReason":
                cakeAddPage.selectCheckbox(cakeAddPage.christeningReason);
                break;
            case "otherReason":
                cakeAddPage.selectCheckbox(cakeAddPage.otherReason);
                break;
            default:
                break;
        }
    }
    @Когда("выбирает для кого: {string}")
    public void chooseForWho(String condition) {
        switch (condition) {
            case "checkBoy":
                cakeAddPage.selectCheckbox(cakeAddPage.checkBoy);
                break;
            case "checkGirl":
                cakeAddPage.selectCheckbox(cakeAddPage.checkGirl);
                break;
            case "checkWoman":
                cakeAddPage.selectCheckbox(cakeAddPage.checkWoman);
                break;
            case "checkMan":
                cakeAddPage.selectCheckbox(cakeAddPage.checkMan);
                break;
            case "checkOther":
                cakeAddPage.selectCheckbox(cakeAddPage.checkOther);
                break;
            default:
                break;
        }
    }
}
