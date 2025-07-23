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
  @DisplayName("Проверка активности кнопки 'Docusaurus 3.8 is out'")
  public void Docusaurus3IsOutIsActive() {
    Assertions.assertTrue(DocusaurusP.getDocusaurus3IsOut(), "Docusaurus 3.8 is out кнопка не активна");
  }

  @Test
  @DisplayName("Проверка активности кнопки 'Docusaurus'")
  public void DocusaurusIsActive() {
    Assertions.assertTrue(DocusaurusP.getDocusaurus(), "Docusaurus кнопка не активна");
  }

  @Test
  @DisplayName("Проверка активности кнопки 'docs'")
  public void docsIsActive() {
    Assertions.assertTrue(DocusaurusP.getDocs(), "docs кнопка не активна");
  }

  @Test
  @DisplayName("Проверка активности кнопки 'API'")
  public void apiIsActive() {
    Assertions.assertTrue(DocusaurusP.getAPI(), "API кнопка не активна");
  }

  @Test
  @DisplayName("Проверка активности кнопки 'blogUp'")
  public void blogUpIsActive() {
    Assertions.assertTrue(DocusaurusP.getBlogUp(), "blogUp кнопка не активна");
  }

  @Test
  @DisplayName("Проверка активности кнопки 'Showcase'")
  public void showcaseIsActive() {
    Assertions.assertTrue(DocusaurusP.getShowcase(), "Showcase кнопка не активна");
  }

  @Test
  @DisplayName("Проверка активности кнопки 'Community'")
  public void communityIsActive() {
    Assertions.assertTrue(DocusaurusP.getCommunity(), "Community кнопка не активна");
  }

  @Test
  @DisplayName("Проверка активности кнопки 'start'")
  public void startIsActive() {
    Assertions.assertTrue(DocusaurusP.getStart(), "start кнопка не активна");
  }

  @Test
  @DisplayName("Проверка активности кнопки 'tryDemo'")
  public void tryDemoIsActive() {
    Assertions.assertTrue(DocusaurusP.getTryDemo(), "tryDemo кнопка не активна");
  }

  @Test
  @DisplayName("Проверка активности кнопки 'Introduction'")
  public void IntroductionIsActive() {
    Assertions.assertTrue(DocusaurusP.getIntroduction(), "Introduction кнопка не активна");
  }

  @Test
  @DisplayName("Проверка активности кнопки 'started'")
  public void startedIsActive() {
    Assertions.assertTrue(DocusaurusP.getStarted(), "started кнопка не активна");
  }

  @Test
  @DisplayName("Проверка активности кнопки 'installation'")
  public void installationIsActive() {
    Assertions.assertTrue(DocusaurusP.getInstallation(), "installation кнопка не активна");
  }

  @Test
  @DisplayName("Проверка активности кнопки 'migrationFromV1ToV2'")
  public void migrationFromV1ToV2IsActive() {
    Assertions.assertTrue(DocusaurusP.getMigrationFromV1ToV2(), "migrationFromV1ToV2 кнопка не активна");
  }

  @Test
  @DisplayName("Проверка активности кнопки 'stackOverflow'")
  public void stackOverflowIsActive() {
    Assertions.assertTrue(DocusaurusP.getStackOverflow(), "stackOverflow кнопка не активна");
  }

  @Test
  @DisplayName("Проверка активности кнопки 'featureRequests'")
  public void featureRequestsIsActive() {
    Assertions.assertTrue(DocusaurusP.getFeatureRequests(), "featureRequests кнопка не активна");
  }

  @Test
  @DisplayName("Проверка активности кнопки 'discord'")
  public void discordIsActive() {
    Assertions.assertTrue(DocusaurusP.getDiscord(), "discord кнопка не активна");
  }

  @Test
  @DisplayName("Проверка активности кнопки 'help'")
  public void helpIsActive() {
    Assertions.assertTrue(DocusaurusP.getHelp(), "help кнопка не активна");
  }

  @Test
  @DisplayName("Проверка активности кнопки 'blog'")
  public void blogIsActive() {
    Assertions.assertTrue(DocusaurusP.getBlog(), "blog кнопка не активна");
  }

  @Test
  @DisplayName("Проверка активности кнопки 'changelog'")
  public void changelogIsActive() {
    Assertions.assertTrue(DocusaurusP.getChangelog(), "changelog кнопка не активна");
  }

  @Test
  @DisplayName("Проверка активности кнопки 'GitHub'")
  public void gitHubIsActive() {
    Assertions.assertTrue(DocusaurusP.getGitHub(), "GitHub кнопка не активна");
  }

  @Test
  @DisplayName("Проверка активности кнопки 'X'")
  public void xIsActive() {
    Assertions.assertTrue(DocusaurusP.getX(), "X кнопка не активна");
  }

  @Test
  @DisplayName("Проверка активности кнопки 'Netlify'")
  public void netlifyIsActive() {
    Assertions.assertTrue(DocusaurusP.getNetlify(), "Netlify кнопка не активна");
  }

  @Test
  @DisplayName("Проверка активности кнопки 'coveredByArgos'")
  public void coveredByArgosIsActive() {
    Assertions.assertTrue(DocusaurusP.getCoveredByArgos(), "coveredByArgos кнопка не активна");
  }

  @Test
  @DisplayName("Проверка активности кнопки 'privacy'")
  public void privacyIsActive() {
    Assertions.assertTrue(DocusaurusP.getPrivacy(), "privacy кнопка не активна");
  }

  @Test
  @DisplayName("Проверка активности кнопки 'Terms'")
  public void termsIsActive() {
    Assertions.assertTrue(DocusaurusP.getTerms(), "Terms кнопка не активна");
  }

  @Test
  @DisplayName("Проверка активности кнопки 'CookiePolicy'")
  public void cookiePolicyIsActive() {
    Assertions.assertTrue(DocusaurusP.getCookiePolicy(), "CookiePolicy кнопка не активна");
  }

  @Test
  @DisplayName("Проверка активности кнопки 'MetaOpenSourceLogo'")
  public void metaOpenSourceLogoIsActive() {
    Assertions.assertTrue(DocusaurusP.getMetaOpenSource(), "MetaOpenSourceLogo кнопка не активна");
  }

  @Test
  @DisplayName("Проверка перехода на страницу 'MetaOpenSourceLogo'")
  public void metaOpenSourceLogoTest() {
    String expectedUrl = "https://opensource.fb.com/";
    String actualUrl = DocusaurusP.metaOpenSourceTransition();
    assertEquals(expectedUrl, actualUrl, "Итоговый URL не соответствует ожидаемому");
  }

  @Test
  @DisplayName("Проверка перехода на страницу 'Netlify'")
  public void netlifyTest() {
    String expectedUrl = "https://www.netlify.com/";
    String actualUrl = DocusaurusP.netlifyTransition();
    assertEquals(expectedUrl, actualUrl, "Итоговый URL не соответствует ожидаемому");
  }

  @Test
  @DisplayName("Проверка перехода на страницу 'coveredByArgos'")
  public void coveredByArgosTest() {
    String expectedUrl = "https://argos-ci.com/";
    String actualUrl = DocusaurusP.argosTransition();
    assertEquals(expectedUrl, actualUrl, "Итоговый URL не соответствует ожидаемому");
  }

  @Test
  @DisplayName("Проверка активности кнопки 'threeEightOne'")
  public void threeEightOneTest() {
    Assertions.assertTrue(DocusaurusP.getThreeEightOne(), "'threeEightOne'кнопка не активна");
  }

  @Test
  @DisplayName("Проверка активности кнопки 'English'")
  public void englishTest() {
    Assertions.assertTrue(DocusaurusP.getEnglish(), "'English'кнопка не активна");
  }

  @Test
  @DisplayName("Проверка активности кнопки 'hubRepository'")
  public void hubRepositoryTest() {
    Assertions.assertTrue(DocusaurusP.getGitHubRepository(), "'hubRepository'кнопка не активна");
  }

  @Test
  @DisplayName("Проверка активности кнопки 'SystemMode'")
  public void systemModeTest() {
    Assertions.assertTrue(DocusaurusP.getSystemMode(), "'SystemMode'кнопка не активна");
  }

  @Test
  @DisplayName("роверка активности кнопки 'search'")
  public void searchTest() {
    Assertions.assertTrue(DocusaurusP.getSearch(), "'search'кнопка не активна");
  }
}
