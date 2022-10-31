package allure;

import io.qameta.allure.Allure;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class AllureForScreenshot {
    public void takeScreenshot(WebDriver webDriver) throws FileNotFoundException {
        File screenshotAs = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
        Allure.addAttachment("Screenshot", new FileInputStream(screenshotAs));

    }
}
