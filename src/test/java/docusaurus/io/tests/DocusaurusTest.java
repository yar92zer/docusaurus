package docusaurus.io.tests;

import docusaurus.io.MyExtensions;
import docusaurus.io.pages.DocusaurusPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MyExtensions.class)
public class DocusaurusTest extends BaseTest {
  private DocusaurusPage DocusaurusP;

  @BeforeEach
  @Override
  public void setUp() {
    super.setUp();
    getDriver().get("https://docusaurus.io/");
    DocusaurusP = new DocusaurusPage(getDriver());
  }

  @Test
  @DisplayName("Check 'Docusaurus 3.8 is out' button activity")
  public void Docusaurus3IsOutIsActive() {
    Assertions.assertTrue(DocusaurusP.getDocusaurus3IsOut(), "Docusaurus 3.8 is out button is not active");
  }

  @Test
  @DisplayName("Check 'Docusaurus' button activity")
  public void DocusaurusIsActive() {
    Assertions.assertTrue(DocusaurusP.getDocusaurus(), "Docusaurus button is not active");
  }

  @Test
  @DisplayName("Check 'docs' button activity")
  public void docsIsActive() {
    Assertions.assertTrue(DocusaurusP.getDocs(), "docs button is not active");
  }

  @Test
  @DisplayName("Check 'API' button activity")
  public void apiIsActive() {
    Assertions.assertTrue(DocusaurusP.getAPI(), "API button is not active");
  }

  @Test
  @DisplayName("Check 'blogUp' button activity")
  public void blogUpIsActive() {
    Assertions.assertTrue(DocusaurusP.getBlogUp(), "blogUp button is not active");
  }

  @Test
  @DisplayName("Check 'Showcase' button activity")
  public void showcaseIsActive() {
    Assertions.assertTrue(DocusaurusP.getShowcase(), "Showcase button is not active");
  }

  @Test
  @DisplayName("Check 'Community' button activity")
  public void communityIsActive() {
    Assertions.assertTrue(DocusaurusP.getCommunity(), "Community button is not active");
  }

  @Test
  @DisplayName("Check 'start' button activity")
  public void startIsActive() {
    Assertions.assertTrue(DocusaurusP.getStart(), "start button is not active");
  }

  @Test
  @DisplayName("Check 'tryDemo' button activity")
  public void tryDemoIsActive() {
    Assertions.assertTrue(DocusaurusP.getTryDemo(), "tryDemo button is not active");
  }

  @Test
  @DisplayName("Check 'Introduction' button activity")
  public void IntroductionIsActive() {
    Assertions.assertTrue(DocusaurusP.getIntroduction(), "Introduction button is not active");
  }

  @Test
  @DisplayName("Check 'started' button activity")
  public void startedIsActive() {
    Assertions.assertTrue(DocusaurusP.getStarted(), "started button is not active");
  }

  @Test
  @DisplayName("Check 'installation' button activity")
  public void installationIsActive() {
    Assertions.assertTrue(DocusaurusP.getInstallation(), "installation button is not active");
  }

  @Test
  @DisplayName("Check 'migrationFromV1ToV2' button activity")
  public void migrationFromV1ToV2IsActive() {
    Assertions.assertTrue(DocusaurusP.getMigrationFromV1ToV2(), "migrationFromV1ToV2 button is not active");
  }

  @Test
  @DisplayName("Check 'stackOverflow' button activity")
  public void stackOverflowIsActive() {
    Assertions.assertTrue(DocusaurusP.getStackOverflow(), "stackOverflow button is not active");
  }

  @Test
  @DisplayName("Check 'featureRequests' button activity")
  public void featureRequestsIsActive() {
    Assertions.assertTrue(DocusaurusP.getFeatureRequests(), "featureRequests button is not active");
  }

  @Test
  @DisplayName("Check 'discord' button activity")
  public void discordIsActive() {
    Assertions.assertTrue(DocusaurusP.getDiscord(), "discord button is not active");
  }

  @Test
  @DisplayName("Check 'help' button activity")
  public void helpIsActive() {
    Assertions.assertTrue(DocusaurusP.getHelp(), "help button is not active");
  }

  @Test
  @DisplayName("Check 'blog' button activity")
  public void blogIsActive() {
    Assertions.assertTrue(DocusaurusP.getBlog(), "blog button is not active");
  }

  @Test
  @DisplayName("Check 'changelog' button activity")
  public void changelogIsActive() {
    Assertions.assertTrue(DocusaurusP.getChangelog(), "changelog button is not active");
  }

  @Test
  @DisplayName("Check 'GitHub' button activity")
  public void gitHubIsActive() {
    Assertions.assertTrue(DocusaurusP.getGitHub(), "GitHub button is not active");
  }

  @Test
  @DisplayName("Check 'X' button activity")
  public void xIsActive() {
    Assertions.assertTrue(DocusaurusP.getX(), "X button is not active");
  }

  @Test
  @DisplayName("Check 'Netlify' button activity")
  public void netlifyIsActive() {
    Assertions.assertTrue(DocusaurusP.getNetlify(), "Netlify button is not active");
  }

  @Test
  @DisplayName("Check 'coveredByArgos' button activity")
  public void coveredByArgosIsActive() {
    Assertions.assertTrue(DocusaurusP.getCoveredByArgos(), "coveredByArgos button is not active");
  }

  @Test
  @DisplayName("Check 'privacy' button activity")
  public void privacyIsActive() {
    Assertions.assertTrue(DocusaurusP.getPrivacy(), "privacy button is not active");
  }

  @Test
  @DisplayName("Check 'Terms' button activity")
  public void termsIsActive() {
    Assertions.assertTrue(DocusaurusP.getTerms(), "Terms button is not active");
  }

  @Test
  @DisplayName("Check 'CookiePolicy' button activity")
  public void cookiePolicyIsActive() {
    Assertions.assertTrue(DocusaurusP.getCookiePolicy(), "CookiePolicy button is not active");
  }

  @Test
  @DisplayName("Check 'MetaOpenSourceLogo' button activity")
  public void metaOpenSourceLogoIsActive() {
    Assertions.assertTrue(DocusaurusP.getMetaOpenSource(), "MetaOpenSourceLogo button is not active");
  }

  @Test
  @DisplayName("Check navigation to 'MetaOpenSourceLogo' page")
  public void metaOpenSourceLogoTest() {
    String expectedUrl = "https://opensource.fb.com/";
    String actualUrl = DocusaurusP.metaOpenSourceTransition();
    assertEquals(expectedUrl, actualUrl, "Actual URL does not match expected URL");
  }

  @Test
  @DisplayName("Check navigation to 'Netlify' page")
  public void netlifyTest() {
    String expectedUrl = "https://www.netlify.com/";
    String actualUrl = DocusaurusP.netlifyTransition();
    assertEquals(expectedUrl, actualUrl, "Actual URL does not match expected URL");
  }

  @Test
  @DisplayName("Check navigation to 'coveredByArgos' page")
  public void coveredByArgosTest() {
    String expectedUrl = "https://argos-ci.com/";
    String actualUrl = DocusaurusP.argosTransition();
    assertEquals(expectedUrl, actualUrl, "Actual URL does not match expected URL");
  }

  @Test
  @DisplayName("Check 'threeEightOne' button activity")
  public void threeEightOneTest() {
    Assertions.assertTrue(DocusaurusP.getThreeEightOne(), "'threeEightOne' button is not active");
  }

  @Test
  @DisplayName("Check 'English' button activity")
  public void englishTest() {
    Assertions.assertTrue(DocusaurusP.getEnglish(), "'English' button is not active");
  }

  @Test
  @DisplayName("Check 'hubRepository' button activity")
  public void hubRepositoryTest() {
    Assertions.assertTrue(DocusaurusP.getGitHubRepository(), "'hubRepository' button is not active");
  }

  @Test
  @DisplayName("Check 'SystemMode' button activity")
  public void systemModeTest() {
    Assertions.assertTrue(DocusaurusP.getSystemMode(), "'SystemMode' button is not active");
  }

  @Test
  @DisplayName("Check 'search' button activity")
  public void searchTest() {
    Assertions.assertTrue(DocusaurusP.getSearch(), "'search' button is not active");
  }
}
