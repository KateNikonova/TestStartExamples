package web.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import web.data.AbstractPageTest;
import web.data.GetProperties;
public class StartAdminPage extends AbstractPageTest {

    private static final String StartAdminPage = GetProperties.getProperty("domainAdmin");

    public StartAdminPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(StartAdminPage);
    }

    @FindBy(xpath = "//button[@class='jsx-2239707107 button is-link']")
    public WebElement addButton;

    //Open reasons list
    public void openAddCakePage() {
        addButton.click();
    }

}