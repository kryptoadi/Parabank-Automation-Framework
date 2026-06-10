package testcases;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.RegistrationPage;
import utilities.DataProviders;

public class RegistrationTest extends BaseTest {

    @Test(priority=1,dataProvider = "registrationData",
          dataProviderClass = DataProviders.class)

    public void verifyRegistration(
            String firstName,
            String lastName,
            String address,
            String city,
            String state,
            String zip,
            String phone,
            String ssn,
            String username,
            String password) {

        RegistrationPage register =
                new RegistrationPage(BaseTest.getDriver());

        register.clickRegisterLink();

        register.registerUser(
                firstName,
                lastName,
                address,
                city,
                state,
                zip,
                phone,
                ssn,
                username,
                password);
    }
}