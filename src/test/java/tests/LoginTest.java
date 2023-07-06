package tests;

import org.testng.annotations.Test;
import pages.LoginPage;

import java.net.MalformedURLException;

public class LoginTest extends BaseTest{

    LoginPage loginPage = new LoginPage();

    @Test()

    public void testLogin() throws MalformedURLException, InterruptedException {
        loginPage.enterEmailAddress();

        loginPage.enterPassword();

        loginPage.clickLogin();

    }
}
