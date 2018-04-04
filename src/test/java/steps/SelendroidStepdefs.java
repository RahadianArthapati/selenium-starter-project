package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;

import static appium.BaseAppium.Capabilities;

/**
 * Created by home on 4/4/18.
 */
public class SelendroidStepdefs {
    private AndroidDriver driver;
    @When("^I launch selendroid app$")
    public void iLaunchSelendroidApp() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver = Capabilities();
        //throw new PendingException();
    }
    @When("^I set text into textbox$")
    public void i_set_text_into_textbox() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("my_text_field")).sendKeys("Hello Selendroid");
        //throw new PendingException();
    }

    @Then("^I see text box with \"(.*?)\"$")
    public void i_see_text_box_with(String expected) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals("Text Matches", expected, "Hello Selendroid" );
        File src = driver.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("/Users/home/Documents/Automation Testing/selenium-starter/screenshots/test2.png"));

        //throw new PendingException();
    }
}
