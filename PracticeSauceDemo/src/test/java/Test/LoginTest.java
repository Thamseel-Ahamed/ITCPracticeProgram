package Test;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.Loginpage;
import page.InventoryPage;
import page.CartPage;
import page.CheckoutPage;
import page.CheckoutOverviewPage;
import page.CheckoutCompletePage;

public class LoginTest {

    WebDriver driver;

    @Test
    public void fullOrderFlowTest() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        
        
        //1. Login Page
        Loginpage loginPage = new Loginpage(driver);
        loginPage.login("standard_user", "secret_sauce");
        
        
        
        //2.Inventory page
        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.addTwoProductsToCart();
        

        inventoryPage.goToCart();
        Thread.sleep(2000);

        CartPage cartPage = new CartPage(driver);
        cartPage.clickCheckout();
        Thread.sleep(2000);

        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.enterCheckoutInformation("John", "Doe", "12345");
        

        CheckoutOverviewPage overviewPage = new CheckoutOverviewPage(driver);
        if (overviewPage.isPageDisplayed()) {
            System.out.println("Checkout Overview page loaded successfully.");
            overviewPage.clickFinish();
        } else {
            System.out.println("Checkout Overview page not loaded.");
        }
        Thread.sleep(2000);

        CheckoutCompletePage completePage = new CheckoutCompletePage(driver);
        completePage.clickBackHome();
        Thread.sleep(1000);
        completePage.openMenu();
        Thread.sleep(1000);
        completePage.clickLogout();
        System.out.println("Logged out successfully.");
        

        driver.quit();
    }
    @Test
    public void fullOrderFlowTestfalse() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        
        
        //1. Login Page
        Loginpage loginPage = new Loginpage(driver);
        loginPage.login("standard", "secret");
        
        
        
        //2.Inventory page
        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.addTwoProductsToCart();
        

        inventoryPage.goToCart();
        Thread.sleep(2000);

        CartPage cartPage = new CartPage(driver);
        cartPage.clickCheckout();
        Thread.sleep(2000);

        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.enterCheckoutInformation("John", "Doe", "12345");
        

        CheckoutOverviewPage overviewPage = new CheckoutOverviewPage(driver);
        if (overviewPage.isPageDisplayed()) {
            System.out.println("Checkout Overview page loaded successfully.");
            overviewPage.clickFinish();
        } else {
            System.out.println("Checkout Overview page not loaded.");
        }
        Thread.sleep(2000);

        CheckoutCompletePage completePage = new CheckoutCompletePage(driver);
        completePage.clickBackHome();
        Thread.sleep(1000);
        completePage.openMenu();
        Thread.sleep(1000);
        completePage.clickLogout();
        System.out.println("Logged out successfully.");
        

        driver.quit();
    }
}