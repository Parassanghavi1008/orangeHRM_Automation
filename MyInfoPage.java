package automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class MyInfoPage {
    private WebDriver driver;
    private WebDriverWait wait;

    // Constructor
    public MyInfoPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // wait for 10 seconds
    }

    // Locators
    private By myInfoMenu = By.xpath("//a[@href='/web/index.php/pim/viewMyDetails']");
    private By contactDetailsTab = By.xpath("//a[text()='Contact Details']");

    // Using XPath relative to labels for reliability
    private By street1Field = By.xpath("//label[text()='Street 1']/following::input[1]");
    private By street2Field = By.xpath("//label[text()='Street 2']/following::input[1]");
    private By cityField = By.xpath("//label[text()='City']/following::input[1]");
    private By stateField = By.xpath("//label[text()='State/Province']/following::input[1]");
    private By zipField = By.xpath("//label[text()='Zip/Postal Code']/following::input[1]");
    private By countryField = By.xpath("//label[text()='Country']/following::input[1]");
    private By phoneField = By.xpath("//label[text()='Home']/following::input[1]"); // adjust if different
    private By saveButton = By.xpath("//button[@type='submit']");

    // Page Actions
    public void goToMyInfo() {
        wait.until(ExpectedConditions.elementToBeClickable(myInfoMenu)).click();
    }

    public void goToContactDetails() {
        wait.until(ExpectedConditions.elementToBeClickable(contactDetailsTab)).click();
    }

    private void waitAndType(By locator, String value) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.clear();
        element.sendKeys(value);
    }

    public void fillContactDetails(String street1, String street2, String city,
                                   String state, String zip, String country, String phone) {
        waitAndType(street1Field, street1);
        waitAndType(street2Field, street2);
        waitAndType(cityField, city);
        waitAndType(stateField, state);
        waitAndType(zipField, zip);
        waitAndType(countryField, country);
        waitAndType(phoneField, phone);
    }

    public void clickSave() {
        wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
    }

    // Convenience method
    public void updateContactDetails(String street1, String street2, String city,
                                     String state, String zip, String country, String phone) {
        goToMyInfo();
        goToContactDetails();
        fillContactDetails(street1, street2, city, state, zip, country, phone);
        clickSave();
    }
}
