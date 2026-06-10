package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utilities.DataProviders;

public class LoginTest extends BaseTest {

    @Test(priority=2,
        dataProvider = "loginData",
        dataProviderClass = DataProviders.class
    )
    public void verifyLogin(String username,
                            String password) {

        LoginPage login =
                new LoginPage(BaseTest.getDriver());

        login.enterUsername(username);

        login.enterPassword(password);

        login.clickLogin();

        Assert.assertTrue(
                login.isLoginSuccessful(),
                "Login failed");
    }
}