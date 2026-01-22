package automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

    // Locators
    private By changePasswordButton = By.xpath("//button[text()='Change Password']");
    private By currentPasswordField = By.xpath("//label[text()='Current Password']/following::input[1]");
    private By newPasswordField = By.xpath("//label[text()='New Password']/following::input[1]");
    private By confirmPasswordField = By.xpath("//label[text()='Confirm Password']/following::input[1]");
    private By saveButton = By.xpath("//button[@type='submit']");

    // Helpers
    private void waitAndType(By locator, String value) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.clear();
        element.sendKeys(value);
    }

    // Actions
    public void openChangePasswordForm() {
        wait.until(ExpectedConditions.elementToBeClickable(changePasswordButton)).click();
    }

    public void fillChangePasswordForm(String current, String newPass, String confirm) {
        waitAndType(currentPasswordField, current);
        waitAndType(newPasswordField, newPass);
        waitAndType(confirmPasswordField, confirm);
    }

    public void clickSave() {
        wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
    }

    public void changePassword(String current, String newPass, String confirm) {
        openChangePasswordForm();
        fillChangePasswordForm(current, newPass, confirm);
        clickSave();
    }
}
