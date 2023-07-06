package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import support.DriverInit;

import java.net.MalformedURLException;

public class BaseTest {
    DriverInit driverInit = new DriverInit();

    @BeforeSuite(alwaysRun = true)
    public void setUp() throws MalformedURLException {
        driverInit.setUp();
    }

    @AfterTest
    public void tearDown(){
        driverInit.closeApplication();
    }
}
