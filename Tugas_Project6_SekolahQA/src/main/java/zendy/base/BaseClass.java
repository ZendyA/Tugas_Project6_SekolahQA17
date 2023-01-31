package zendy.base;

import io.opentelemetry.api.baggage.propagation.W3CBaggagePropagator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseClass {
    public static WebDriver driver;

    public BaseClass (WebDriver driver) {

        BaseClass.driver = driver;
    }

    public void click(WebElement webElement) {

        webElement.click();
    }

    public void input(WebElement webElement, String text) {
        webElement.clear();
        webElement.sendKeys(text);
    }
}
