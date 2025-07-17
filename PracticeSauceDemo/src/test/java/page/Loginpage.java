package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Loginpage {
    WebDriver driver;
    // Locators
    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    public Loginpage(WebDriver driver) {
        this.driver = driver;
    }
    // Action: Perform login
    public void login(String username, String password) throws InterruptedException {
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
        Thread.sleep(3000);
    }
    // Validation: Check if login was successful
    public boolean isLoginSuccessful() {
        return driver.getCurrentUrl().contains("inventory");
    }
}