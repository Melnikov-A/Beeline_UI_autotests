package beeline.tests;

import beeline.config.WebConfig;
import beeline.config.WebDriverProvider;
import beeline.helpers.Attach;
import beeline.pages.*;
import beeline.utils.RandomUtils;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.closeWebDriver;


public class TestBase {
    TestData testData = new TestData();
    BasketPage basketPage = new BasketPage();
    BusinessLocalPage businessLocalPage = new BusinessLocalPage();
    FilesPage filesPage = new FilesPage();
    MenuPanelPage menuPanelPage = new MenuPanelPage();
    ProductPage productPage = new ProductPage();
    ServicesPage servicesPage = new ServicesPage();
    ShopSearchPage shopSearchPage = new ShopSearchPage();
    RandomUtils randomUtils = new RandomUtils();

    private static WebConfig config;

    @BeforeAll
    static void beforeAll() {
        config = ConfigFactory.create(WebConfig.class, System.getProperties());
        WebDriverProvider webConfig = new WebDriverProvider(config);
        webConfig.setUp();
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        if (config.isRemote()) {
            Attach.addVideo();
        }

        closeWebDriver();
    }

}
