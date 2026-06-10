package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class OpenNewAccountPage {

    WebDriver driver;

    public OpenNewAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    By openNewAccountLink =
            By.xpath("//a[contains(text(),'Open New Account')]");

    By accountType = By.id("type");

    By fromAccount = By.id("fromAccountId");

    By openAccountButton =
            By.xpath("//input[@value='Open New Account']");

    public void openNewAccountPage() {

        utilities.WaitUtils.waitForElement(
                driver,
                By.linkText("Open New Account"));

        driver.findElement(
                By.linkText("Open New Account"))
                .click();
    }

    public void createNewAccount() {

        Select typeDropdown =
                new Select(driver.findElement(accountType));

        typeDropdown.selectByVisibleText("SAVINGS");

        Select accountDropdown =
                new Select(driver.findElement(fromAccount));

        accountDropdown.selectByIndex(0);

        WebElement button =
                driver.findElement(openAccountButton);

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", button);
    }

    public String getPageText() {

        return driver.findElement(By.tagName("body"))
                .getText();
    }

    public String getCurrentUrl() {

        return driver.getCurrentUrl();
    }
}