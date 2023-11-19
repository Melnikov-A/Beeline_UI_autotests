package beeline.tests;

import beeline.pages.MenuPanelPage;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static io.qameta.allure.Allure.step;

@Owner("Anton Melnikov")
@Feature("Тестирование раздела меню (строк) страницы Билайн Бизнес ")
@Tags({@Tag("ui"), @Tag("lines")})
public class MenuPanelTest extends TestBase {

    MenuPanelPage menuPanelPage = new MenuPanelPage();

    @Test
    @DisplayName("Проверка строк в списке в левой части страницы раздела Билайн Бизнес")
    @Story("Тест на наличие списка строк панели основного меню раздела Билайн Бизнес")
    @Severity(SeverityLevel.BLOCKER)
    public void menuPanelItemsTest() {

        step("Открываем страницу Билайн Бизнес", () -> {
            menuPanelPage.openBusinessMainPage();
        });
        step("Ожидаем загрузку элемента со списком Билайн Бизнес", () -> {
            menuPanelPage.waitForMenuPanel();
        });
        step("Проверка наличия каждой строки в списке", () -> {
            List<String> expectedItems = Arrays.asList(
                    "Популярное",
                    "Связь и интернет",
                    "Облачные технологии",
                    "IT и безопасность",
                    "Рекламные технологии",
                    "Технологии Big Data&AI",
                    "Интернет вещей (IoT)"
            );
            menuPanelPage.verifyMenuItems(expectedItems);
        });
    }
}




