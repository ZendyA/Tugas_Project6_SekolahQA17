package StepDefinitions;

import PageObject.AddEmployeePIMPage;
import PageObject.DashboardPage;
import PageObject.LandingPage;
import PageObject.PIMPage;
import Runner.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static Runner.Hooks.properties;

public class AddNewEmployee {
    public AddNewEmployee(){
        super();
        this.driver= Hooks.driver;
    }
    private WebDriver driver;
    DashboardPage dashboardPage;
    LandingPage landingPage;
    PIMPage pimPage;
    AddEmployeePIMPage addEmployeePIMPage;

    @Given("I already logged in OrangeHRM website")
    public void iAlreadyLoggedInOrangeHRMWebsite() {
        landingPage = new LandingPage(driver);

        landingPage.InputUsername(properties.getProperty("username"));
        landingPage.InputPassword(properties.getProperty("password"));
        landingPage.LoginButonClick();
    }

    @When("I click PIM button")
    public void iClickPIMButton() {
        dashboardPage = new DashboardPage(driver);
        dashboardPage.clickPimButton();
    }

    @And("I clicked add button")
    public void iClickedAddButton() {
        pimPage = new PIMPage(driver);
        pimPage.clickAddButton();
    }

    @And("I fill firstname, middlename, and lastname")
    public void iInputFirstnameAndLastname() {
        addEmployeePIMPage = new AddEmployeePIMPage(driver);
        addEmployeePIMPage.inputFirstNameField("Evos");
        addEmployeePIMPage.inputMiddleNameField("Bejon");
        addEmployeePIMPage.inputLastNameField("Zeys");
    }

    @And("I click switch button")
    public void iClickSwitchButton() {
        addEmployeePIMPage = new AddEmployeePIMPage(driver);
        addEmployeePIMPage.clickSwitchButton();
    }

    @And("I fill new account")
    public void iInputUsernamePasswordAndConfirmPasswordField() {
        addEmployeePIMPage = new AddEmployeePIMPage(driver);
        addEmployeePIMPage.inputUsernameField("EvosZeys");
        addEmployeePIMPage.inputPasswordField("Partner_567");
        addEmployeePIMPage.inputConfirmPasswordField("Partner_567");
    }

    @Then("I click save button on Page")
    public void iClickSaveButtonOnPage() {
        addEmployeePIMPage = new AddEmployeePIMPage(driver);
        addEmployeePIMPage.clickSaveButton();
    }
}
