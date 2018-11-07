package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page extends BasePage{

    @FindBy(xpath = ".//*[@id='email']")
    private WebElement emailInputField;

    @FindBy(xpath = ".//*[@id='password']")
    private WebElement passwordInputField;

    @FindBy(xpath = "//label[@class='modalRegistrationBtnWrap']/div[contains(@class,'submit submit element')]")
    private WebElement submitButton;

    public Login_Page(WebDriver driver) {
        super(driver);
    }

    public void login(String validEmail, String validPass) {
        waitVisibilityOfElement(emailInputField);
        emailInputField.sendKeys(validEmail);
        passwordInputField.sendKeys(validPass);
    }

    public void submitButtonClick(){
        waitVisibilityOfElement(submitButton);
        moveToElementAndClick(submitButton);
    }
}