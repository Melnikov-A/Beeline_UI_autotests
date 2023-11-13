package beeline.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MenuPanelPage {

    private final SelenideElement menuPanel = $(By.cssSelector("ul[data-test-id='menuPanel']"));

    public MenuPanelPage openBusinessMainPage() {
        open("/business/main/");
        return this;
    }

    public MenuPanelPage waitForMenuPanel() {
        menuPanel.shouldBe(Condition.visible);
        return this;
    }

    public MenuPanelPage verifyMenuItems(List<String> expectedItems) {
        for (String expectedItem : expectedItems) {
            SelenideElement listItem = menuPanel.$x(".//li[.//*[contains(text(), '" + expectedItem + "')]]");
            listItem.shouldBe(Condition.visible);
            verifyMenuItemClickable(listItem);
        }
        return this;

    }

    public MenuPanelPage verifyMenuItemClickable(SelenideElement menuItem) {
        menuItem.shouldBe(Condition.enabled);
        return this;
    }

}
