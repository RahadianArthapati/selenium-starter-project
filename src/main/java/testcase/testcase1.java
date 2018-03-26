package testcase;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

/**
 * Created by home on 3/25/18.
 */
public class testcase1 {

    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver","/Users/home/Documents/Automation Testing/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://sanet.cd");

        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("/Users/home/Documents/Automation Testing/selenium-starter/screenshots/test1.png"));
        driver.quit();
    }
}
