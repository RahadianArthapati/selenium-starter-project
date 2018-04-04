package appium;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by home on 4/4/18.
 */
public class LaunchApp {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setJavascriptEnabled(true);
        capabilities.setCapability("automationName","Appium");
        capabilities.setCapability("platform","Android");
        capabilities.setCapability("deviceName","ASUS_X008DA");
        capabilities.setCapability("app","/Users/home/Downloads/selendroid-test-app-0.17.0.apk");
        capabilities.setCapability("appPackage","io.selendroid.testapp");
        capabilities.setCapability("appActivity","HomeScreenActivity");

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }
}
