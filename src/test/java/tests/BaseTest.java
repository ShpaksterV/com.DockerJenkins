package tests;

import context.MyDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    public WebDriver driver;

    @BeforeMethod
    protected void beforeMethod() {
        driver = new MyDriverFactory().getDriver("chrome");
    }

    @AfterMethod
        public void tearDown() {
            driver.quit();
        }
    }