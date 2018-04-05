package appium;

import com.paulhammant.ngwebdriver.NgWebDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by home on 4/4/18.
 */
public class BaseAppium {
    public static AndroidDriver Capabilities() throws MalformedURLException {
        File f = new File("src");
        File fs = new File(f, "selendroid-test-app.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"ASUS_X008DA");
        capabilities.setCapability(MobileCapabilityType.APP,fs.getAbsolutePath());
        capabilities.setCapability("appPackage","io.selendroid.testapp");
        capabilities.setCapability("appActivity","HomeScreenActivity");

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;
    }

    public static NgWebDriver NgCapabilities() throws MalformedURLException {
        ChromeDriver chromeDriver = new ChromeDriver();
        NgWebDriver driver = new NgWebDriver(chromeDriver);
        driver.waitForAngular2RequestsToFinish();
        return driver;
    }


}
