package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.OpenNewAccountPage;
import utilities.DataProviders;

public class OpenNewAccountTest extends BaseTest {

    @Test(priority=4,
            retryAnalyzer = utilities.RetryAnalyzer.class,
            dataProvider = "loginData",
            dataProviderClass = DataProviders.class)

    public void createAccount(String username,
                              String password) throws InterruptedException {

        LoginPage login =
                new LoginPage(driver);

        login.enterUsername(username);
        login.enterPassword(password);
        login.clickLogin();

        OpenNewAccountPage account =
                new OpenNewAccountPage(driver);

        account.openNewAccountPage();

        account.createNewAccount();

        Thread.sleep(3000);

        String pageText =
                account.getPageText();

        System.out.println(pageText);

        Assert.assertTrue(
                pageText.contains("Congratulations")
                || pageText.contains("Account Opened")
                || pageText.contains("Your new account number"),
                "Account was not created successfully");
    }
}