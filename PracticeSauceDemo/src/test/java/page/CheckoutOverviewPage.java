package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class CheckoutOverviewPage {
    WebDriver driver;
    WebDriverWait wait;

    // Locators
    private By finishButton = By.id("finish");
    private By pageTitle = By.className("title");

    public CheckoutOverviewPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Verify if overview page is displayed by checking title text
    public boolean isPageDisplayed() {
        return wait.until(ExpectedConditions.textToBePresentInElementLocated(pageTitle, "Checkout: Overview"));
    }

    // Click finish button to complete order
    public void clickFinish() {
        wait.until(ExpectedConditions.elementToBeClickable(finishButton)).click();
    }
}
