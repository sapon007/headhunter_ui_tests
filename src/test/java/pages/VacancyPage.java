package pages;

import com.codeborne.selenide.SelenideElement;
import helpers.Attachments;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class VacancyPage {
    private static final SelenideElement
            vacancyTitle = $("[data-qa=vacancy-title]"),
            vacancySalary = $("[data-qa=vacancy-salary]"),
            vacancyExperience = $("[data-qa=vacancy-experience]");

    private Attachments attachments = new Attachments();

    @Step("Открыть страницу с вакансией")
    public VacancyPage openPage(int vacancyId) {
        open("/vacancy/" + vacancyId);
        attachments.takeScreenshot();
        return this;
    }

    @Step("Проверить название вакансии")
    public VacancyPage checkVacancyTitle(String title) {
        vacancyTitle.shouldHave(text(title));
        return this;
    }

    @Step("Проверить указанную зарплату")
    public VacancyPage checkVacancySalary(String salary) {
        vacancySalary.shouldHave(text(salary));
        return this;
    }

    @Step("Проверить указанный опыт работы")
    public VacancyPage checkVacancyExperience(String experience) {
        vacancyExperience.shouldHave(text(experience));
        return this;
    }
}
