package docusaurus.io.pages;

import docusaurus.io.AllureLoggerCustom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.LoggerFactory;

import java.time.Duration;


//https://docusaurus.io/
public class DocusaurusPage {
  private final AllureLoggerCustom LOG = new AllureLoggerCustom(LoggerFactory.getLogger(DocusaurusPage.class));
  WebDriver driver;
  private final int WAIT_TIMEOUT = 10;

  @FindBy(xpath = "//a[contains(text(),'Docusaurus 3.8 is out!\uFE0F')]")
  public WebElement docusaurus3IsOutButton;

  @FindBy(xpath = "//b[@class='navbar__title text--truncate']")
  public WebElement docusaurusButton;

  @FindBy(xpath = "//a[normalize-space()='Docs']")
  public WebElement docsButton;

  @FindBy(xpath = "//a[normalize-space()='API']")
  public WebElement apiButton;

  @FindBy(xpath = "//a[@class='navbar__item navbar__link'][normalize-space()='Blog']")
  public WebElement blogUpButton;

  @FindBy(xpath = "//a[normalize-space()='Showcase']")
  public WebElement showcaseButton;

  @FindBy(xpath = "//a[normalize-space()='Community']")
  public WebElement communityButton;

  @FindBy(xpath = "//a[normalize-space()='Get Started']")
  public WebElement startedButton;

  @FindBy(xpath = "//a[normalize-space()='Try a Demo']")
  public WebElement tryDemoButton;

  @FindBy(xpath = "//*[@id=\"__docusaurus_skipToContent_fallback\"]/main/div[2]/div/div/a[1]")
  public WebElement startButton;

  @FindBy(xpath = "//a[normalize-space()='Introduction']")
  public WebElement introductionButton;

  @FindBy(xpath = "//a[normalize-space()='Installation']")
  public WebElement installationButton;

  @FindBy(xpath = "//a[normalize-space()='Migration from v1 to v2']")
  public WebElement migrationFromV1ToV2;

  @FindBy(xpath = "//a[normalize-space()='Stack Overflow']")
  public WebElement stackOverflowButton;

  @FindBy(xpath = "//a[normalize-space()='Feature Requests']")
  public WebElement featureRequestsButton;

  @FindBy(xpath = "//a[normalize-space()='Discord']")
  public WebElement discordButton;

  @FindBy(xpath = "//a[normalize-space()='Help']")
  public WebElement helpButton;

  @FindBy(xpath = "//a[@class='footer__link-item'][normalize-space()='Blog']")
  public WebElement blogButton;

  @FindBy(xpath = "//a[normalize-space()='Changelog']")
  public WebElement changelogButton;

  @FindBy(xpath = "//a[normalize-space()='GitHub']")
  public WebElement gitHubButton;

  @FindBy(xpath = "//a[normalize-space()='X']")
  public WebElement xButton;

  @FindBy(xpath = "//img[@alt='Deploys by Netlify']")
  public WebElement netlifyButton;

  @FindBy(xpath = "//img[@alt='Covered by Argos']")
  public WebElement coveredByArgosButton;

  @FindBy(xpath = "//a[normalize-space()='Privacy']")
  public WebElement privacyButton;

  @FindBy(xpath = "//a[normalize-space()='Terms']")
  public WebElement termsButton;

  @FindBy(xpath = "//a[normalize-space()='Cookie Policy']")
  public WebElement cookiePolicyButton;

  @FindBy(xpath = "//img[@class='footer__logo themedComponent_bJGS themedComponent--dark_jnGk']")
  public WebElement metaOpenSourceLogoButton;

  @FindBy(xpath = "//a[@role='button'][normalize-space()='3.8.1']")
  public WebElement threeEightOneButton;

  @FindBy(xpath = "//a[@role='button'][normalize-space()='English']")
  public WebElement englishButton;

  @FindBy(xpath = "//a[@aria-label='GitHub repository']")
  public WebElement gitHubRepository;

  @FindBy(xpath = "//button[@title='system mode']")
  public WebElement systemModeButton;

  @FindBy(xpath = "//button[@aria-label='Search (Ctrl+K)']")
  public WebElement searchButton;

  public boolean getDocusaurus3IsOut() {
    LOG.info("Проверка доступности кнопки 'Docusaurus 3.8 is out'");
    return docusaurus3IsOutButton.isEnabled();
  }

  public boolean getDocusaurus() {
    LOG.info("Проверка доступности кнопки 'Docusaurus'");
    return docusaurusButton.isEnabled();
  }

  public boolean getDocs() {
    LOG.info("Проверка доступности кнопки 'docs'");
    return docsButton.isEnabled();
  }

  public boolean getAPI() {
    LOG.info("Проверка доступности кнопки 'API'");
    return apiButton.isEnabled();
  }

  public boolean getBlogUp() {
    LOG.info("Проверка доступности кнопки 'blogUp'");
    return blogUpButton.isEnabled();
  }

  public boolean getShowcase() {
    LOG.info("Проверка доступности кнопки'Showcase'");
    return showcaseButton.isEnabled();
  }

  public boolean getCommunity() {
    LOG.info("Проверка доступности кнопки 'Community'");
    return communityButton.isEnabled();
  }

  public boolean getStart() {
    LOG.info("Проверка доступности кнопки 'start'");
    return startButton.isEnabled();
  }

  public boolean getTryDemo() {
    LOG.info("Проверка доступности кнопки'tryDemo'");
    return tryDemoButton.isEnabled();
  }

  public boolean getIntroduction() {
    LOG.info("Проверка доступности кнопки 'Introduction'");
    return introductionButton.isEnabled();
  }

  public boolean getStarted() {
    LOG.info("Проверка доступности кнопки 'started'");
    return startedButton.isEnabled();
  }

  public boolean getInstallation() {
    LOG.info("Проверка доступности кнопки 'installation'");
    return installationButton.isEnabled();
  }

  public boolean getMigrationFromV1ToV2() {
    LOG.info("Проверка доступности кнопки 'migrationFromV1ToV2'");
    return migrationFromV1ToV2.isEnabled();
  }

  public boolean getStackOverflow() {
    LOG.info("Проверка доступности кнопки 'stackOverflow'");
    return stackOverflowButton.isEnabled();
  }

  public boolean getFeatureRequests() {
    LOG.info("Проверка доступности кнопки 'featureRequests'");
    return featureRequestsButton.isEnabled();
  }

  public boolean getDiscord() {
    LOG.info("Проверка доступности кнопки 'discord'");
    return discordButton.isEnabled();
  }

  public boolean getHelp() {
    LOG.info("Проверка доступности кнопки  'help'");
    return helpButton.isEnabled();
  }

  public boolean getBlog() {
    LOG.info("Проверка доступности кнопки  'blog'");
    return blogButton.isEnabled();
  }

  public boolean getChangelog() {
    LOG.info("Проверка доступности кнопки 'changelog'");
    return changelogButton.isEnabled();
  }

  public boolean getGitHub() {
    LOG.info("Проверка доступности кнопки  'GitHub'");
    return gitHubButton.isEnabled();
  }

  public boolean getX() {
    LOG.info("Проверка доступности кнопки 'X'");
    return xButton.isEnabled();
  }

  public boolean getNetlify() {
    LOG.info("Проверка доступности кнопки 'Netlify'");
    return netlifyButton.isDisplayed() && netlifyButton.isEnabled();
  }

  public boolean getCoveredByArgos() {
    LOG.info("Проверка доступности кнопки 'coveredByArgos'");
    return coveredByArgosButton.isEnabled();
  }

  public boolean getPrivacy() {
    LOG.info("Проверка доступности кнопки 'privacy'");
    return privacyButton.isEnabled();
  }

  public boolean getTerms() {
    LOG.info("Проверка доступности кнопки 'Terms'");
    return termsButton.isEnabled();
  }

  public boolean getCookiePolicy() {
    LOG.info("Проверка доступности кнопки  'CookiePolicy'");
    return cookiePolicyButton.isEnabled();
  }

  public boolean getMetaOpenSource() {
    LOG.info("Проверка доступности кнопки  'MetaOpenSourceLogo'");
    return metaOpenSourceLogoButton.isEnabled();
  }

  public String metaOpenSourceTransition() {
    LOG.info("Переход на страницу 'MetaOpenSourceLogo'");
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    wait.until(ExpectedConditions.elementToBeClickable(metaOpenSourceLogoButton));
    metaOpenSourceLogoButton.click();
    wait.until(ExpectedConditions.urlContains("opensource.fb.com"));
    return driver.getCurrentUrl();
  }

  public String netlifyTransition() {
    LOG.info("Переход на страницу 'Netlify'");
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    wait.until(ExpectedConditions.elementToBeClickable(netlifyButton));
    String originalWindow = driver.getWindowHandle();
    netlifyButton.click();
    wait.until(ExpectedConditions.numberOfWindowsToBe(2));
    for (String windowHandle : driver.getWindowHandles()) {
      if (!windowHandle.equals(originalWindow)) {
        driver.switchTo().window(windowHandle);
        break;
      }
    }
    wait.until(ExpectedConditions.urlContains("netlify"));
    String currentUrl = driver.getCurrentUrl();
    return currentUrl;
  }

  public String argosTransition() {
    LOG.info("Переход на страницу 'coveredByArgos'");
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    wait.until(ExpectedConditions.elementToBeClickable(coveredByArgosButton));
    String originalWindow = driver.getWindowHandle();
    coveredByArgosButton.click();
    wait.until(ExpectedConditions.numberOfWindowsToBe(2));
    for (String windowHandle : driver.getWindowHandles()) {
      if (!windowHandle.equals(originalWindow)) {
        driver.switchTo().window(windowHandle);
        break;
      }
    }
    wait.until(ExpectedConditions.urlContains("argos"));
    return driver.getCurrentUrl();
  }

  public boolean getThreeEightOne() {
    LOG.info("Проверка доступности кнопки 'threeEightOne'");
    return threeEightOneButton.isEnabled();
  }

  public boolean getEnglish() {
    LOG.info("Проверка доступности кнопки 'English'");
    return englishButton.isEnabled();
  }

  public boolean getGitHubRepository() {
    LOG.info("Проверка доступности кнопки 'hubRepository'");
    return gitHubRepository.isEnabled();
  }

  public boolean getSystemMode() {
    LOG.info("Проверка доступности кнопки 'SystemModeMode'");
    return systemModeButton.isEnabled();
  }

  public boolean getSearch() {
    LOG.info("Проверка доступности кнопки 'search'");
    return searchButton.isEnabled();
  }

  public DocusaurusPage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIMEOUT));
    wait.until(webDriver -> ((org.openqa.selenium.JavascriptExecutor) webDriver)
      .executeScript("return document.readyState").equals("complete"));
  }
}
