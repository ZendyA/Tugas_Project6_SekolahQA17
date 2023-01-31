package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import zendy.base.BaseClass;

public class AddEmployeePIMPage extends BaseClass {
    public AddEmployeePIMPage (WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input[1]")
    private WebElement firstNameField;

    public void inputFirstNameField(String keyword){

        firstNameField.sendKeys(keyword);
    }

    @FindBy(xpath = "//div[2]/div[2]/div[2]/input[1]")
    private WebElement middleNameField;

    public void inputMiddleNameField(String keyword){

        middleNameField.sendKeys(keyword);
    }

    @FindBy(xpath = "//div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/input[1]")
    private WebElement lastNameField;

    public void inputLastNameField(String keyword){

        lastNameField.sendKeys(keyword);
    }

    @FindBy(xpath = "//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")
    private WebElement switchButton;

    public void clickSwitchButton(){

        switchButton.click();
    }

    @FindBy(xpath = "//div[@class='orangehrm-employee-form']/div[@class='oxd-form-row']/div[1]//input[@class='oxd-input oxd-input--active']")
    private WebElement usernameField;

    public void inputUsernameField(String keyword){
        usernameField.sendKeys(keyword);
    }

    @FindBy(xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']//input[@class='oxd-input oxd-input--active']")
    private WebElement passwordField;

    public void inputPasswordField(String keyword){
        passwordField.sendKeys(keyword);
    }

    @FindBy(xpath = "//div[@class='oxd-form-row user-password-row']//div[@class='oxd-grid-item oxd-grid-item--gutters']//input[@class='oxd-input oxd-input--active']")
    private WebElement confirmPasswordField;

    public void inputConfirmPasswordField(String keyword){
        confirmPasswordField.sendKeys(keyword);
    }

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
    private WebElement saveButton;

    public void clickSaveButton(){
        saveButton.click();
    }
}
