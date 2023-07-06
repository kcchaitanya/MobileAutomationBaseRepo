package support;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;

public class BaseCommands {

    DriverInit driverInit = new DriverInit();
    public AndroidDriver getDriver() {
        return driverInit.getDriver();
    }

    public WebElement element(String locator) throws MalformedURLException {
        return getDriver().findElement(By.xpath(locator));
    }
    public void clickOnElement(String locator) throws MalformedURLException {
        element(locator).click();
    }

    public void typeOnElement(String locator, String expectedValue) throws MalformedURLException {
        element(locator).sendKeys(expectedValue);
    }
    public Boolean isElementDisplayed(String locator) throws MalformedURLException {
        return element(locator).isDisplayed();
    }
}
