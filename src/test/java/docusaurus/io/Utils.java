package docusaurus.io;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class Utils {
  private static final int DEFAULT_TIMEOUT = 15;

  public static String switchToNewWindow(WebDriver driver, String originalWindow, String expectedUrlPart) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIMEOUT));
    wait.until(ExpectedConditions.numberOfWindowsToBe(2));
    Set<String> allWindows = driver.getWindowHandles();
    for (String windowHandle : allWindows) {
      if (!windowHandle.equals(originalWindow)) {
        driver.switchTo().window(windowHandle);
        break;
      }
    }
    wait.until(ExpectedConditions.urlContains(expectedUrlPart));
    return driver.getCurrentUrl();
  }

  public static String switchToNewWindow(WebDriver driver, String originalWindow) {
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

  public static void closeCurrentWindowAndSwitchBack(WebDriver driver, String originalWindow) {
    driver.close();
    driver.switchTo().window(originalWindow);
  }

  public static String getCurrentWindowHandle(WebDriver driver) {
    return driver.getWindowHandle();
  }
}
