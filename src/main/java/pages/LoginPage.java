package pages;

import maps.LoginMap;
import support.BaseCommands;

import java.net.MalformedURLException;

public class LoginPage {
    LoginMap loginMap = new LoginMap();
    BaseCommands cmd = new BaseCommands();

    public void enterEmailAddress() throws MalformedURLException {
        cmd.isElementDisplayed(loginMap.EMAIL_TEXT_BOX);
        cmd.clickOnElement(loginMap.EMAIL_TEXT_BOX);
        cmd.typeOnElement(loginMap.EMAIL_TEXT_BOX, "hello@xyz.com");
    }
    public void enterPassword() throws MalformedURLException {
        cmd.clickOnElement(loginMap.PASSWORD_TEXT_BOX);
        cmd.typeOnElement(loginMap.PASSWORD_TEXT_BOX, "12345678");
    }
    public void clickLogin() throws MalformedURLException {
        cmd.clickOnElement(loginMap.LOG_IN_BUTTON);

    }
}
