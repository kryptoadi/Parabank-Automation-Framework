package base;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import utilities.ConfigReader;

public class BaseTest {

    private static final Logger logger =
            LogManager.getLogger(BaseTest.class);

    private static ThreadLocal<WebDriver> driver =
            new ThreadLocal<>();

    public static WebDriver getDriver() {
        return driver.get();
    }

    @BeforeMethod
    @Parameters("browser")
    public void setup(@Optional("") String browser) {

        if (browser == null || browser.trim().isEmpty()) {
            browser = ConfigReader.getProperty("browser");
        }

        logger.info("Launching Browser: {}", browser);

        WebDriver localDriver = null;

        switch (browser.toLowerCase()) {

        case "chrome":
            localDriver = new ChromeDriver();
            break;

        case "edge":

            System.setProperty(
                "webdriver.edge.driver",
                ConfigReader.getProperty("edgeDriverPath"));

            localDriver = new EdgeDriver();
            break;

        case "firefox":
            localDriver = new FirefoxDriver();
            break;
        }

        driver.set(localDriver);

        getDriver().manage().window().maximize();

        getDriver().manage().timeouts().implicitlyWait(
                Duration.ofSeconds(
                        Integer.parseInt(
                                ConfigReader.getProperty("implicitWait"))));

        String url = ConfigReader.getProperty("url");

        logger.info("Opening URL: {}", url);

        getDriver().get(url);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {

        if (getDriver() != null) {

            logger.info("Closing Browser");

            getDriver().quit();

            driver.remove();
        }
    }
}