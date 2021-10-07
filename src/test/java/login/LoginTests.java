package login;

import base.BaseTests;
import org.junit.Assert;
import org.junit.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.junit.Assert.*;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfullLogin(){
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsernameField("tomsmith");
        loginPage.setPasswordField("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"));

    }
}
