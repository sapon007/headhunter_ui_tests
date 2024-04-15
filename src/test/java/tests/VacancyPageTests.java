package tests;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.VacancyPage;

public class VacancyPageTests extends BaseTest {
    private VacancyPage vacancyPage = new VacancyPage();

    @Test
    @Feature("Страница вакансии")
    @DisplayName("Проверка страницы вакансии.")
    public void vacancyPageTest() {
        vacancyPage
                .openPage(96622152)
                .checkVacancyTitle("QA инженер в команду GEO")
                .checkVacancySalary("от 250 000 ₽ до вычета налогов")
                .checkVacancyExperience("1–3 года");
    }
}
