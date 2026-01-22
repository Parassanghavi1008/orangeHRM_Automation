package automation.tests;

import automation.base.BaseTest;
import automation.pages.ChangePasswordPage;
import automation.pages.LoginPage;
import automation.pages.LogoutPage;
import automation.pages.MyInfoPage;
import org.testng.annotations.Test;

public class FullFlowTest extends BaseTest {
    @Test
    public void completeFlowTest() {
        // Step 1: Login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123");

        // Step 2: Update Contact Details
        MyInfoPage myInfoPage = new MyInfoPage(driver);
        myInfoPage.updateContactDetails(
                "Aayodhya", "Aayodhya", "Aayodhya", "UP", "100008", "IND", "9999999999"
        );

        // Step 3: Change Password
        ChangePasswordPage changePasswordPage = new ChangePasswordPage(driver);
        changePasswordPage.clickChangePassword();


        // Step 4: Logout
        LogoutPage logoutPage = new LogoutPage(driver);
        logoutPage.logout();
    }
}
