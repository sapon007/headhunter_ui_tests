package tests;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pages.MainPage;
import pages.VacanciesPage;

public class SearchOnMainPageTests extends BaseTest {
    private MainPage mainPage = new MainPage();
    private VacanciesPage vacanciesPage = new VacanciesPage();

    @Feature("Поиск на главной")
    @DisplayName("Проверка основного поиска по вакансиям.")
    @ValueSource(strings = {
            "тестировщик",
            "разработчик",
            "водитель"
    })
    @ParameterizedTest(name = " Запрос: {0}")
    public void searchOnMainPageTest(String searchQuery) {
        mainPage.openPage()
                .setSearchQuery(searchQuery)
                .clickOnTheSearchButton()
                .closeModal();
        vacanciesPage
                .checkSearchInputValue(searchQuery)
                .checkThatResultContainQuery(searchQuery);
    }
}
