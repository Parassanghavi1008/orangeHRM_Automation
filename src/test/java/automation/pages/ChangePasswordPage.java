package automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ChangePasswordPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public ChangePasswordPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Locators (based on actual HTML)
    private By userDropdown = By.xpath("//span[@class='oxd-userdropdown-tab']");
    private By changePasswordLink = By.xpath("//a[text()='Change Password']");

    public void clickChangePassword() {

        // Open user dropdown
        wait.until(ExpectedConditions.elementToBeClickable(userDropdown)).click();

        // Click Change Password
        wait.until(ExpectedConditions.elementToBeClickable(changePasswordLink)).click();

        // Validate navigation using URL
        wait.until(ExpectedConditions.urlContains("updatePassword"));

        System.out.println("Navigated to Change Password page (URL validated)");
    }
}
