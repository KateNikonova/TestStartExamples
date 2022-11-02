package web.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import web.data.AbstractPageTest;

public class CakeAddPage extends AbstractPageTest {

    public CakeAddPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@type='text']")
    public WebElement title;

    @FindBy(xpath = "//input[@type='file']")
    public WebElement photoLoad;

    @FindBy(xpath = "//textarea[@name='description']")
    public WebElement description;

    @FindBy(xpath = "div.checkbox-row>label:nth-child(1)")
    public WebElement birthdayReason;

    @FindBy(css = "div.checkbox-row>label:nth-child(2)")
    public WebElement christeningReason;

    @FindBy(css = "div.checkbox-row>label:nth-child(3)")
    public WebElement otherReason;

    @FindBy(xpath = " //option[contains(text(), 'мальчик')]")
    public WebElement checkBoy;

    @FindBy(xpath = " //option[contains(text(), 'девочка')]")
    public WebElement checkGirl;

    @FindBy(xpath = " //option[contains(text(), 'женщина')]")
    public WebElement checkWoman;

    @FindBy(xpath = " //option[contains(text(), 'мужчина')]")
    public WebElement checkMan;

    @FindBy(xpath = " //option[contains(text(), 'другой повод')]")
    public WebElement checkOther;

    @FindBy(xpath = " //button[contains(text(), 'Добавить')]")
    public WebElement addButton;

    @FindBy(xpath = "//button[@class='class=jsx-102334425 jsx-3603300204 button is-primary']")
    public WebElement addCakeButton;

    //Open reasons list
    public void addCake(){
        addButton.click();
    }

    // enter title
    public void inputTitle(String name) {
        title.sendKeys(name);
    }

    // enter description
    public void inputDescription(String descr) {
        description.sendKeys(descr);
    }

    //Load photo
    public void addPhoto() {
       photoLoad.click();
      // String filepath = System.getProperty("user.dir")+"/src/test/resources/image/cake_001.jpg";
      // photoLoadPath.sendKeys(filepath);
    }
    // Select checkbox value
    public void selectCheckbox(WebElement element) {
        element.click();
    }

    //Open reasons list
    public void clickAddButton() {
        addButton.click();
    }

}
