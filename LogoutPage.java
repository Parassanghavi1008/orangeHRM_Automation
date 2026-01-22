package automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {
    private WebDriver driver;

    // Constructor
    public LogoutPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private By profileMenu = By.xpath("//span[@class='oxd-userdropdown-tab']");
    private By logoutOption = By.xpath("//a[text()='Logout']");

    // Page Actions
    public void logout() {
        driver.findElement(profileMenu).click();
        driver.findElement(logoutOption).click();
    }
}
