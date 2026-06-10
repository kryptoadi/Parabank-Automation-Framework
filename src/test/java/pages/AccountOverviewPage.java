package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountOverviewPage {

    WebDriver driver;

    public AccountOverviewPage(WebDriver driver) {
        this.driver = driver;
    }

    By accountsOverviewHeading =
            By.xpath("//h1[contains(text(),'Accounts Overview')]");

    public boolean isAccountsOverviewDisplayed() {

        return driver.findElement(accountsOverviewHeading)
                .isDisplayed();
    }
}