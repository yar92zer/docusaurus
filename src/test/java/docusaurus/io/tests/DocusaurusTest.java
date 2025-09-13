package docusaurus.io.tests;

import utils.MyExtensions;
import docusaurus.io.pages.DocusaurusPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MyExtensions.class)
public class DocusaurusTest extends BaseTest {
  private DocusaurusPage docusaurusPage;

  @BeforeEach
  @Override
  public void setUp() {
    super.setUp();
    getDriver().get("https://docusaurus.io/");
    docusaurusPage = new DocusaurusPage(getDriver());
  }

  @Test
  @DisplayName("Check 'Docusaurus 3.8 is out' button activity")
  public void docusaurus3IsOutIsActive() {
    assertTrue(docusaurusPage.getDocusaurus3IsOut(),
      "Docusaurus 3.8 is out button is not active");
  }

  @Test
  @DisplayName("Check 'Docusaurus' button activity")
  public void docusaurusIsActive() {
    assertTrue(docusaurusPage.getDocusaurus(),
      "Docusaurus button is not active");
  }

  @Test
  @DisplayName("Check 'docs' button activity")
  public void docsIsActive() {
    assertTrue(docusaurusPage.getDocs(), "docs button is not active");
  }

  @Test
  @DisplayName("Check 'API' button activity")
  public void apiIsActive() {
    assertTrue(docusaurusPage.getAPI(), "API button is not active");
  }

  @Test
  @DisplayName("Check 'blogUp' button activity")
  public void blogUpIsActive() {
    assertTrue(docusaurusPage.getBlogUp(),
      "blogUp button is not active");
  }

  @Test
  @DisplayName("Check 'Showcase' button activity")
  public void showcaseIsActive() {
    assertTrue(docusaurusPage.getShowcase(),
      "Showcase button is not active");
  }

  @Test
  @DisplayName("Check 'Community' button activity")
  public void communityIsActive() {
    assertTrue(docusaurusPage.getCommunity(),
      "Community button is not active");
  }

  @Test
  @DisplayName("Check 'start' button activity")
  public void startIsActive() {
    assertTrue(docusaurusPage.getStart(), "start button is not active");
  }

  @Test
  @DisplayName("Check 'tryDemo' button activity")
  public void tryDemoIsActive() {
    assertTrue(docusaurusPage.getTryDemo(),
      "tryDemo button is not active");
  }

  @Test
  @DisplayName("Check 'Introduction' button activity")
  public void introductionIsActive() {
    assertTrue(docusaurusPage.getIntroduction(),
      "Introduction button is not active");
  }

  @Test
  @DisplayName("Check 'started' button activity")
  public void startedIsActive() {
    assertTrue(docusaurusPage.getStarted(),
      "started button is not active");
  }

  @Test
  @DisplayName("Check 'installation' button activity")
  public void installationIsActive() {
    assertTrue(docusaurusPage.getInstallation(),
      "installation button is not active");
  }

  @Test
  @DisplayName("Check 'migrationFromV1ToV2' button activity")
  public void migrationFromV1ToV2IsActive() {
    assertTrue(docusaurusPage.getMigrationFromV1ToV2(),
      "migrationFromV1ToV2 button is not active");
  }

  @Test
  @DisplayName("Check 'stackOverflow' button activity")
  public void stackOverflowIsActive() {
    assertTrue(docusaurusPage.getStackOverflow(),
      "stackOverflow button is not active");
  }

  @Test
  @DisplayName("Check 'featureRequests' button activity")
  public void featureRequestsIsActive() {
    assertTrue(docusaurusPage.getFeatureRequests(),
      "featureRequests button is not active");
  }

  @Test
  @DisplayName("Check 'discord' button activity")
  public void discordIsActive() {
    assertTrue(docusaurusPage.getDiscord(),
      "discord button is not active");
  }

  @Test
  @DisplayName("Check 'help' button activity")
  public void helpIsActive() {
    assertTrue(docusaurusPage.getHelp(), "help button is not active");
  }

  @Test
  @DisplayName("Check 'blog' button activity")
  public void blogIsActive() {
    assertTrue(docusaurusPage.getBlog(), "blog button is not active");
  }

  @Test
  @DisplayName("Check 'changelog' button activity")
  public void changelogIsActive() {
    assertTrue(docusaurusPage.getChangelog(),
      "changelog button is not active");
  }

  @Test
  @DisplayName("Check 'GitHub' button activity")
  public void gitHubIsActive() {
    assertTrue(docusaurusPage.getGitHub(),
      "GitHub button is not active");
  }

  @Test
  @DisplayName("Check 'X' button activity")
  public void xIsActive() {
    assertTrue(docusaurusPage.getX(), "X button is not active");
  }

  @Test
  @DisplayName("Check 'Netlify' button activity")
  public void netlifyIsActive() {
    assertTrue(docusaurusPage.getNetlify(),
      "Netlify button is not active");
  }

  @Test
  @DisplayName("Check 'coveredByArgos' button activity")
  public void coveredByArgosIsActive() {
    assertTrue(docusaurusPage.getCoveredByArgos(),
      "coveredByArgos button is not active");
  }

  @Test
  @DisplayName("Check 'privacy' button activity")
  public void privacyIsActive() {
    assertTrue(docusaurusPage.getPrivacy(),
      "privacy button is not active");
  }

  @Test
  @DisplayName("Check 'Terms' button activity")
  public void termsIsActive() {
    assertTrue(docusaurusPage.getTerms(), "Terms button is not active");
  }

  @Test
  @DisplayName("Check 'CookiePolicy' button activity")
  public void cookiePolicyIsActive() {
    assertTrue(docusaurusPage.getCookiePolicy(),
      "CookiePolicy button is not active");
  }

  @Test
  @DisplayName("Check 'MetaOpenSourceLogo' button activity")
  public void metaOpenSourceLogoIsActive() {
    assertTrue(docusaurusPage.getMetaOpenSource(),
      "MetaOpenSourceLogo button is not active");
  }

  @Test
  @DisplayName("Check 'threeEightOne' button activity")
  public void threeEightOneTest() {
    assertTrue(docusaurusPage.getThreeEightOne(),
      "'threeEightOne' button is not active");
  }

  @Test
  @DisplayName("Check 'English' button activity")
  public void englishTest() {
    assertTrue(docusaurusPage.getEnglish(),
      "'English' button is not active");
  }

  @Test
  @DisplayName("Check 'hubRepository' button activity")
  public void hubRepositoryTest() {
    assertTrue(docusaurusPage.getGitHubRepository(),
      "'hubRepository' button is not active");
  }

  @Test
  @DisplayName("Check 'SystemMode' button activity")
  public void systemModeTest() {
    assertTrue(docusaurusPage.getSystemMode(),
      "'SystemMode' button is not active");
  }

  @Test
  @DisplayName("Check 'search' button activity")
  public void searchTest() {
    assertTrue(docusaurusPage.getSearch(),
      "'search' button is not active");
  }

  @Test
  @DisplayName("Check navigation to 'MetaOpenSourceLogo' page")
  public void metaOpenSourceLogoTest() {
    String expectedUrl = "https://opensource.fb.com/";
    String actualUrl = docusaurusPage.metaOpenSourceTransition();
    assertTrue(actualUrl.startsWith(expectedUrl),
      "Actual URL '" + actualUrl +
        "' does not start with expected URL " + "'" + expectedUrl + "'");
  }

  @Test
  @DisplayName("Check navigation to 'Netlify' page")
  public void netlifyTest() {
    String expectedUrl = "https://www.netlify.com/";
    String actualUrl = docusaurusPage.netlifyTransition();
    assertTrue(actualUrl.startsWith(expectedUrl),
      "Actual URL '" + actualUrl +
        "' does not start with expected URL '" + expectedUrl + "'");
  }

  @Test
  @DisplayName("Check navigation to 'coveredByArgos' page")
  public void coveredByArgosTest() {
    String actualUrl = docusaurusPage.argosTransition();
    assertTrue(actualUrl.contains("argos"),
      "Actual URL '" + actualUrl + "' does not contain 'argos'");
  }
}
