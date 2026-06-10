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

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ConfigReader;

public class BaseTest {
	private static final Logger logger =
	        LogManager.getLogger(BaseTest.class);
	public static WebDriver driver;
	@BeforeMethod
	public void setup() {

	    String browser =
	            ConfigReader.getProperty("browser");

	    logger.info("Launching Browser : {}", browser);

	    switch(browser.toLowerCase()) {

	        case "chrome":

	            WebDriverManager.chromedriver().setup();
	            driver = new ChromeDriver();
	            break;

	        case "edge":

	            WebDriverManager.edgedriver().setup();
	            driver = new EdgeDriver();
	            break;

	        case "firefox":

	            WebDriverManager.firefoxdriver().setup();
	            driver = new FirefoxDriver();
	            break;

	        default:

	            logger.warn("Invalid browser. Launching Chrome");
	            WebDriverManager.chromedriver().setup();
	            driver = new ChromeDriver();
	    }

	    driver.manage().window().maximize();

	    driver.manage().timeouts().implicitlyWait(
	            Duration.ofSeconds(
	                    Integer.parseInt(
	                            ConfigReader.getProperty("implicitWait"))));

	    logger.info("Opening URL : {}",
	            ConfigReader.getProperty("url"));

	    driver.get(
	            ConfigReader.getProperty("url"));
	}
	@AfterMethod
	public void tearDown() {

	    try {

	        Thread.sleep(4000);

	    } catch (InterruptedException e) {

	        logger.error("Interrupted Exception", e);
	    }

	    if(driver != null) {

	        logger.info("Closing Browser");

	        driver.quit();
	    }
	}
	
}
