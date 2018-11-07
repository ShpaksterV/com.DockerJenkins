package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyProfile_Page extends BasePage {

    @FindBy(xpath = "//a[@id='headerProfile']")
    private WebElement headerMenu;

    public MyProfile_Page(WebDriver driver) {
        super(driver);
    }

    public String checkRegisteredName(){
        waitOfElement(headerMenu);
        return headerMenu.getText();
    }
}
