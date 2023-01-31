package PageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import zendy.base.BaseClass;

public class MyInfoPage extends BaseClass {
    public MyInfoPage (WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[.='Indonesian']")
    private WebElement nationalityIndo;

    public void clickNationalityIndo() {

        nationalityIndo.click();
    }

    @FindBy(xpath = "//div[.='Single']")
    private WebElement maritalStatusSingle;

    public void clickMaritalStatusSingle() {
        maritalStatusSingle.click();
    }
    @FindBy(xpath = "//div[.='-- Select --']")
    private WebElement selectIndo;
    public void clickSelectIndo(){
        selectIndo.click();
    }
    @FindBy(xpath = "//div[.='-- Select --']")
    private WebElement selectSingle;
    public void clickSelectSingle() {
        selectSingle.click();
    }

    @FindBy(xpath = "//div[@class='--gender-grouped-field']/div[1]//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input']")
    private WebElement GenderMale;

    public void ClickGendermale(){
        GenderMale.click();
    }

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
    private WebElement saveButton;

    public void clickSaveButton() {
        saveButton.click();
    }

}
