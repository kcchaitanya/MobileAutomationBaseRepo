package support;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverInit {

    public  static AndroidDriver driver;
    public DesiredCapabilities capabilities;
    public void setUp() throws MalformedURLException {
        capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
        capabilities.setCapability(MobileCapabilityType.APP, "/Users/userName/Downloads/application.apk");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
        capabilities.setCapability("appium:platformName", "Android");
        capabilities.setCapability("appium:noReset", "true");
        capabilities.setCapability("appium:fullReset", "false");
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");

        this.driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        this.driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);

        //return this.driver;
    }
    public AndroidDriver getDriver() {
        return this.driver;
    }
    public void closeApplication(){
        this.driver.close();
    }
}
