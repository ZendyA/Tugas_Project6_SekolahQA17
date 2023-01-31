package StepDefinitions;

import PageObject.LandingPage;
import Runner.Hooks;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Runner.Hooks.properties;

public class Login {
    private WebDriver driver;
    LandingPage landingPage;

    public Login() {
        super();
        this.driver = Hooks.driver;
    }
    @Given("I already at OrangeHRM Landing page")
    public void iAlreadyAtOrangeHRMLandingPage() {
        Assert.assertEquals(driver.getCurrentUrl(), "http://employee.sdcillsy.my.id/web/index.php/auth/login");
    }

    @When("I input valid Username And Password")
    public void iInputValidUsernameAndPassword() {
        landingPage = new LandingPage(driver);
        landingPage.InputUsername(properties.getProperty("username"));
        landingPage.InputPassword(properties.getProperty("password"));
    }

    @And("I click login button")
    public void iClickLoginButton() throws Throwable {
        landingPage = new LandingPage(driver);
        landingPage.LoginButonClick();
        Thread.sleep(3000);
    }

    @Then("I will directed to dashboard page")
    public void iWillDirectedToDashboardPage() {
        Assert.assertEquals(driver.getCurrentUrl(), "http://employee.sdcillsy.my.id/web/index.php/dashboard/index");
    }

    @When("I input valid new employee username and password")
    public void iInputValidNewEmployeeUsernameAndPassword() {
        landingPage = new LandingPage(driver);
        landingPage.InputUsername("OutAcil");
        landingPage.InputPassword("Partner_567");
    }

    @When("^I input ([^”]*) and ([^”]*)$")
    public void iInputUsernameAndPassword(String username, String password) throws Throwable {
        landingPage = new LandingPage(driver);
        landingPage.InputUsername(username);
        landingPage.InputPassword(password);
    }

    @Then("Error message will show up")
    public void errorMessageWillShowUp() {
        Assert.assertTrue(driver.getPageSource().contains("Invalid credentials"));
    }

    @Then("Show error required username")
    public void showErrorRequiredUsername() {
        Assert.assertTrue(driver.getPageSource().contains("Required"));
    }

    @Then("Show error message required password")
    public void showErrorMessageRequiredPassword() {
        Assert.assertTrue(driver.getPageSource().contains("Required"));
    }
}
