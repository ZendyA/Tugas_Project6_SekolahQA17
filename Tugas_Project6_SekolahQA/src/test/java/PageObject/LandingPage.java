package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import zendy.base.BaseClass;

public class LandingPage extends BaseClass {
    public LandingPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@name='username']")
    private WebElement UsernameField;
    public void InputUsername(String keyword){
        UsernameField.sendKeys(keyword);
    }
    @FindBy(xpath = "//input[@name='password']")
    private WebElement PasswordField;
    public void InputPassword(String keyword){
        PasswordField.sendKeys(keyword);
    }
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
    private WebElement ButtonLogin;
    public void LoginButonClick(){
        ButtonLogin.click();
    }
}
