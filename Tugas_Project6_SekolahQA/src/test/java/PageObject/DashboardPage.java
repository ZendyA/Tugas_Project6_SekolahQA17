package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import zendy.base.BaseClass;

public class DashboardPage extends BaseClass {
    public DashboardPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[.='My Info']")
    private WebElement myInfoButton;

    public void clickMyInfoButton(){
        myInfoButton.click();
    }
    @FindBy(xpath = "//a[.='PIM']")
    private WebElement pimButton;

    public void clickPimButton(){

        pimButton.click();
    }
}
