package automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    // 1️⃣ Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // 2️⃣ Locators
    private By usernameField = By.name("username");  // Username input field
    private By passwordField = By.name("password");  // Password input field
    private By loginButton = By.xpath("//button[@type='submit']"); // Login button

    // 3️⃣ Page Actions (Methods)
    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    // 4️⃣ Convenience method to login in one step
    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }
}
