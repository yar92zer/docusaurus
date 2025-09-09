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

import static docusaurus.io.Utils.switchToNewWindow;

//https://docusaurus.io/
public class DocusaurusPage {
  private final AllureLoggerCustom LOG = new AllureLoggerCustom(LoggerFactory.getLogger(DocusaurusPage.class));
  private final WebDriver driver;
  private final int WAIT_TIMEOUT = 10;

  @FindBy(xpath = "//a[contains(@href,'/blog/releases/3.8')]")
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

  @FindBy(xpath = "//a[text()[normalize-space()='Get Started']]")
  public WebElement startButton;
  ;

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
    LOG.info("Checking availability of 'Docusaurus 3.8 is out' button");
    return docusaurus3IsOutButton.isEnabled();
  }

  public boolean getDocusaurus() {
    LOG.info("Checking availability of 'Docusaurus' button");
    return docusaurusButton.isEnabled();
  }

  public boolean getDocs() {
    LOG.info("Checking availability of 'docs' button");
    return docsButton.isEnabled();
  }

  public boolean getAPI() {
    LOG.info("Checking availability of 'API' button");
    return apiButton.isEnabled();
  }

  public boolean getBlogUp() {
    LOG.info("Checking availability of 'blogUp' button");
    return blogUpButton.isEnabled();
  }

  public boolean getShowcase() {
    LOG.info("Checking availability of 'Showcase' button");
    return showcaseButton.isEnabled();
  }

  public boolean getCommunity() {
    LOG.info("Checking availability of 'Community' button");
    return communityButton.isEnabled();
  }

  public boolean getStart() {
    LOG.info("Checking availability of 'start' button");
    return startButton.isEnabled();
  }

  public boolean getTryDemo() {
    LOG.info("Checking availability of 'tryDemo' button");
    return tryDemoButton.isEnabled();
  }

  public boolean getIntroduction() {
    LOG.info("Checking availability of 'Introduction' button");
    return introductionButton.isEnabled();
  }

  public boolean getStarted() {
    LOG.info("Checking availability of 'started' button");
    return startedButton.isEnabled();
  }

  public boolean getInstallation() {
    LOG.info("Checking availability of 'installation' button");
    return installationButton.isEnabled();
  }

  public boolean getMigrationFromV1ToV2() {
    LOG.info("Checking availability of 'migrationFromV1ToV2' button");
    return migrationFromV1ToV2.isEnabled();
  }

  public boolean getStackOverflow() {
    LOG.info("Checking availability of 'stackOverflow' button");
    return stackOverflowButton.isEnabled();
  }

  public boolean getFeatureRequests() {
    LOG.info("Checking availability of 'featureRequests' button");
    return featureRequestsButton.isEnabled();
  }

  public boolean getDiscord() {
    LOG.info("Checking availability of 'discord' button");
    return discordButton.isEnabled();
  }

  public boolean getHelp() {
    LOG.info("Checking availability of 'help' button");
    return helpButton.isEnabled();
  }

  public boolean getBlog() {
    LOG.info("Checking availability of 'blog' button");
    return blogButton.isEnabled();
  }

  public boolean getChangelog() {
    LOG.info("Checking availability of 'changelog' button");
    return changelogButton.isEnabled();
  }

  public boolean getGitHub() {
    LOG.info("Checking availability of 'GitHub' button");
    return gitHubButton.isEnabled();
  }

  public boolean getX() {
    LOG.info("Checking availability of 'X' button");
    return xButton.isEnabled();
  }

  public boolean getNetlify() {
    LOG.info("Checking availability of 'Netlify' button");
    return netlifyButton.isDisplayed() && netlifyButton.isEnabled();
  }

  public boolean getCoveredByArgos() {
    LOG.info("Checking availability of 'coveredByArgos' button");
    return coveredByArgosButton.isEnabled();
  }

  public boolean getPrivacy() {
    LOG.info("Checking availability of 'privacy' button");
    return privacyButton.isEnabled();
  }

  public boolean getTerms() {
    LOG.info("Checking availability of 'Terms' button");
    return termsButton.isEnabled();
  }

  public boolean getCookiePolicy() {
    LOG.info("Checking availability of 'CookiePolicy' button");
    return cookiePolicyButton.isEnabled();
  }

  public boolean getMetaOpenSource() {
    LOG.info("Checking availability of 'MetaOpenSourceLogo' button");
    return metaOpenSourceLogoButton.isEnabled();
  }

  public String metaOpenSourceTransition() {
    LOG.info("Navigating to 'MetaOpenSourceLogo' page");
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    wait.until(ExpectedConditions.elementToBeClickable(metaOpenSourceLogoButton));
    metaOpenSourceLogoButton.click();
    wait.until(ExpectedConditions.urlContains("opensource.fb.com"));
    return driver.getCurrentUrl();
  }

  public String netlifyTransition() {
    LOG.info("Navigating to 'Netlify' page");
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    wait.until(ExpectedConditions.elementToBeClickable(netlifyButton));
    String originalWindow = driver.getWindowHandle();
    netlifyButton.click();
    return switchToNewWindow(driver, originalWindow, "netlify");
  }

  public String argosTransition() {
    LOG.info("Navigating to 'coveredByArgos' page");
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    wait.until(ExpectedConditions.elementToBeClickable(coveredByArgosButton));
    String originalWindow = driver.getWindowHandle();
    coveredByArgosButton.click();
    return switchToNewWindow(driver, originalWindow, "argos");
  }


  public boolean getThreeEightOne() {
    LOG.info("Checking availability of 'threeEightOne' button");
    return threeEightOneButton.isEnabled();
  }

  public boolean getEnglish() {
    LOG.info("Checking availability of 'English' button");
    return englishButton.isEnabled();
  }

  public boolean getGitHubRepository() {
    LOG.info("Checking availability of 'hubRepository' button");
    return gitHubRepository.isEnabled();
  }

  public boolean getSystemMode() {
    LOG.info("Checking availability of 'SystemMode' button");
    return systemModeButton.isEnabled();
  }

  public boolean getSearch() {
    LOG.info("Checking availability of 'search' button");
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
