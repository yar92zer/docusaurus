package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class Utils {
  private static final int DEFAULT_TIMEOUT = 15;
  private final WebDriver driver;
  private WebDriverWait wait;

  public Utils(WebDriver driver) {
    this.driver = driver;
    wait = new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIMEOUT));
  }

  public void switchToNewWindow(String originalWindow) {
    wait = new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIMEOUT));
    wait.until(ExpectedConditions.numberOfWindowsToBe(2));
    Set<String> allWindows = driver.getWindowHandles();
    for (String windowHandle : allWindows) {
      if (!windowHandle.equals(originalWindow)) {
        driver.switchTo().window(windowHandle);
        break;
      }
    }
  }

  public String checkUrlOfNewWindowAndGetUrl(String originalWindow, String expectedUrlPart) {
    switchToNewWindow(originalWindow);
    wait.until(ExpectedConditions.urlContains(expectedUrlPart));
    return driver.getCurrentUrl();
  }
}
