package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import zendy.base.BaseClass;

public class PunchButton extends BaseClass {
    public PunchButton (WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
    private WebElement PunchinButton;
    public void PunchInButtonClick(){
        PunchinButton.click();
    }
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
    private WebElement PunchOutButton;
    public void PunchOutButtonClick(){
        PunchOutButton.click();
    }
}
