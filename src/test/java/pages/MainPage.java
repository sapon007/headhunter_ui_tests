package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {
    private static final SelenideElement
            mainSearch = $("[data-qa=search-input]"),
            searchButton = $("[data-qa=search-button]"),
            modalClose = $("[data-qa=bloko-modal-close]");

    @Step("Открыть главную страницу")
    public MainPage openPage() {
        open("/");
        return this;
    }

    @Step("Ввести поисковый запрос")
    public MainPage setSearchQuery(String value) {
        mainSearch.setValue(value);
        return this;
    }

    @Step("Нажать на кнопку \"Найти работу\"")
    public void clickOnTheSearchButton() {
        searchButton.click();
    }

    public void closeModal() {
        modalClose.click();
    }
}
