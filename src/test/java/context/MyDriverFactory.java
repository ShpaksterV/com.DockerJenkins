package context;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testcontainers.containers.BrowserWebDriverContainer;

import java.util.concurrent.TimeUnit;

public class MyDriverFactory {
    private WebDriver driver;

    public WebDriver getDriver(String browserType) {

         driver = (WebDriver) new BrowserWebDriverContainer().
                withDesiredCapabilities(DesiredCapabilities.chrome());


        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }
}