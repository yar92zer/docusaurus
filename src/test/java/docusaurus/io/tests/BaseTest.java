package docusaurus.io.tests;

import docusaurus.io.AllureLoggerCustom;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.Set;

public class BaseTest {
  private static WebDriver driver;
  protected final AllureLoggerCustom LOG;
  private static final int DEFAULT_TIMEOUT = 15;

  @BeforeEach
  public void setUp() {
    ChromeOptions chromeOptions = new ChromeOptions();
    chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
    driver = new ChromeDriver(chromeOptions);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  public static WebDriver getDriver() {
    return driver;
  }

  public BaseTest() {
    LOG = new AllureLoggerCustom(LoggerFactory.getLogger(this.getClass()));
  }

  @AfterEach
  public void tearDown() {
    if (driver != null) {
      driver.quit();
    }
  }

  protected String switchToNewWindow(String originalWindow) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIMEOUT));
    wait.until(ExpectedConditions.numberOfWindowsToBe(2));

    Set<String> allWindows = driver.getWindowHandles();
    for (String windowHandle : allWindows) {
      if (!windowHandle.equals(originalWindow)) {
        driver.switchTo().window(windowHandle);
        break;
      }
    }
    return driver.getCurrentUrl();
  }

  protected String getOriginalWindow() {
    return driver.getWindowHandle();
  }
}
