package pages;

import com.codeborne.selenide.SelenideElement;
import helpers.Attachments;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VacanciesPage {
    private Attachments attachments = new Attachments();

    private static final SelenideElement
            searchInput = $("[data-qa=search-input]"),
            vacancyResults = $("[data-qa=vacancy-serp__results]");

    @Step("Проверить, что поле поиска имеет значение")
    public VacanciesPage checkSearchInputValue(String value) {
        assertEquals(value, searchInput.getValue());
        return this;
    }

    @Step("Проверить, что в блоке с результатами есть наш запрос")
    public void checkThatResultContainQuery(String query) {
        vacancyResults.shouldHave(text(query));
        attachments.takeScreenshot();
    }
}
