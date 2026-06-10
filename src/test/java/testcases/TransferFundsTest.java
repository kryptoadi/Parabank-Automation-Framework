package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.TransferFundsPage;
import utilities.DataProviders;

public class TransferFundsTest extends BaseTest {

    @Test(
            priority = 5,
            retryAnalyzer = utilities.RetryAnalyzer.class,
            dataProvider = "transferData",
            dataProviderClass = DataProviders.class
    )
    public void verifyTransferFunds(
            String username,
            String password,
            String amount) throws InterruptedException {

        LoginPage login =
                new LoginPage(driver);

        login.enterUsername(username);

        login.enterPassword(password);

        login.clickLogin();

        TransferFundsPage transfer =
                new TransferFundsPage(driver);

        System.out.println("Step 1");
        transfer.openTransferFunds();

        System.out.println("Step 2");
        transfer.enterAmount(amount);

        System.out.println("Step 3");
        transfer.selectFromAccount();

        System.out.println("Step 4");
        transfer.selectToAccount();

        System.out.println("Step 5");
        transfer.clickTransfer();

        System.out.println("Step 6");

        System.out.println("Transfer button clicked");

        Thread.sleep(5000);

        System.out.println("Current URL = " + driver.getCurrentUrl());

        System.out.println(transfer.getPageText());
    }
}