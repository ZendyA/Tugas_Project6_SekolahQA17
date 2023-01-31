package StepDefinitions;

import PageObject.DashboardPage;
import PageObject.LandingPage;
import PageObject.MyInfoPage;
import Runner.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditProfile {
    private WebDriver driver;

    public EditProfile() {
        super();
        this.driver = Hooks.driver;
    }
    LandingPage landingPage;
    DashboardPage dashboardPage;
    MyInfoPage myInfoPage;

    @Given("I am already login with valid account")
    public void iAmAlreadyLoginWithValidAccount() throws Throwable {
        landingPage = new LandingPage(driver);
        landingPage.InputUsername("OutAcil");
        landingPage.InputPassword("Partner_567");
        landingPage.LoginButonClick();
        Thread.sleep(3000);
    }

    @When("I click my info menu")
    public void iClickMyInfoMenu() {
        dashboardPage = new DashboardPage(driver);
        dashboardPage.clickMyInfoButton();
    }

    @And("I select Nationality, marital status and gender option")
    public void iSelectNationalityMaritalStatusAndGenderOption() throws Throwable {
        myInfoPage = new MyInfoPage(driver);
        myInfoPage.clickSelectIndo();
        myInfoPage.clickNationalityIndo();
        myInfoPage.clickSelectSingle();
        myInfoPage.clickMaritalStatusSingle();
        myInfoPage.ClickGendermale();
        Thread.sleep(3000);
    }

    @And("I click save button on my info page")
    public void iClickSaveButton() {
        myInfoPage = new MyInfoPage(driver);
        myInfoPage.clickSaveButton();
    }

    @Then("profile is successfully updated and show pop up messsages")
    public void profileIsSuccessfullyUpdatedAndShowPopUpMesssages() throws Throwable {
        WebElement popUp = driver.findElement(By.xpath("//div[@id='oxd-toaster_1']/div"));
        Assert.assertTrue(popUp.isDisplayed());
        Thread.sleep(3000);
    }
}
